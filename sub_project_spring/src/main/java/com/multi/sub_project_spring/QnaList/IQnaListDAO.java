package com.multi.sub_project_spring.QnaList;

import java.util.ArrayList;

public interface IQnaListDAO {

	ArrayList<QnaListVO> qnaList();
	QnaListVO qnadetailview(int hostqnaNo, String memNick);
	void qnainsert(QnaListVO qna);
	void qnadelete(int hostqnaNo);
	void qnaupdate(QnaListVO qna);

}
