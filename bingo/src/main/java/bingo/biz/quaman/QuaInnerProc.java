package bingo.biz.quaman;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import bingo.asp.ASPBlock;
import bingo.asp.ASPCommandBar;
import bingo.asp.ASPField;
import bingo.asp.ASPManager;
import bingo.asp.ASPPageProvider;
import bingo.asp.ASPRowSet;
import bingo.asp.layout.ASPBlockLayout;

public class QuaInnerProc extends ASPPageProvider{
   private final ASPManager mgr;
   
   private ASPBlock headblk;
   private ASPRowSet headset;
   private ASPCommandBar headbar;
   private ASPBlockLayout headlay;
   
   
   
   private static final Logger logger = LoggerFactory.getLogger(QuaInnerProc.class);
   public QuaInnerProc(ASPManager manager, String pagePath) {
      super(manager, pagePath);
      mgr = manager;
   }
   
   public void run(){
      logger.info(this.getClass() + ".run()");

      
      
   }
   
   public void definePage(){
      
      int charlength10 = 10;
      int charlength120 = 120;
      
      headblk = mgr.newASPBlock("MAIN","QUA_INNER_PROC");
      headblk.addField("OBJID").
              setHidden();
      headblk.addField("OBJVERSION").
              setHidden();
      headblk.addField("OBJSTATE").
              setHidden();
      headblk.addField("OBJEVENTS").
              setHidden();
      headblk.addField("DI_KEYS").setFunction("''").
      setHidden(); 
      
      headblk.addField("NUM_1",ASPField.DATATYPE.number).setFunction("''").
      setHidden();
      
      //#1
      headblk.addField("PROC_REVIEW_CODE").
      setReadonly().
      setLabel("QUAINNERPROCPROCREVIEWCODE: Proc Review Code").
      setSize(charlength10);
      
      headblk.addField("PLAN_CODE").
      setReadonly().
      setLabel("QUAINNERPROCPLANCODE: Plan Code").
      setSize(charlength10);
      
      headblk.addField("PROC_CODE").
      setReadonly().
      setLabel("QUAINNERPROCPROCCODE: Proc Code").
      setSize(charlength10);
      
      headblk.addField("PROC_CODE_B").
      setReadonly().
      setLabel("QUAINNERPROCPROCCODEB: Proc CodeB").
      setSize(charlength10).setHidden();
      
      headblk.addField("REV").
      setReadonly().
      setLabel("QUAINNERPROCREV: Rev").
      setSize(charlength10);
      
      headblk.addField("PROC_TITLE").
      setReadonly().
      setMandatory().
      setLabel("QUAINNERPROCPROCTITLE: Proc Title").
      setSize(charlength120);
      
      headblk.addField("OUT_PROC_CODE").
      setInsertable().
      setLabel("QUAINNERPROCOUTPROCCODE: AP1000 Code").
      setSize(charlength10);
      
      headblk.addField("ORIG_PROC_CODE").
      setReadonly().
      setLabel("QUAINNERPROCORIGPROCCODE: Orig Proc Code").
      setSize(charlength10);
      
      headblk.addField("ORIG_REV").
      setReadonly().
      setLabel("QUAINNERPROCORIGREV: Orig Rev").
      setSize(charlength10);
      
      headblk.addField("PROC_PLAN_TYPE").
      setType(ASPField.TYPE.select).
      setOptions("Qua_Proc_Plan_Type_API").
      setReadonly().
      setLabel("QUAINNERPROCPROCPLANTYPE: Proc Plan Type").
      setSize(charlength10);
      headblk.addField("PROC_PLAN_TYPE_DB").setReadonly().setHidden();
      
      headblk.addField("PROC_TYPE").
      setType(ASPField.TYPE.select).
      setOptions("Qua_Proc_Type_API").
      setReadonly().
      setLabel("QUAINNERPROCPROCTYPE: Proc Type").
      setSize(charlength10);
      headblk.addField("PROC_TYPE_DB").setReadonly().setHidden();
      
      headblk.addField("OUTLINE_TYPE").
      setType(ASPField.TYPE.select).
      setOptions("Qua_Outline_Type_API").
      setReadonly().
      setLabel("QUAINNERPROCOUTLINETYPE: Outline Type").
      setSize(charlength10);
      headblk.addField("OUTLINE_TYPE_DB").setReadonly().setHidden();
      
      headblk.addField("PROC_FILE_TYPE").
      setType(ASPField.TYPE.select).
      setOptions("Qua_Proc_File_Type_API").
      setReadonly().
      setLabel("QUAINNERPROCPROCFILETYPE: Proc File Type").
      setSize(charlength10);
      headblk.addField("PROC_FILE_TYPE_DB").setReadonly().setHidden();
      
      headblk.addField("PLAN_RELEASE_DATE",ASPField.DATATYPE.date).
      setReadonly().
      setLabel("QUAINNERPROCPLANRELEASEDATE: Plan Release Date").
      setSize(charlength10);
      
      headblk.addField("RELEASE_DATE", ASPField.DATATYPE.date).
      setReadonly().
      setLabel("QUAINNERPROCRELEASEDATE: Release Date").
      setSize(charlength10);
      
      headblk.addField("PAGES", ASPField.DATATYPE.number).
      setInsertable().
      setLabel("QUAINNERPROCPAGES: Pages").
      setSize(charlength10);
      
      headblk.addField("VIEW_FILE").
      setFunction("''").
      setReadonly();
      
      headblk.addField("RES_DEPT").
      setReadonly().
      setLabel("QUAINNERPROCRESDEPT: Res Dept").
      setSize(charlength10).
      setLov("GENERAL_DEPARTMENT_LOV");
      
      headblk.addField("RES_DEPT_DESC").
      setFunction("GENERAL_ORGANIZATION_API.Get_Org_Desc(:RES_DEPT)").
      setReadonly().
      setLabel("QUAINNERPROCRESDEPTDESC: Res Dept Desc").
      setSize(charlength10);
      mgr.getASPField("RES_DEPT").setValidation("RES_DEPT_DESC");
      
      
      headblk.addField("RES_PERSON").
      setReadonly().
      setLabel("QUAINNERPROCRESPERSON: Res Person").
      setSize(charlength10).
      setLov("PERSON_INFO_USER");
      
      headblk.addField("RES_PERSON_NAME").
      setFunction("Fnd_User_Api.Get_Description(:RES_PERSON)").
      setReadonly().
      setLabel("QUAINNERPROCRESPERSONNAME: Res Person Name").
      setSize(charlength10);
      mgr.getASPField("RES_PERSON").setValidation("RES_PERSON_NAME");
      
      //#2
      headblk.addField("PROJ_NO").
      setReadonly().
      setLabel("QUAINNERPROCPROJNO: Proj No").
      setSize(charlength10).
      setLov("GENERAL_PROJECT");
      
      headblk.addField("PROJ_NAME").
      setFunction("GENERAL_PROJECT_API.GET_PROJ_DESC(:PROJ_NO)").
      setReadonly().
      setLabel("QUAINNERPROCPROJNAME: Proj Name").
      setSize(charlength10);
      mgr.getASPField("PROJ_NO").setValidation("PROJ_NAME");
      
      headblk.addField("DRAFT_DEPT").
      setInsertable().
      setLabel("QUAINNERPROCDRAFTDEPT: Draft Dept").
      setSize(charlength10).
      setLov("GENERAL_DEPARTMENT_LOV");
      
      headblk.addField("DRAFT_DEPT_DESC").
      setFunction("GENERAL_ORGANIZATION_API.Get_Org_Desc(:DRAFT_DEPT)").
      setReadonly().
      setLabel("QUAINNERPROCDRAFTDEPTDESC: Draft Dept Desc").
      setSize(charlength10);
      mgr.getASPField("DRAFT_DEPT").setValidation("DRAFT_DEPT_DESC");
      
      headblk.addField("DRAFT_PERSON").
      setReadonly().
      setLabel("QUAINNERPROCDRAFTPERSON: Draft Person").
      setSize(charlength10).
      setLov("PERSON_INFO_USER");
      
      headblk.addField("DRAFT_PERSON_NAME").
      setFunction("Fnd_User_Api.Get_Description(:DRAFT_PERSON)").
      setReadonly().
      setLabel("QUAINNERPROCDRAFTPERSONNAME: Draft Person Name").
      setSize(charlength10);
      mgr.getASPField("DRAFT_PERSON").setValidation("DRAFT_PERSON_NAME");
      
      headblk.addField("DRAFT_DATE",ASPField.DATATYPE.date).
      setReadonly().
      setLabel("QUAINNERPROCDRAFTDATE: Draft Date").
      setSize(charlength10);
      
      
      headblk.addField("AUDITOR").
      setReadonly().
      setLabel("QUAINNERPROCAUDITOR: Auditor").
      setSize(charlength10).
      setLov("PERSON_INFO_USER");
      
      headblk.addField("AUDITOR_NAME").
      setFunction("Fnd_User_Api.Get_Description(:AUDITOR)").
      setReadonly().
      setLabel("QUAINNERPROCAUDITORNAME: Auditor Name").
      setSize(charlength10);
      mgr.getASPField("AUDITOR").setValidation("AUDITOR_NAME");
      
      headblk.addField("AUDIT_DATE", ASPField.DATATYPE.date).
      setReadonly().
      setLabel("QUAINNERPROCAUDITDATE: Audit Date").
      setSize(charlength10);
      
      headblk.addField("APPROVER").
      setReadonly().
      setLabel("QUAINNERPROCAPPROVER: Approver").
      setSize(charlength10).
      setLov("PERSON_INFO_USER");
      
      headblk.addField("APPROVER_NAME").
      setFunction("Fnd_User_Api.Get_Description(:APPROVER)").
      setReadonly().
      setLabel("QUAINNERPROCAPPROVERNAME: Approver Name").
      setSize(charlength10);
      mgr.getASPField("APPROVER").setValidation("APPROVER_NAME");
      
      headblk.addField("APPROVE_DATE", ASPField.DATATYPE.date).
      setReadonly().
      setLabel("QUAINNERPROCAPPROVEDATE: Approve Date").
      setSize(charlength10);
      
      headblk.addField("QUA_CHECK_PERSON").
      setReadonly().
      setLabel("QUAINNERPROCQUACHECKPERSON: Qua Check Person").
      setSize(charlength10).
      setLov("PERSON_INFO_USER");
      
      headblk.addField("QUA_CHECK_PERSON_NAME").
      setFunction("Fnd_User_Api.Get_Description(:QUA_CHECK_PERSON)").
      setReadonly().
      setLabel("QUAINNERPROCQUACHECKPERSON: Qua Check Person Name").
      setSize(charlength10);
      mgr.getASPField("QUA_CHECK_PERSON").setValidation("QUA_CHECK_PERSON_NAME");
      
      headblk.addField("QUA_CHECK_DATE", ASPField.DATATYPE.date).
      setReadonly().
      setLabel("QUAINNERPROCQUACHECKDATE: Qua Check Date").
      setSize(charlength10);
      
      //Hidden Field 
      headblk.addField("DOC_CLASS").
      setInsertable().
      setLabel("QUAINNERPROCDOCCLASS: Doc Class").
      setSize(charlength10).
      setHidden();
      
      headblk.addField("DOC_NO").
      setInsertable().
      setLabel("QUAINNERPROCDOCNO: Doc No").
      setSize(charlength10).
      setHidden();
      headblk.addField("DOC_SHEET").
      setInsertable().
      setLabel("QUAINNERPROCDOCSHEET: Doc Sheet").
      setSize(10).
      setHidden();
      headblk.addField("DOC_REV").
      setInsertable().
      setLabel("QUAINNERPROCDOCREV: Doc Rev").
      setSize(charlength10).
      setHidden();
      
      headblk.addField("STATE").
      setLabel("QUAINNERPROCSTATE: State").
      setSize(charlength10).
      setHidden();
      
      headblk.addField("IS_ELE_DOC").
      setCheckBox("FALSE,TRUE").
      setFunction("EDM_FILE_API.Have_Edm_File(:DOC_CLASS,:DOC_NO,:DOC_SHEET,:DOC_REV)").
      setLabel("DOCTITLEISELEDOC: Is Ele Doc").
      setSize(charlength10).
      setHidden();
      
      headblk.addField("GOLD_GRID_RECORD_ID").
      setInsertable().
      setLabel("QUAINNERPROCGOLDGRIDRECORDID: Gold Grid Record Id").
      setSize(charlength10).
      setHidden();
      
      headblk.addField("GOLD_GRID_TEMP_ID").
      setInsertable().
      setLabel("QUAINNERPROCGOLDGRIDTEMPID: Gold Grid Temp Id").
      setSize(charlength10).
      setHidden();
      
      headblk.addField("GOLD_GRID_SIGN").
      setInsertable().
      setLabel("QUAINNERPROCGOLDGRIDSIGN: Gold Grid Sign").
      setSize(charlength10).
      setHidden();
      
      headblk.addField("UNION_SIGN_DEPT").
      setInsertable().setFunction("QUA_SIGN_DEPT_API.Get_Union_Sign_Dept(:PROJ_NO, :PROC_REVIEW_CODE)").
      setLabel("QUAINNERPROCUNIONSIGNDEPT: Union Sign Dept").
      setHidden().
      setSize(charlength10);
      
   }
   
}
