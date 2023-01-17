package com.spring.javawspring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MessageController {
	
	@RequestMapping(value="/msg/{msgFlag}", method=RequestMethod.GET)
	public String msgGet(@PathVariable String msgFlag, Model model,
			@RequestParam(value="mid", defaultValue = "", required = false) String mid,
			@RequestParam(value="flag", defaultValue = "", required = false) String flag) {
		
		if(msgFlag.equals("memberLoginOk")) {
			model.addAttribute("msg", mid + "님 로그인 되었습니다.");
			model.addAttribute("url", "member/memberMain");
		}
		else if(msgFlag.equals("memberLogout")) {
			model.addAttribute("msg", mid + "님 로그아웃 되셨습니다.");
			model.addAttribute("url", "member/memberLogin");
		}
		else if(msgFlag.equals("memberLoginNo")) {
			model.addAttribute("msg", "로그인 실패~~");
			model.addAttribute("url", "member/memberLogin");
		}
		else if(msgFlag.equals("guestInputOk")) {
			model.addAttribute("msg", "방명록에 글이 등록되었습니다.");
			model.addAttribute("url", "guest/guestList");
		}
		else if(msgFlag.equals("memberJoinOk")) {
			model.addAttribute("msg", "회원 가입 완료!!");
			model.addAttribute("url", "member/memberLogin");
		}
		else if(msgFlag.equals("memberIdCheckNo")) {
			model.addAttribute("msg", "중복된 아이디 입니다.");
			model.addAttribute("url", "member/memberJoin");
		}
		else if(msgFlag.equals("memberNickNameCheckNo")) {
			model.addAttribute("msg", "중복된 닉네임 입니다.");
			model.addAttribute("url", "member/memberJoin");
		}
		else if(msgFlag.equals("memberNickNameCheckNo2")) {
			model.addAttribute("msg", "중복된 닉네임 입니다.");
			model.addAttribute("url", "member/memberPwdUpdate");
		}
		else if(msgFlag.equals("adminNo")) {
			model.addAttribute("msg", "관리자가 아니시군요...");
			model.addAttribute("url", "member/memberLogin");
		}
		else if(msgFlag.equals("memberNo")) {
			model.addAttribute("msg", "로그인후 사용하세요");
			model.addAttribute("url", "member/memberLogin");
		}
		else if(msgFlag.equals("levelCheckNo")) {
			model.addAttribute("msg", "등급을 확인하세요");
			model.addAttribute("url", "member/memberMain");
		}
		else if(msgFlag.equals("mailSendOk")) {
			model.addAttribute("msg", "메일을 정상적으로 전송했습니다.");
			model.addAttribute("url", "study/mail/mailForm");
		}
		else if(msgFlag.equals("memberImsiPwdOk")) {
			model.addAttribute("msg", "임시비밀번호를 발송하였습니다.\\n메일을 확인하세요.");
			model.addAttribute("url", "member/memberLogin");
		}
		else if(msgFlag.equals("memberImsiPwdNo")) {
			model.addAttribute("msg", "아이디와 이메일주소를 확인해 주세요~~");
			model.addAttribute("url", "member/memberPwdSearch");
		}
		else if(msgFlag.equals("memberPwdUpdateOk")) {
			model.addAttribute("msg", "비밀번호가 변경되었습니다.");
			model.addAttribute("url", "member/memberMain");
		}
		else if(msgFlag.equals("fileUploadOk")) {
			model.addAttribute("msg", "파일이 업로드 되었습니다.");
			model.addAttribute("url", "study/fileUpload/fileUploadForm");
		}
		else if(msgFlag.equals("fileUploadNo")) {
			model.addAttribute("msg", "파일이 업로드 실패~~");
			model.addAttribute("url", "study/fileUpload/fileUploadForm");
		}
		else if(msgFlag.equals("memberPwdCheckNo")) {
			model.addAttribute("msg", "비밀번호가 틀립니다. 확인해 보세요.");
			model.addAttribute("url", "member/memberPwdUpdate?flag=pwdCheck");
		}
		else if(msgFlag.equals("memberPwdCheckNo")) {
			model.addAttribute("msg", "비밀번호가 틀립니다. 확인해 보세요.");
			model.addAttribute("url", "member/memberPwdUpdate?flag=pwdCheck");
		}
		else if(msgFlag.equals("memberUpdateOk")) {
			model.addAttribute("msg", "회원 정보가 수정되었습니다.");
			model.addAttribute("url", "member/memberMain");
		}
		else if(msgFlag.equals("memberUpdateNo")) {
			model.addAttribute("msg", "회원 정보 수정실패~~");
			model.addAttribute("url", "member/memberPwdUpdate?flag=pwdCheck");
		}
		else if(msgFlag.equals("memberDeleteOk")) {
			model.addAttribute("msg", mid+"님 회원에서 탈퇴되었습니다.\\n같은 아이디로 1달이내 재가입 하실수 없습니다.");
			model.addAttribute("url", "member/memberLogin");
		}
		else if(msgFlag.equals("boardInputOk")) {
			model.addAttribute("msg", "게시글이 등록되었습니다.");
			model.addAttribute("url", "board/boardList");
		}
		else if(msgFlag.equals("boardInputNo")) {
			model.addAttribute("msg", "게시글이 등록되었습니다.");
			model.addAttribute("url", "board/boardInput");
		}
		else if(msgFlag.equals("boardDeleteOk")) {
			model.addAttribute("msg", "게시글이 삭제되었습니다.");
			model.addAttribute("url", "board/boardList"+flag);
		}
		else if(msgFlag.equals("boardUpdateOk")) {
			model.addAttribute("msg", "게시글이 수정되었습니다.");
			model.addAttribute("url", "board/boardList"+flag);
		}
		
		
		return "include/message";
	}
}
