
(object Petal
    version       40)

(object Class_Category "Construction management"
    is_unit       TRUE
    is_loaded     TRUE
    file_name     "D:\\project\\xdpcosmis\\rose\\constr.cat"
    quid          "533C89BB0108"
    exportControl    "Public"
    logical_models   (list unit_reference_list
   (object Class "ConstrBreakGroundReq"
       quid          "533C990C02B5"
       class_attributes    (list class_attribute_list
      (object ClassAttribute "RequestNo"
          attributes    (list Attribute_Set
         (object Attribute
             tool          "Foundation1"
             name          "FieldFormat"
             value         "STRING(200)"))
          quid          "533C992D01BA"
          type          "String")
      (object ClassAttribute "BgStartDate"
          attributes    (list Attribute_Set
         (object Attribute
             tool          "Foundation1"
             name          "FieldFlags"
             value         "A-IUL"))
          quid          "533C99A20081"
          type          "DATE"
          exportControl    "Public")
      (object ClassAttribute "BgEndDate"
          attributes    (list Attribute_Set
         (object Attribute
             tool          "Foundation1"
             name          "FieldFlags"
             value         "A-IUL"))
          quid          "533C99A903DE"
          type          "DATE"
          exportControl    "Public")
      (object ClassAttribute "PrepareDesc"
          attributes    (list Attribute_Set
         (object Attribute
             tool          "Foundation1"
             name          "FieldFormat"
             value         "STRING(2000)")
         (object Attribute
             tool          "Foundation1"
             name          "FieldFlags"
             value         "A-IUL"))
          quid          "533C99AF0070"
          type          "String"
          exportControl    "Public")
      (object ClassAttribute "BgScope"
          attributes    (list Attribute_Set
         (object Attribute
             tool          "Foundation1"
             name          "FieldFormat"
             value         "STRING(2000)")
         (object Attribute
             tool          "Foundation1"
             name          "FieldFlags"
             value         "A-IUL"))
          quid          "533C99B600D0"
          type          "String"
          exportControl    "Public")
      (object ClassAttribute "BgRequestDate"
          attributes    (list Attribute_Set
         (object Attribute
             tool          "Foundation1"
             name          "FieldFlags"
             value         "A-IUL"))
          quid          "533C99CC0217"
          type          "DATE"
          exportControl    "Public")
      (object ClassAttribute "BgReqAudDate"
          attributes    (list Attribute_Set
         (object Attribute
             tool          "Foundation1"
             name          "FieldFlags"
             value         "A-IUL"))
          quid          "533C99D601F8"
          type          "DATE"
          exportControl    "Public")
      (object ClassAttribute "BgReqAppDate"
          attributes    (list Attribute_Set
         (object Attribute
             tool          "Foundation1"
             name          "FieldFlags"
             value         "A-IUL"))
          quid          "533C99E500D1"
          type          "DATE"
          exportControl    "Public")
      (object ClassAttribute "BgReqAppOpinion"
          attributes    (list Attribute_Set
         (object Attribute
             tool          "Foundation1"
             name          "FieldFormat"
             value         "STRING(2000)")
         (object Attribute
             tool          "Foundation1"
             name          "FieldFlags"
             value         "A-IUL"))
          quid          "533C99F20317"
          type          "String"
          exportControl    "Public")
      (object ClassAttribute "BgReqStartDate"
          attributes    (list Attribute_Set
         (object Attribute
             tool          "Foundation1"
             name          "FieldFlags"
             value         "A-IUL"))
          quid          "533C9A0003C8"
          type          "DATE"
          exportControl    "Public")
      (object ClassAttribute "BgReqEndDate"
          attributes    (list Attribute_Set
         (object Attribute
             tool          "Foundation1"
             name          "FieldFlags"
             value         "A-IUL"))
          quid          "533C9A1100BF"
          type          "DATE"
          exportControl    "Public")
      (object ClassAttribute "SgbEditDate"
          attributes    (list Attribute_Set
         (object Attribute
             tool          "Foundation1"
             name          "FieldFlags"
             value         "A-IUL"))
          quid          "533C9A230058"
          type          "DATE"
          exportControl    "Public")
      (object ClassAttribute "SgbAuditeDate"
          attributes    (list Attribute_Set
         (object Attribute
             tool          "Foundation1"
             name          "FieldFlags"
             value         "A-IUL"))
          quid          "533C9A390191"
          type          "DATE"
          exportControl    "Public")
      (object ClassAttribute "SgbAuditeOpinion"
          attributes    (list Attribute_Set
         (object Attribute
             tool          "Foundation1"
             name          "FieldFormat"
             value         "STRING(2000)")
         (object Attribute
             tool          "Foundation1"
             name          "FieldFlags"
             value         "A-IUL"))
          quid          "533C9A56021F"
          type          "String"
          exportControl    "Public")
      (object ClassAttribute "SgbApproveDate"
          attributes    (list Attribute_Set
         (object Attribute
             tool          "Foundation1"
             name          "FieldFlags"
             value         "A-IUL"))
          quid          "533C9A630090"
          type          "DATE"
          exportControl    "Public")
      (object ClassAttribute "ConCloseOpinion"
          attributes    (list Attribute_Set
         (object Attribute
             tool          "Foundation1"
             name          "FieldFormat"
             value         "STRING(2000)")
         (object Attribute
             tool          "Foundation1"
             name          "FieldFlags"
             value         "A-IUL"))
          quid          "53447DB203C1"
          type          "String"
          exportControl    "Public")
      (object ClassAttribute "ConCloseDate"
          attributes    (list Attribute_Set
         (object Attribute
             tool          "Foundation1"
             name          "FieldFlags"
             value         "A-IUL"))
          quid          "53447DD10010"
          type          "DATE"
          exportControl    "Public")
      (object ClassAttribute "CnpeConfirmDate"
          attributes    (list Attribute_Set
         (object Attribute
             tool          "Foundation1"
             name          "FieldFlags"
             value         "A-IUL"))
          quid          "53447DEF0102"
          type          "DATE"
          exportControl    "Public"))
       statemachine  (object State_Machine
      states      (list States
          (object State "$UNNAMED$0"
         quid        "534574B6007B"
         transitions    (list transition_list
             (object State_Transition
            quid        "534574C401E6"
            supplier    "Implementing"
            quidu       "534574B900B3"
            sendEvent   (object sendEvent
                quid          "534574C401E8")))
         type        "StartState")
          (object State "Implementing"
         quid        "534574B900B3"
         transitions    (list transition_list
             (object State_Transition
            quid        "534574C702D8"
            supplier    "Closed"
            quidu       "534574BC0023"
            Event       (object Event "Close")
            sendEvent   (object sendEvent
                quid          "534574C702DA")))
         type        "Normal")
          (object State "Closed"
         quid        "534574BC0023"
         type        "Normal")))
       statediagram  (object State_Diagram ""
      quid        "534574AD011D"
      title       ""
      zoom        100
      max_height  28350
      max_width   21600
      origin_x    0
      origin_y    0
      items       (list diagram_item_list
          (object StateView "StartState" "$UNNAMED$0" @1
         location    (256, 752)
         quidu       "534574B6007B"
         autoResize  TRUE)
          (object StateView "Normal" "Implementing" @2
         location    (928, 736)
         label       (object ItemLabel
             Parent_View   @2
             location      (928, 714)
             anchor_loc    1
             nlines        1
             max_width     302
             justify       0
             label         "Implementing")
         quidu       "534574B900B3"
         width       314
         height      134
         autoResize  TRUE)
          (object StateView "Normal" "Closed" @3
         location    (1744, 720)
         label       (object ItemLabel
             Parent_View   @3
             location      (1744, 698)
             anchor_loc    1
             nlines        1
             max_width     302
             justify       0
             label         "Closed")
         quidu       "534574BC0023"
         width       314
         height      134
         autoResize  TRUE)
          (object TransView "" @4
         quidu       "534574C401E6"
         client      @1
         supplier    @2
         line_style  3
         origin_attachment    (286, 725)
         terminal_attachment  (771, 725)
         x_offset    FALSE)
          (object TransView "" @5
         label       (object SegLabel @6
             Parent_View   @5
             location      (1336, 674)
             anchor_loc    1
             nlines        1
             max_width     450
             justify       0
             label         "Close"
             pctDist       0.500000
             height        45
             orientation   0)
         quidu       "534574C702D8"
         client      @2
         supplier    @3
         line_style  3
         origin_attachment    (1085, 718)
         terminal_attachment  (1587, 718)
         x_offset    FALSE))))
   (object Class "ConstrLandReq"
       quid          "533CA5E90267"
       class_attributes    (list class_attribute_list
      (object ClassAttribute "RequestNo"
          attributes    (list Attribute_Set
         (object Attribute
             tool          "Foundation1"
             name          "FieldFormat"
             value         "STRING(200)"))
          quid          "533CB1190209"
          type          "String")
      (object ClassAttribute "ReqestDesc"
          attributes    (list Attribute_Set
         (object Attribute
             tool          "Foundation1"
             name          "FieldFormat"
             value         "STRING(2000)")
         (object Attribute
             tool          "Foundation1"
             name          "FieldFlags"
             value         "A-IUL"))
          quid          "533CB11E00D0"
          type          "String"
          exportControl    "Public")
      (object ClassAttribute "LandStartDate"
          attributes    (list Attribute_Set
         (object Attribute
             tool          "Foundation1"
             name          "FieldFlags"
             value         "A-IUL"))
          quid          "533CB1260171"
          type          "DATE"
          exportControl    "Public")
      (object ClassAttribute "LandEndDate"
          attributes    (list Attribute_Set
         (object Attribute
             tool          "Foundation1"
             name          "FieldFlags"
             value         "A-IUL"))
          quid          "533CB12E0183"
          type          "DATE"
          exportControl    "Public")
      (object ClassAttribute "LandPurpose"
          attributes    (list Attribute_Set
         (object Attribute
             tool          "Foundation1"
             name          "FieldFormat"
             value         "STRING(200)")
         (object Attribute
             tool          "Foundation1"
             name          "FieldFlags"
             value         "A-IUL"))
          quid          "533CB198012F"
          type          "String"
          exportControl    "Public")
      (object ClassAttribute "LrEditDate"
          attributes    (list Attribute_Set
         (object Attribute
             tool          "Foundation1"
             name          "FieldFlags"
             value         "A-IUL"))
          quid          "533CB1AC0338"
          type          "DATE"
          exportControl    "Public")
      (object ClassAttribute "LrAuditeDate"
          attributes    (list Attribute_Set
         (object Attribute
             tool          "Foundation1"
             name          "FieldFlags"
             value         "A-IUL"))
          quid          "533CB1B80339"
          type          "DATE"
          exportControl    "Public")
      (object ClassAttribute "LrApproveDate"
          attributes    (list Attribute_Set
         (object Attribute
             tool          "Foundation1"
             name          "FieldFlags"
             value         "A-IUL"))
          quid          "533CB1C200A4"
          type          "DATE"
          exportControl    "Public")
      (object ClassAttribute "SgbOpinion"
          attributes    (list Attribute_Set
         (object Attribute
             tool          "Foundation1"
             name          "FieldFormat"
             value         "STRING(2000)")
         (object Attribute
             tool          "Foundation1"
             name          "FieldFlags"
             value         "A-IUL"))
          quid          "533CB1C702B6"
          type          "String"
          exportControl    "Public")
      (object ClassAttribute "LrReqStartDate"
          attributes    (list Attribute_Set
         (object Attribute
             tool          "Foundation1"
             name          "FieldFlags"
             value         "A-IUL"))
          quid          "533CB1D000C9"
          type          "DATE"
          exportControl    "Public")
      (object ClassAttribute "SgbEditDate"
          attributes    (list Attribute_Set
         (object Attribute
             tool          "Foundation1"
             name          "FieldFlags"
             value         "A-IUL"))
          quid          "533CB1EC0050"
          type          "DATE"
          exportControl    "Public")
      (object ClassAttribute "SgbAditeDate"
          attributes    (list Attribute_Set
         (object Attribute
             tool          "Foundation1"
             name          "FieldFlags"
             value         "A-IUL"))
          quid          "533CB1F80220"
          type          "DATE"
          exportControl    "Public")
      (object ClassAttribute "SgbApproveDate"
          attributes    (list Attribute_Set
         (object Attribute
             tool          "Foundation1"
             name          "FieldFlags"
             value         "A-IUL"))
          quid          "533CB20402C0"
          type          "DATE"
          exportControl    "Public")
      (object ClassAttribute "ConCloseOpinion"
          attributes    (list Attribute_Set
         (object Attribute
             tool          "Foundation1"
             name          "FieldFormat"
             value         "STRING(2000)")
         (object Attribute
             tool          "Foundation1"
             name          "FieldFlags"
             value         "A-IUL"))
          quid          "53447EB501F7"
          type          "String"
          exportControl    "Public")
      (object ClassAttribute "ConCloseDate"
          attributes    (list Attribute_Set
         (object Attribute
             tool          "Foundation1"
             name          "FieldFlags"
             value         "A-IUL"))
          quid          "53447EB50206"
          type          "DATE"
          exportControl    "Public")
      (object ClassAttribute "CnpeConfirmDate"
          attributes    (list Attribute_Set
         (object Attribute
             tool          "Foundation1"
             name          "FieldFlags"
             value         "A-IUL"))
          quid          "53447EB50214"
          type          "DATE"
          exportControl    "Public"))
       statemachine  (object State_Machine
      states      (list States
          (object State "$UNNAMED$1"
         quid        "534575340176"
         transitions    (list transition_list
             (object State_Transition
            quid        "534575340177"
            supplier    "Implementing"
            quidu       "53457534017A"
            sendEvent   (object sendEvent
                quid          "534575340179")))
         type        "StartState")
          (object State "Implementing"
         quid        "53457534017A"
         transitions    (list transition_list
             (object State_Transition
            quid        "53457534017B"
            supplier    "Closed"
            quidu       "53457534017E"
            Event       (object Event "Close")
            sendEvent   (object sendEvent
                quid          "53457534017D")))
         type        "Normal")
          (object State "Closed"
         quid        "53457534017E"
         type        "Normal")))
       statediagram  (object State_Diagram ""
      quid        "5345753100EE"
      title       ""
      zoom        100
      max_height  28350
      max_width   21600
      origin_x    0
      origin_y    0
      items       (list diagram_item_list
          (object StateView "StartState" "$UNNAMED$1" @7
         location    (752, 992)
         quidu       "534575340176"
         autoResize  TRUE)
          (object StateView "Normal" "Implementing" @8
         location    (1424, 976)
         label       (object ItemLabel
             Parent_View   @8
             location      (1424, 954)
             anchor_loc    1
             nlines        1
             max_width     302
             justify       0
             label         "Implementing")
         quidu       "53457534017A"
         width       314
         height      134
         autoResize  TRUE)
          (object StateView "Normal" "Closed" @9
         location    (2240, 960)
         label       (object ItemLabel
             Parent_View   @9
             location      (2240, 938)
             anchor_loc    1
             nlines        1
             max_width     302
             justify       0
             label         "Closed")
         quidu       "53457534017E"
         width       314
         height      134
         autoResize  TRUE)
          (object TransView "" @10
         quidu       "534575340177"
         client      @7
         supplier    @8
         line_style  3
         origin_attachment    (782, 965)
         terminal_attachment  (1267, 965)
         x_offset    FALSE)
          (object TransView "" @11
         label       (object SegLabel @12
             Parent_View   @11
             location      (1832, 914)
             anchor_loc    1
             nlines        1
             max_width     450
             justify       0
             label         "Close"
             pctDist       0.500000
             height        45
             orientation   0)
         quidu       "53457534017B"
         client      @8
         supplier    @9
         line_style  3
         origin_attachment    (1581, 958)
         terminal_attachment  (2083, 958)
         x_offset    FALSE))))
   (object Class "ConstrDepartureCause"
       quid          "533DB80900A0"
       class_attributes    (list class_attribute_list
      (object ClassAttribute "CauseCode"
          attributes    (list Attribute_Set
         (object Attribute
             tool          "Foundation1"
             name          "FieldFormat"
             value         "STRING(200)"))
          quid          "533DB82202FA"
          type          "String")
      (object ClassAttribute "CauseDesc"
          attributes    (list Attribute_Set
         (object Attribute
             tool          "Foundation1"
             name          "FieldFlags"
             value         "A-IUL")
         (object Attribute
             tool          "Foundation1"
             name          "FieldFormat"
             value         "STRING(2000)"))
          quid          "533DB8280302"
          type          "String"
          exportControl    "Public")
      (object ClassAttribute "Note"
          attributes    (list Attribute_Set
         (object Attribute
             tool          "Foundation1"
             name          "FieldFlags"
             value         "A-IUL")
         (object Attribute
             tool          "Foundation1"
             name          "FieldFormat"
             value         "STRING(2000)"))
          quid          "533DB8300129"
          type          "String"
          exportControl    "Public")))
   (object Class "ConstrDepartureReq"
       quid          "533DC8470369"
       class_attributes    (list class_attribute_list
      (object ClassAttribute "DepartureCode"
          attributes    (list Attribute_Set
         (object Attribute
             tool          "Foundation1"
             name          "FieldFormat"
             value         "STRING(200)"))
          quid          "533DD13C006E"
          type          "String")
      (object ClassAttribute "Rev"
          attributes    (list Attribute_Set
         (object Attribute
             tool          "Foundation1"
             name          "FieldFormat"
             value         "STRING(200)")
         (object Attribute
             tool          "Foundation1"
             name          "FieldFlags"
             value         "A-IUL"))
          quid          "533DD1400177"
          type          "String"
          exportControl    "Public")
      (object ClassAttribute "OriginalProc"
          attributes    (list Attribute_Set
         (object Attribute
             tool          "Foundation1"
             name          "FieldFormat"
             value         "STRING(2000)")
         (object Attribute
             tool          "Foundation1"
             name          "FieldFlags"
             value         "A-IUL"))
          quid          "533DD1450366"
          type          "String"
          exportControl    "Public")
      (object ClassAttribute "DeparturePosition"
          attributes    (list Attribute_Set
         (object Attribute
             tool          "Foundation1"
             name          "FieldFormat"
             value         "STRING(2000)")
         (object Attribute
             tool          "Foundation1"
             name          "FieldFlags"
             value         "A-IUL"))
          quid          "533DD14A03DE"
          type          "String"
          exportControl    "Public")
      (object ClassAttribute "CauseDetail"
          attributes    (list Attribute_Set
         (object Attribute
             tool          "Foundation1"
             name          "FieldFormat"
             value         "STRING(2000)")
         (object Attribute
             tool          "Foundation1"
             name          "FieldFlags"
             value         "A-IUL"))
          quid          "5346D71502F1"
          type          "String(2000)"
          exportControl    "Public")
      (object ClassAttribute "Measure"
          attributes    (list Attribute_Set
         (object Attribute
             tool          "Foundation1"
             name          "FieldFormat"
             value         "STRING(2000)")
         (object Attribute
             tool          "Foundation1"
             name          "FieldFlags"
             value         "A-IUL"))
          quid          "533DD15902F7"
          type          "String"
          exportControl    "Public")
      (object ClassAttribute "DraftDate"
          attributes    (list Attribute_Set
         (object Attribute
             tool          "Foundation1"
             name          "FieldFlags"
             value         "A-IUL"))
          quid          "533DD18F0158"
          type          "DATE"
          exportControl    "Public")
      (object ClassAttribute "AuditeDate"
          attributes    (list Attribute_Set
         (object Attribute
             tool          "Foundation1"
             name          "FieldFlags"
             value         "A-IUL"))
          quid          "533DD19502A8"
          type          "DATE"
          exportControl    "Public")
      (object ClassAttribute "ApproveDate"
          attributes    (list Attribute_Set
         (object Attribute
             tool          "Foundation1"
             name          "FieldFlags"
             value         "A-IUL"))
          quid          "533DD19E0297"
          type          "DATE"
          exportControl    "Public")
      (object ClassAttribute "BsemOpinion"
          attributes    (list Attribute_Set
         (object Attribute
             tool          "Foundation1"
             name          "FieldFormat"
             value         "STRING(2000)")
         (object Attribute
             tool          "Foundation1"
             name          "FieldFlags"
             value         "A-IUL"))
          quid          "533DD1A40266"
          type          "String"
          exportControl    "Public")
      (object ClassAttribute "BsemAuditeDate"
          attributes    (list Attribute_Set
         (object Attribute
             tool          "Foundation1"
             name          "FieldFlags"
             value         "A-IUL"))
          quid          "533DD1AB00CF"
          type          "DATE"
          exportControl    "Public")
      (object ClassAttribute "BsemApproveDate"
          attributes    (list Attribute_Set
         (object Attribute
             tool          "Foundation1"
             name          "FieldFlags"
             value         "A-IUL"))
          quid          "533DD1B20140"
          type          "DATE"
          exportControl    "Public")
      (object ClassAttribute "PcbOpinion"
          attributes    (list Attribute_Set
         (object Attribute
             tool          "Foundation1"
             name          "FieldFormat"
             value         "STRING(2000)")
         (object Attribute
             tool          "Foundation1"
             name          "FieldFlags"
             value         "A-IUL"))
          quid          "533DD1B701CF"
          type          "String"
          exportControl    "Public")
      (object ClassAttribute "PcbAuditeDate"
          attributes    (list Attribute_Set
         (object Attribute
             tool          "Foundation1"
             name          "FieldFlags"
             value         "A-IUL"))
          quid          "533DD1BE0306"
          type          "DATE"
          exportControl    "Public")
      (object ClassAttribute "PcbApproveDate"
          attributes    (list Attribute_Set
         (object Attribute
             tool          "Foundation1"
             name          "FieldFlags"
             value         "A-IUL"))
          quid          "533DD1C70226"
          type          "DATE"
          exportControl    "Public")
      (object ClassAttribute "OwnerOpinion"
          attributes    (list Attribute_Set
         (object Attribute
             tool          "Foundation1"
             name          "FieldFormat"
             value         "STRING(2000)")
         (object Attribute
             tool          "Foundation1"
             name          "FieldFlags"
             value         "A-IUL"))
          quid          "533DD1CD030F"
          type          "String"
          exportControl    "Public")
      (object ClassAttribute "OwnerAuditeDate"
          attributes    (list Attribute_Set
         (object Attribute
             tool          "Foundation1"
             name          "FieldFlags"
             value         "A-IUL"))
          quid          "533DD1E30127"
          type          "DATE"
          exportControl    "Public")
      (object ClassAttribute "ExecuteState"
          attributes    (list Attribute_Set
         (object Attribute
             tool          "Foundation1"
             name          "FieldFormat"
             value         "STRING(200)")
         (object Attribute
             tool          "Foundation1"
             name          "FieldFlags"
             value         "A-IUL"))
          quid          "533DD1E90230"
          type          "String"
          exportControl    "Public")
      (object ClassAttribute "ExecuteDraftDate"
          attributes    (list Attribute_Set
         (object Attribute
             tool          "Foundation1"
             name          "FieldFlags"
             value         "A-IUL"))
          quid          "533DD1FD009E"
          type          "DATE"
          exportControl    "Public")
      (object ClassAttribute "ApplyCloseDesc"
          attributes    (list Attribute_Set
         (object Attribute
             tool          "Foundation1"
             name          "FieldFormat"
             value         "STRING(2000)")
         (object Attribute
             tool          "Foundation1"
             name          "FieldFlags"
             value         "A-IUL"))
          quid          "533DD2070095"
          type          "String"
          exportControl    "Public")
      (object ClassAttribute "ApplyCloseDate"
          attributes    (list Attribute_Set
         (object Attribute
             tool          "Foundation1"
             name          "FieldFlags"
             value         "A-IUL"))
          quid          "533DD21102EC"
          type          "DATE"
          exportControl    "Public")
      (object ClassAttribute "BsemCloseDesc"
          attributes    (list Attribute_Set
         (object Attribute
             tool          "Foundation1"
             name          "FieldFormat"
             value         "STRING(2000)")
         (object Attribute
             tool          "Foundation1"
             name          "FieldFlags"
             value         "A-IUL"))
          quid          "533DD21B0386"
          type          "String"
          exportControl    "Public")
      (object ClassAttribute "BsemCloseDate"
          attributes    (list Attribute_Set
         (object Attribute
             tool          "Foundation1"
             name          "FieldFlags"
             value         "A-IUL"))
          quid          "533DD234011D"
          type          "DATE"
          exportControl    "Public")
      (object ClassAttribute "PcbCloseDesc"
          attributes    (list Attribute_Set
         (object Attribute
             tool          "Foundation1"
             name          "FieldFormat"
             value         "STRING(2000)")
         (object Attribute
             tool          "Foundation1"
             name          "FieldFlags"
             value         "A-IUL"))
          quid          "533DD23D008E"
          type          "String"
          exportControl    "Public")
      (object ClassAttribute "PcbCloseDate"
          attributes    (list Attribute_Set
         (object Attribute
             tool          "Foundation1"
             name          "FieldFlags"
             value         "A-IUL"))
          quid          "533DD24403AE"
          type          "DATE"
          exportControl    "Public")
      (object ClassAttribute "OwnerCloseDesc"
          attributes    (list Attribute_Set
         (object Attribute
             tool          "Foundation1"
             name          "FieldFormat"
             value         "STRING(2000)")
         (object Attribute
             tool          "Foundation1"
             name          "FieldFlags"
             value         "A-IUL"))
          quid          "533DD25F0246"
          type          "String"
          exportControl    "Public")
      (object ClassAttribute "OwnerCloseDate"
          attributes    (list Attribute_Set
         (object Attribute
             tool          "Foundation1"
             name          "FieldFlags"
             value         "A-IUL"))
          quid          "533DD26700D6"
          type          "DATE"
          exportControl    "Public"))
       statemachine  (object State_Machine
      states      (list States
          (object State "$UNNAMED$2"
         quid        "5345D5230380"
         transitions    (list transition_list
             (object State_Transition
            quid        "5345D5230381"
            supplier    "Implementing"
            quidu       "5345D5230384"
            sendEvent   (object sendEvent
                quid          "5345D5230383")))
         type        "StartState")
          (object State "Implementing"
         quid        "5345D5230384"
         transitions    (list transition_list
             (object State_Transition
            quid        "5345D5230385"
            supplier    "Closed"
            quidu       "5345D5230388"
            Event       (object Event "Close")
            sendEvent   (object sendEvent
                quid          "5345D5230387")))
         type        "Normal")
          (object State "Closed"
         quid        "5345D5230388"
         type        "Normal")))
       statediagram  (object State_Diagram ""
      quid        "5345D51100EB"
      title       ""
      zoom        100
      max_height  28350
      max_width   21600
      origin_x    0
      origin_y    0
      items       (list diagram_item_list
          (object StateView "StartState" "$UNNAMED$2" @13
         location    (944, 976)
         quidu       "5345D5230380"
         autoResize  TRUE)
          (object StateView "Normal" "Implementing" @14
         location    (1632, 976)
         label       (object ItemLabel
             Parent_View   @14
             location      (1632, 954)
             anchor_loc    1
             nlines        1
             max_width     302
             justify       0
             label         "Implementing")
         quidu       "5345D5230384"
         width       314
         height      134
         autoResize  TRUE)
          (object StateView "Normal" "Closed" @15
         location    (2448, 960)
         label       (object ItemLabel
             Parent_View   @15
             location      (2448, 938)
             anchor_loc    1
             nlines        1
             max_width     302
             justify       0
             label         "Closed")
         quidu       "5345D5230388"
         width       314
         height      134
         autoResize  TRUE)
          (object TransView "" @16
         label       (object SegLabel @17
             Parent_View   @16
             location      (2040, 914)
             anchor_loc    1
             nlines        1
             max_width     450
             justify       0
             label         "Close"
             pctDist       0.500000
             height        45
             orientation   0)
         quidu       "5345D5230385"
         client      @14
         supplier    @15
         line_style  3
         origin_attachment    (1789, 958)
         terminal_attachment  (2291, 958)
         x_offset    FALSE)
          (object TransView "" @18
         quidu       "5345D5230381"
         client      @13
         supplier    @14
         line_style  3
         origin_attachment    (974, 978)
         terminal_attachment  (1475, 978)
         x_offset    FALSE))))
   (object Association "$UNNAMED$3"
       attributes    (list Attribute_Set
      (object Attribute
          tool          "Foundation1"
          name          "FieldFlags"
          value         "KMI-L"))
       quid          "533CA24103DE"
       roles         (list role_list
      (object Role "$UNNAMED$4"
          quid          "533CA2430111"
          supplier      "GeneralProject"
          quidu         "51CB21D3024F"
          is_navigable  TRUE
          is_aggregate  TRUE)
      (object Role "$UNNAMED$5"
          quid          "533CA2430112"
          supplier      "ConstrBreakGroundReq"
          quidu         "533C990C02B5"
          is_navigable  TRUE)))
   (object Association "$UNNAMED$6"
       quid          "533CA26301D8"
       roles         (list role_list
      (object Role "$UNNAMED$7"
          quid          "533CA2640233"
          supplier      "GeneralMachGroup"
          quidu         "5266F7030067"
          is_navigable  TRUE)
      (object Role "$UNNAMED$8"
          quid          "533CA2640234"
          supplier      "ConstrBreakGroundReq"
          quidu         "533C990C02B5")))
   (object Association "$UNNAMED$9"
       quid          "533DB4E60348"
       roles         (list role_list
      (object Role "BgRequestor"
          quid          "533DB4E800DB"
          label         "BgRequestor"
          supplier      "PersonInfo"
          quidu         "361B5EF402EF"
          is_navigable  TRUE)
      (object Role "$UNNAMED$10"
          quid          "533DB4E800DD"
          supplier      "ConstrBreakGroundReq"
          quidu         "533C990C02B5")))
   (object Association "$UNNAMED$11"
       quid          "533DB4F60355"
       roles         (list role_list
      (object Role "BgReqAuditor"
          quid          "533DB4F70347"
          label         "BgReqAuditor"
          supplier      "PersonInfo"
          quidu         "361B5EF402EF"
          is_navigable  TRUE)
      (object Role "$UNNAMED$12"
          quid          "533DB4F70348"
          supplier      "ConstrBreakGroundReq"
          quidu         "533C990C02B5")))
   (object Association "$UNNAMED$13"
       quid          "533DB50000ED"
       roles         (list role_list
      (object Role "BgReqApprover"
          quid          "533DB50300F9"
          label         "BgReqApprover"
          supplier      "PersonInfo"
          quidu         "361B5EF402EF"
          is_navigable  TRUE)
      (object Role "$UNNAMED$14"
          quid          "533DB50300FA"
          supplier      "ConstrBreakGroundReq"
          quidu         "533C990C02B5")))
   (object Association "$UNNAMED$15"
       quid          "533DB51001B3"
       roles         (list role_list
      (object Role "SgbEditor"
          quid          "533DB5120069"
          label         "SgbEditor"
          supplier      "PersonInfo"
          quidu         "361B5EF402EF"
          is_navigable  TRUE)
      (object Role "$UNNAMED$16"
          quid          "533DB512006A"
          supplier      "ConstrBreakGroundReq"
          quidu         "533C990C02B5")))
   (object Association "$UNNAMED$17"
       quid          "533DB5370038"
       roles         (list role_list
      (object Role "SgbAuditor"
          quid          "533DB53900AD"
          label         "SgbAuditor"
          supplier      "PersonInfo"
          quidu         "361B5EF402EF"
          is_navigable  TRUE)
      (object Role "$UNNAMED$18"
          quid          "533DB53900AE"
          supplier      "ConstrBreakGroundReq"
          quidu         "533C990C02B5")))
   (object Association "$UNNAMED$19"
       quid          "533DB54802D8"
       roles         (list role_list
      (object Role "SgbApprover"
          quid          "533DB54A01DF"
          label         "SgbApprover"
          supplier      "PersonInfo"
          quidu         "361B5EF402EF"
          is_navigable  TRUE)
      (object Role "$UNNAMED$20"
          quid          "533DB54A01E0"
          supplier      "ConstrBreakGroundReq"
          quidu         "533C990C02B5")))
   (object Association "$UNNAMED$21"
       attributes    (list Attribute_Set
      (object Attribute
          tool          "Foundation1"
          name          "FieldFlags"
          value         "KMI-L"))
       quid          "533DB58C0275"
       roles         (list role_list
      (object Role "$UNNAMED$22"
          quid          "533DB58E006E"
          supplier      "GeneralProject"
          quidu         "51CB21D3024F"
          is_navigable  TRUE
          is_aggregate  TRUE)
      (object Role "$UNNAMED$23"
          quid          "533DB58E006F"
          supplier      "ConstrLandReq"
          quidu         "533CA5E90267"
          is_navigable  TRUE)))
   (object Association "$UNNAMED$24"
       quid          "533DB615022D"
       roles         (list role_list
      (object Role "LrRequestOrg"
          quid          "533DB61B01FF"
          label         "LrRequestOrg"
          supplier      "GeneralOrganization"
          quidu         "51634D3401DD"
          is_navigable  TRUE)
      (object Role "$UNNAMED$25"
          quid          "533DB61B0200"
          supplier      "ConstrLandReq"
          quidu         "533CA5E90267")))
   (object Association "$UNNAMED$26"
       quid          "533DB6270211"
       roles         (list role_list
      (object Role "LrRequestDep"
          quid          "533DB62B0246"
          label         "LrRequestDep"
          supplier      "GeneralOrganization"
          quidu         "51634D3401DD"
          is_navigable  TRUE)
      (object Role "$UNNAMED$27"
          quid          "533DB62B0247"
          supplier      "ConstrLandReq"
          quidu         "533CA5E90267")))
   (object Association "$UNNAMED$28"
       quid          "533DB653034B"
       roles         (list role_list
      (object Role "LrEditor"
          quid          "533DB65600C6"
          label         "LrEditor"
          supplier      "PersonInfo"
          quidu         "361B5EF402EF"
          is_navigable  TRUE)
      (object Role "$UNNAMED$29"
          quid          "533DB65600C8"
          supplier      "ConstrLandReq"
          quidu         "533CA5E90267")))
   (object Association "$UNNAMED$30"
       quid          "533DB6690298"
       roles         (list role_list
      (object Role "LrAuditor"
          quid          "533DB66B0221"
          label         "LrAuditor"
          supplier      "PersonInfo"
          quidu         "361B5EF402EF"
          is_navigable  TRUE)
      (object Role "$UNNAMED$31"
          quid          "533DB66B0222"
          supplier      "ConstrLandReq"
          quidu         "533CA5E90267")))
   (object Association "$UNNAMED$32"
       quid          "533DB68D00B4"
       roles         (list role_list
      (object Role "LrApprover"
          quid          "533DB68F0233"
          label         "LrApprover"
          supplier      "PersonInfo"
          quidu         "361B5EF402EF"
          is_navigable  TRUE)
      (object Role "$UNNAMED$33"
          quid          "533DB68F0234"
          supplier      "ConstrLandReq"
          quidu         "533CA5E90267")))
   (object Association "$UNNAMED$34"
       quid          "533DB6E00038"
       roles         (list role_list
      (object Role "SgbEditor"
          quid          "533DB6E20081"
          label         "SgbEditor"
          supplier      "PersonInfo"
          quidu         "361B5EF402EF"
          is_navigable  TRUE)
      (object Role "$UNNAMED$35"
          quid          "533DB6E20083"
          supplier      "ConstrLandReq"
          quidu         "533CA5E90267")))
   (object Association "$UNNAMED$36"
       quid          "533DB6FA03A5"
       roles         (list role_list
      (object Role "SgbAuditor"
          quid          "533DB6FD0043"
          label         "SgbAuditor"
          supplier      "PersonInfo"
          quidu         "361B5EF402EF"
          is_navigable  TRUE)
      (object Role "$UNNAMED$37"
          quid          "533DB6FD0044"
          supplier      "ConstrLandReq"
          quidu         "533CA5E90267")))
   (object Association "$UNNAMED$38"
       quid          "533DB71B004C"
       roles         (list role_list
      (object Role "SgbApprover"
          quid          "533DB71D0042"
          label         "SgbApprover"
          supplier      "PersonInfo"
          quidu         "361B5EF402EF"
          is_navigable  TRUE)
      (object Role "$UNNAMED$39"
          quid          "533DB71D0043"
          supplier      "ConstrLandReq"
          quidu         "533CA5E90267")))
   (object Association "$UNNAMED$40"
       attributes    (list Attribute_Set
      (object Attribute
          tool          "Foundation1"
          name          "FieldFlags"
          value         "KMIUL"))
       quid          "533DC72B0084"
       roles         (list role_list
      (object Role "$UNNAMED$41"
          quid          "533DC72D016F"
          supplier      "GeneralProject"
          quidu         "51CB21D3024F"
          is_navigable  TRUE
          is_aggregate  TRUE)
      (object Role "$UNNAMED$42"
          quid          "533DC72D0170"
          supplier      "ConstrDepartureCause"
          quidu         "533DB80900A0"
          is_navigable  TRUE)))
   (object Association "$UNNAMED$43"
       quid          "533DD330039C"
       roles         (list role_list
      (object Role "ApplyUnit"
          quid          "533DD3320343"
          label         "ApplyUnit"
          supplier      "GeneralOrganization"
          quidu         "51634D3401DD"
          is_navigable  TRUE)
      (object Role "$UNNAMED$44"
          quid          "533DD3320344"
          supplier      "ConstrDepartureReq"
          quidu         "533DC8470369")))
   (object Association "$UNNAMED$45"
       quid          "533DD34B0113"
       roles         (list role_list
      (object Role "ApplyDepartment"
          quid          "533DD34D0390"
          label         "ApplyDepartment"
          supplier      "GeneralOrganization"
          quidu         "51634D3401DD"
          is_navigable  TRUE)
      (object Role "$UNNAMED$46"
          quid          "533DD34D0391"
          supplier      "ConstrDepartureReq"
          quidu         "533DC8470369")))
   (object Association "$UNNAMED$47"
       quid          "533DD3960247"
       roles         (list role_list
      (object Role "DraftPerson"
          quid          "533DD39803BC"
          label         "DraftPerson"
          supplier      "PersonInfo"
          quidu         "361B5EF402EF"
          is_navigable  TRUE)
      (object Role "$UNNAMED$48"
          quid          "533DD39803BD"
          supplier      "ConstrDepartureReq"
          quidu         "533DC8470369")))
   (object Association "$UNNAMED$49"
       quid          "533DD3B30240"
       roles         (list role_list
      (object Role "Auditor"
          quid          "533DD3B601D4"
          label         "Auditor"
          supplier      "PersonInfo"
          quidu         "361B5EF402EF"
          is_navigable  TRUE)
      (object Role "$UNNAMED$50"
          quid          "533DD3B601D5"
          supplier      "ConstrDepartureReq"
          quidu         "533DC8470369")))
   (object Association "$UNNAMED$51"
       quid          "533DD3C40173"
       roles         (list role_list
      (object Role "Approver"
          quid          "533DD3C5038F"
          label         "Approver"
          supplier      "PersonInfo"
          quidu         "361B5EF402EF"
          is_navigable  TRUE)
      (object Role "$UNNAMED$52"
          quid          "533DD3C50390"
          supplier      "ConstrDepartureReq"
          quidu         "533DC8470369")))
   (object Association "$UNNAMED$53"
       quid          "533DD3D10013"
       roles         (list role_list
      (object Role "BsemAuditor"
          quid          "533DD3D301D9"
          label         "BsemAuditor"
          supplier      "PersonInfo"
          quidu         "361B5EF402EF"
          is_navigable  TRUE)
      (object Role "$UNNAMED$54"
          quid          "533DD3D301DB"
          supplier      "ConstrDepartureReq"
          quidu         "533DC8470369")))
   (object Association "$UNNAMED$55"
       quid          "533DD3E00313"
       roles         (list role_list
      (object Role "BsemApprover"
          quid          "533DD3E20160"
          label         "BsemApprover"
          supplier      "PersonInfo"
          quidu         "361B5EF402EF"
          is_navigable  TRUE)
      (object Role "$UNNAMED$56"
          quid          "533DD3E20161"
          supplier      "ConstrDepartureReq"
          quidu         "533DC8470369")))
   (object Association "$UNNAMED$57"
       quid          "533DD3F401B2"
       roles         (list role_list
      (object Role "PcbAuditor"
          quid          "533DD3F603DE"
          label         "PcbAuditor"
          supplier      "PersonInfo"
          quidu         "361B5EF402EF"
          is_navigable  TRUE)
      (object Role "$UNNAMED$58"
          quid          "533DD3F603DF"
          supplier      "ConstrDepartureReq"
          quidu         "533DC8470369")))
   (object Association "$UNNAMED$59"
       quid          "533DD407006F"
       roles         (list role_list
      (object Role "PcbApprover"
          quid          "533DD408034B"
          label         "PcbApprover"
          supplier      "PersonInfo"
          quidu         "361B5EF402EF"
          is_navigable  TRUE)
      (object Role "$UNNAMED$60"
          quid          "533DD408034C"
          supplier      "ConstrDepartureReq"
          quidu         "533DC8470369")))
   (object Association "$UNNAMED$61"
       quid          "533DD41602F7"
       roles         (list role_list
      (object Role "OwnerAuditor"
          quid          "533DD41801EE"
          label         "OwnerAuditor"
          supplier      "PersonInfo"
          quidu         "361B5EF402EF"
          is_navigable  TRUE)
      (object Role "$UNNAMED$62"
          quid          "533DD41801EF"
          supplier      "ConstrDepartureReq"
          quidu         "533DC8470369")))
   (object Association "$UNNAMED$63"
       quid          "533DD47E036A"
       roles         (list role_list
      (object Role "ExecuteDrafter"
          quid          "533DD4810135"
          label         "ExecuteDrafter"
          supplier      "PersonInfo"
          quidu         "361B5EF402EF"
          is_navigable  TRUE)
      (object Role "$UNNAMED$64"
          quid          "533DD4810136"
          supplier      "ConstrDepartureReq"
          quidu         "533DC8470369")))
   (object Association "$UNNAMED$65"
       quid          "533DD48C0192"
       roles         (list role_list
      (object Role "ApplyClosePer"
          quid          "533DD48D01FE"
          label         "ApplyClosePer"
          supplier      "PersonInfo"
          quidu         "361B5EF402EF"
          is_navigable  TRUE)
      (object Role "$UNNAMED$66"
          quid          "533DD48D0200"
          supplier      "ConstrDepartureReq"
          quidu         "533DC8470369")))
   (object Association "$UNNAMED$67"
       quid          "533DD4A20392"
       roles         (list role_list
      (object Role "BsemClosePer"
          quid          "533DD4A4030E"
          label         "BsemClosePer"
          supplier      "PersonInfo"
          quidu         "361B5EF402EF"
          is_navigable  TRUE)
      (object Role "$UNNAMED$68"
          quid          "533DD4A4030F"
          supplier      "ConstrDepartureReq"
          quidu         "533DC8470369")))
   (object Association "$UNNAMED$69"
       quid          "533DD4C502C0"
       roles         (list role_list
      (object Role "PcbClosePer"
          quid          "533DD4C7003D"
          label         "PcbClosePer"
          supplier      "PersonInfo"
          quidu         "361B5EF402EF"
          is_navigable  TRUE)
      (object Role "$UNNAMED$70"
          quid          "533DD4C7003E"
          supplier      "ConstrDepartureReq"
          quidu         "533DC8470369")))
   (object Association "$UNNAMED$71"
       quid          "533DD4D20227"
       roles         (list role_list
      (object Role "OwnerClosePer"
          quid          "533DD4D4020F"
          label         "OwnerClosePer"
          supplier      "PersonInfo"
          quidu         "361B5EF402EF"
          is_navigable  TRUE)
      (object Role "$UNNAMED$72"
          quid          "533DD4D40210"
          supplier      "ConstrDepartureReq"
          quidu         "533DC8470369")))
   (object Association "$UNNAMED$73"
       quid          "533DD647012A"
       roles         (list role_list
      (object Role "$UNNAMED$74"
          quid          "533DD64900F2"
          supplier      "ConstrDepartureCause"
          quidu         "533DB80900A0"
          is_navigable  TRUE)
      (object Role "$UNNAMED$75"
          quid          "533DD649010E"
          supplier      "ConstrDepartureReq"
          quidu         "533DC8470369")))
   (object Association "$UNNAMED$76"
       quid          "533DD6E10374"
       roles         (list role_list
      (object Role "$UNNAMED$77"
          quid          "533DD6E20339"
          supplier      "GeneralMachGroup"
          quidu         "5266F7030067"
          is_navigable  TRUE)
      (object Role "$UNNAMED$78"
          quid          "533DD6E2033A"
          supplier      "ConstrDepartureReq"
          quidu         "533DC8470369")))
   (object Association "$UNNAMED$79"
       quid          "533DD6EA01B7"
       roles         (list role_list
      (object Role "$UNNAMED$80"
          quid          "533DD6EB0138"
          supplier      "GeneralComponent"
          quidu         "5266C0DB026E"
          is_navigable  TRUE)
      (object Role "$UNNAMED$81"
          quid          "533DD6EB0139"
          supplier      "ConstrDepartureReq"
          quidu         "533DC8470369")))
   (object Association "$UNNAMED$82"
       quid          "533DD6EC0027"
       roles         (list role_list
      (object Role "$UNNAMED$83"
          quid          "533DD6EC0340"
          supplier      "GeneralSystem"
          quidu         "5266BEB10304"
          is_navigable  TRUE)
      (object Role "$UNNAMED$84"
          quid          "533DD6EC0341"
          supplier      "ConstrDepartureReq"
          quidu         "533DC8470369")))
   (object Association "$UNNAMED$85"
       quid          "533DD6ED01F6"
       roles         (list role_list
      (object Role "$UNNAMED$86"
          quid          "533DD6EE03E2"
          supplier      "GeneralSpecialty"
          quidu         "5266C359005A"
          is_navigable  TRUE)
      (object Role "$UNNAMED$87"
          quid          "533DD6EE03E3"
          supplier      "ConstrDepartureReq"
          quidu         "533DC8470369")))
   (object Association "$UNNAMED$88"
       attributes    (list Attribute_Set
      (object Attribute
          tool          "Foundation1"
          name          "FieldFlags"
          value         "KMI-L"))
       quid          "533DD76401A0"
       roles         (list role_list
      (object Role "$UNNAMED$89"
          quid          "533DD76600E8"
          supplier      "GeneralProject"
          quidu         "51CB21D3024F"
          is_navigable  TRUE
          is_aggregate  TRUE)
      (object Role "$UNNAMED$90"
          quid          "533DD76600E9"
          supplier      "ConstrDepartureReq"
          quidu         "533DC8470369"
          is_navigable  TRUE)))
   (object Association "$UNNAMED$91"
       quid          "533DD86E0253"
       roles         (list role_list
      (object Role "$UNNAMED$92"
          quid          "533DD8700152"
          supplier      "DocIssue"
          quidu         "34B4899000D3"
          is_navigable  TRUE)
      (object Role "$UNNAMED$93"
          quid          "533DD8700155"
          supplier      "ConstrBreakGroundReq"
          quidu         "533C990C02B5")))
   (object Association "$UNNAMED$94"
       quid          "533DD875012D"
       roles         (list role_list
      (object Role "$UNNAMED$95"
          quid          "533DD87601A4"
          supplier      "DocIssue"
          quidu         "34B4899000D3"
          is_navigable  TRUE)
      (object Role "$UNNAMED$96"
          quid          "533DD87601A8"
          supplier      "ConstrLandReq"
          quidu         "533CA5E90267")))
   (object Association "$UNNAMED$97"
       quid          "533DD8780248"
       roles         (list role_list
      (object Role "$UNNAMED$98"
          quid          "533DD87D0023"
          supplier      "DocIssue"
          quidu         "34B4899000D3"
          is_navigable  TRUE)
      (object Role "$UNNAMED$99"
          quid          "533DD87D0028"
          supplier      "ConstrDepartureReq"
          quidu         "533DC8470369")))
   (object Association "$UNNAMED$100"
       quid          "534479CD01E4"
       roles         (list role_list
      (object Role "BgRequestOrg "
          quid          "534479CF0160"
          label         "BgRequestOrg "
          supplier      "GeneralOrganization"
          quidu         "51634D3401DD"
          is_navigable  TRUE)
      (object Role "$UNNAMED$101"
          quid          "534479CF0161"
          supplier      "ConstrBreakGroundReq"
          quidu         "533C990C02B5")))
   (object Association "$UNNAMED$102"
       quid          "53447C6C012A"
       roles         (list role_list
      (object Role "BgRequestDep "
          quid          "53447C6E0247"
          label         "BgRequestDep "
          supplier      "GeneralOrganization"
          quidu         "51634D3401DD"
          is_navigable  TRUE)
      (object Role "$UNNAMED$103"
          quid          "53447C6E0248"
          supplier      "ConstrBreakGroundReq"
          quidu         "533C990C02B5")))
   (object Association "$UNNAMED$104"
       quid          "53447E4C027D"
       roles         (list role_list
      (object Role "ConClosePer"
          quid          "53447E4F01A8"
          label         "ConClosePer"
          supplier      "PersonInfo"
          quidu         "361B5EF402EF"
          is_navigable  TRUE)
      (object Role "$UNNAMED$105"
          quid          "53447E4F01AA"
          supplier      "ConstrBreakGroundReq"
          quidu         "533C990C02B5")))
   (object Association "$UNNAMED$106"
       quid          "53447E5E006D"
       roles         (list role_list
      (object Role "CnpeConfirmPer"
          quid          "53447E6002A5"
          label         "CnpeConfirmPer"
          supplier      "PersonInfo"
          quidu         "361B5EF402EF"
          is_navigable  TRUE)
      (object Role "$UNNAMED$107"
          quid          "53447E6002A6"
          supplier      "ConstrBreakGroundReq"
          quidu         "533C990C02B5")))
   (object Association "$UNNAMED$108"
       quid          "53447ED3027A"
       roles         (list role_list
      (object Role "ConClosePer"
          quid          "53447ED6000E"
          label         "ConClosePer"
          supplier      "PersonInfo"
          quidu         "361B5EF402EF"
          is_navigable  TRUE)
      (object Role "$UNNAMED$109"
          quid          "53447ED6000F"
          supplier      "ConstrLandReq"
          quidu         "533CA5E90267")))
   (object Association "$UNNAMED$110"
       quid          "53447EEC0116"
       roles         (list role_list
      (object Role "CnpeConfirmPer"
          quid          "53447EEE005B"
          label         "CnpeConfirmPer"
          supplier      "PersonInfo"
          quidu         "361B5EF402EF"
          is_navigable  TRUE)
      (object Role "$UNNAMED$111"
          quid          "53447EEE005D"
          supplier      "ConstrLandReq"
          quidu         "533CA5E90267")))
   (object Association "$UNNAMED$112"
       quid          "53448A290168"
       roles         (list role_list
      (object Role "$UNNAMED$113"
          quid          "53448A2A0148"
          supplier      "GeneralStructure"
          quidu         "5266BEB90366"
          is_navigable  TRUE)
      (object Role "$UNNAMED$114"
          quid          "53448A2A0167"
          supplier      "ConstrDepartureReq"
          quidu         "533DC8470369")))
   (object Association "$UNNAMED$115"
       quid          "53448A6503D9"
       roles         (list role_list
      (object Role "$UNNAMED$116"
          quid          "53448A670181"
          supplier      "GeneralStructure"
          quidu         "5266BEB90366"
          is_navigable  TRUE)
      (object Role "$UNNAMED$117"
          quid          "53448A67019C"
          supplier      "ConstrBreakGroundReq"
          quidu         "533C990C02B5"))))
    logical_presentations  (list unit_reference_list
   (object ClassDiagram "Main"
       quid          "533C8AC8023F"
       title         "Main"
       zoom          100
       max_height    28350
       max_width     21600
       origin_x      125
       origin_y      0
       items         (list diagram_item_list
      (object ClassView "Class" "ConstrLandReq" @19
          IncludeAttribute    TRUE
          location      (2912, 1168)
          label         (object ItemLabel
         Parent_View    @19
         location    (2677, 739)
         nlines      1
         max_width   469
         justify     0
         label       "ConstrLandReq")
          quidu         "533CA5E90267"
          width         508
          height        880
          annotation    8
          autoResize    TRUE)
      (object ClassView "Class" "GeneralMachGroup" @20
          location      (1744, 688)
          label         (object ItemLabel
         Parent_View    @20
         location    (1552, 642)
         nlines      1
         max_width   382
         justify     0
         label       "GeneralMachGroup")
          quidu         "5266F7030067"
          width         414
          height        115
          autoResize    TRUE)
      (object ClassView "Class" "GeneralProject" @21
          location      (1680, 112)
          label         (object ItemLabel
         Parent_View    @21
         location    (1529, 66)
         nlines      1
         max_width   302
         justify     0
         label       "GeneralProject")
          quidu         "51CB21D3024F"
          width         327
          height        115
          autoResize    TRUE)
      (object AssociationViewNew "$UNNAMED$21" @22
          location      (2677, 125)
          quidu         "533DB58C0275"
          roleview_list    (list RoleViews
         (object RoleView "$UNNAMED$22" @23
             Parent_View   @22
             location      (-235, -947)
             quidu         "533DB58E006E"
             client        @22
             supplier      @21
             line_style    3
             origin_attachment   (2677, 125)
             terminal_attachment    (1843, 125))
         (object RoleView "$UNNAMED$23" @24
             Parent_View   @22
             location      (-235, -947)
             quidu         "533DB58E006F"
             client        @22
             supplier      @19
             vertices      (list Points
            (2677, 125)
            (2909, 125)
            (2909, 728))
             line_style    3
             origin_attachment   (2677, 125)
             terminal_attachment    (2912, 728))))
      (object ClassView "Class" "GeneralOrganization" @25
          location      (1664, 368)
          label         (object ItemLabel
         Parent_View    @25
         location    (1469, 322)
         nlines      1
         max_width   388
         justify     0
         label       "GeneralOrganization")
          quidu         "51634D3401DD"
          width         420
          height        115
          autoResize    TRUE)
      (object AssociationViewNew "" @26
          location      (1501, 578)
          quidu         "51634FAD00C6"
          roleview_list    (list RoleViews
         (object RoleView "ParentOrgNo" @27
             Parent_View   @26
             location      (-195, 114)
             label         (object SegLabel @28
            Parent_View    @27
            location    (1415, 465)
            anchor      1
            anchor_loc  1
            nlines      1
            max_width   450
            justify     0
            label       "ParentOrgNo"
            pctDist     0.800000
            height      42
            orientation    0)
             quidu         "51634FB000F0"
             client        @26
             supplier      @25
             vertices      (list Points
            (1501, 578)
            (1456, 578)
            (1456, 425))
             line_style    3
             origin_attachment   (1501, 578)
             terminal_attachment    (1664, 425))
         (object RoleView "" @29
             Parent_View   @26
             location      (-195, 114)
             quidu         "51634FB00100"
             client        @26
             supplier      @25
             vertices      (list Points
            (1501, 578)
            (1547, 578)
            (1547, 425))
             line_style    3
             origin_attachment   (1501, 578)
             terminal_attachment    (1664, 425))))
      (object AssociationViewNew "" @30
          location      (1456, 434)
          quidu         "51634FD1007D"
          roleview_list    (list RoleViews
         (object RoleView "ParentDepNo" @31
             Parent_View   @30
             location      (-240, -30)
             label         (object SegLabel @32
            Parent_View    @31
            location    (1415, 427)
            anchor      1
            anchor_loc  1
            nlines      1
            max_width   450
            justify     0
            label       "ParentDepNo"
            pctDist     0.800000
            height      42
            orientation    0)
             quidu         "51634FD50354"
             client        @30
             supplier      @25
             line_style    3
             origin_attachment   (1456, 434)
             terminal_attachment    (1456, 425))
         (object RoleView "" @33
             Parent_View   @30
             location      (-240, -30)
             quidu         "51634FD50363"
             client        @30
             supplier      @25
             vertices      (list Points
            (1456, 434)
            (1456, 443)
            (1466, 443)
            (1466, 425))
             line_style    3
             origin_attachment   (1456, 425)
             terminal_attachment    (1454, 368))))
      (object AssociationViewNew "" @34
          location      (1641, 240)
          quidu         "51CB23340045"
          roleview_list    (list RoleViews
         (object RoleView "" @35
             Parent_View   @34
             location      (-71, -48)
             quidu         "51CB233600C9"
             client        @34
             supplier      @25
             line_style    3
             origin_attachment   (1641, 240)
             terminal_attachment    (1641, 311))
         (object RoleView "" @36
             Parent_View   @34
             location      (-71, -48)
             quidu         "51CB233600A0"
             client        @34
             supplier      @21
             line_style    3
             origin_attachment   (1641, 240)
             terminal_attachment    (1641, 169))))
      (object AssociationViewNew "$UNNAMED$24" @37
          location      (2419, 422)
          quidu         "533DB615022D"
          roleview_list    (list RoleViews
         (object RoleView "LrRequestOrg" @38
             Parent_View   @37
             location      (-477, -650)
             label         (object SegLabel @39
            Parent_View    @38
            location    (1983, 464)
            anchor      1
            anchor_loc  1
            nlines      1
            max_width   450
            justify     0
            label       "LrRequestOrg"
            pctDist     0.800000
            height      42
            orientation    0)
             quidu         "533DB61B01FF"
             client        @37
             supplier      @25
             line_style    3
             origin_attachment   (2419, 422)
             terminal_attachment    (1874, 422))
         (object RoleView "$UNNAMED$25" @40
             Parent_View   @37
             location      (-477, -650)
             quidu         "533DB61B0200"
             client        @37
             supplier      @19
             vertices      (list Points
            (2419, 422)
            (2659, 422)
            (2659, 728))
             line_style    3
             origin_attachment   (2419, 422)
             terminal_attachment    (2912, 728))))
      (object AssociationViewNew "$UNNAMED$26" @41
          location      (2487, 350)
          quidu         "533DB6270211"
          roleview_list    (list RoleViews
         (object RoleView "LrRequestDep" @42
             Parent_View   @41
             location      (-409, -722)
             label         (object SegLabel @43
            Parent_View    @42
            location    (1998, 392)
            anchor      1
            anchor_loc  1
            nlines      1
            max_width   450
            justify     0
            label       "LrRequestDep"
            pctDist     0.800000
            height      42
            orientation    0)
             quidu         "533DB62B0246"
             client        @41
             supplier      @25
             line_style    3
             origin_attachment   (2487, 350)
             terminal_attachment    (1874, 350))
         (object RoleView "$UNNAMED$27" @44
             Parent_View   @41
             location      (-409, -722)
             quidu         "533DB62B0247"
             client        @41
             supplier      @19
             vertices      (list Points
            (2487, 350)
            (2722, 350)
            (2722, 728))
             line_style    3
             origin_attachment   (2487, 350)
             terminal_attachment    (2912, 728))))
      (object ClassView "Class" "PersonInfo" @45
          location      (1744, 1312)
          label         (object ItemLabel
         Parent_View    @45
         location    (1556, 986)
         nlines      1
         max_width   375
         justify     0
         label       "PersonInfo")
          quidu         "361B5EF402EF"
          width         406
          height        675
          autoResize    TRUE)
      (object AssociationViewNew "$UNNAMED$28" @46
          location      (2302, 981)
          quidu         "533DB653034B"
          roleview_list    (list RoleViews
         (object RoleView "LrEditor" @47
             Parent_View   @46
             location      (-594, -91)
             label         (object SegLabel @48
            Parent_View    @47
            location    (2018, 940)
            anchor      1
            anchor_loc  1
            nlines      1
            max_width   450
            justify     0
            label       "LrEditor"
            pctDist     0.800000
            height      42
            orientation    1)
             quidu         "533DB65600C6"
             client        @46
             supplier      @45
             line_style    3
             origin_attachment   (2302, 981)
             terminal_attachment    (1947, 981))
         (object RoleView "$UNNAMED$29" @49
             Parent_View   @46
             location      (-594, -91)
             quidu         "533DB65600C8"
             client        @46
             supplier      @19
             line_style    3
             origin_attachment   (2302, 981)
             terminal_attachment    (2658, 981))))
      (object AssociationViewNew "$UNNAMED$30" @50
          location      (2302, 1065)
          quidu         "533DB6690298"
          roleview_list    (list RoleViews
         (object RoleView "LrAuditor" @51
             Parent_View   @50
             location      (-594, -7)
             label         (object SegLabel @52
            Parent_View    @51
            location    (2018, 1024)
            anchor      1
            anchor_loc  1
            nlines      1
            max_width   450
            justify     0
            label       "LrAuditor"
            pctDist     0.800000
            height      42
            orientation    1)
             quidu         "533DB66B0221"
             client        @50
             supplier      @45
             line_style    3
             origin_attachment   (2302, 1065)
             terminal_attachment    (1947, 1065))
         (object RoleView "$UNNAMED$31" @53
             Parent_View   @50
             location      (-594, -7)
             quidu         "533DB66B0222"
             client        @50
             supplier      @19
             line_style    3
             origin_attachment   (2302, 1065)
             terminal_attachment    (2658, 1065))))
      (object AssociationViewNew "$UNNAMED$32" @54
          location      (2302, 1206)
          quidu         "533DB68D00B4"
          roleview_list    (list RoleViews
         (object RoleView "LrApprover" @55
             Parent_View   @54
             location      (-594, 134)
             label         (object SegLabel @56
            Parent_View    @55
            location    (2018, 1165)
            anchor      1
            anchor_loc  1
            nlines      1
            max_width   450
            justify     0
            label       "LrApprover"
            pctDist     0.800000
            height      42
            orientation    1)
             quidu         "533DB68F0233"
             client        @54
             supplier      @45
             line_style    3
             origin_attachment   (2302, 1206)
             terminal_attachment    (1947, 1206))
         (object RoleView "$UNNAMED$33" @57
             Parent_View   @54
             location      (-594, 134)
             quidu         "533DB68F0234"
             client        @54
             supplier      @19
             line_style    3
             origin_attachment   (2302, 1206)
             terminal_attachment    (2658, 1206))))
      (object AssociationViewNew "$UNNAMED$34" @58
          location      (2302, 1312)
          quidu         "533DB6E00038"
          roleview_list    (list RoleViews
         (object RoleView "SgbEditor" @59
             Parent_View   @58
             location      (-610, 240)
             label         (object SegLabel @60
            Parent_View    @59
            location    (2018, 1271)
            anchor      1
            anchor_loc  1
            nlines      1
            max_width   450
            justify     0
            label       "SgbEditor"
            pctDist     0.800000
            height      42
            orientation    1)
             quidu         "533DB6E20081"
             client        @58
             supplier      @45
             line_style    3
             origin_attachment   (2302, 1312)
             terminal_attachment    (1947, 1312))
         (object RoleView "$UNNAMED$35" @61
             Parent_View   @58
             location      (-610, 240)
             quidu         "533DB6E20083"
             client        @58
             supplier      @19
             line_style    3
             origin_attachment   (2302, 1312)
             terminal_attachment    (2658, 1312))))
      (object AssociationViewNew "$UNNAMED$36" @62
          location      (2302, 1393)
          quidu         "533DB6FA03A5"
          roleview_list    (list RoleViews
         (object RoleView "SgbAuditor" @63
             Parent_View   @62
             location      (-610, 321)
             label         (object SegLabel @64
            Parent_View    @63
            location    (2018, 1352)
            anchor      1
            anchor_loc  1
            nlines      1
            max_width   450
            justify     0
            label       "SgbAuditor"
            pctDist     0.800000
            height      42
            orientation    1)
             quidu         "533DB6FD0043"
             client        @62
             supplier      @45
             line_style    3
             origin_attachment   (2302, 1393)
             terminal_attachment    (1947, 1393))
         (object RoleView "$UNNAMED$37" @65
             Parent_View   @62
             location      (-610, 321)
             quidu         "533DB6FD0044"
             client        @62
             supplier      @19
             line_style    3
             origin_attachment   (2302, 1393)
             terminal_attachment    (2658, 1393))))
      (object AssociationViewNew "$UNNAMED$38" @66
          location      (2302, 1471)
          quidu         "533DB71B004C"
          roleview_list    (list RoleViews
         (object RoleView "SgbApprover" @67
             Parent_View   @66
             location      (-610, 399)
             label         (object SegLabel @68
            Parent_View    @67
            location    (2018, 1430)
            anchor      1
            anchor_loc  1
            nlines      1
            max_width   450
            justify     0
            label       "SgbApprover"
            pctDist     0.800000
            height      42
            orientation    1)
             quidu         "533DB71D0042"
             client        @66
             supplier      @45
             line_style    3
             origin_attachment   (2302, 1471)
             terminal_attachment    (1947, 1471))
         (object RoleView "$UNNAMED$39" @69
             Parent_View   @66
             location      (-610, 399)
             quidu         "533DB71D0043"
             client        @66
             supplier      @19
             line_style    3
             origin_attachment   (2302, 1471)
             terminal_attachment    (2658, 1471))))
      (object AssociationViewNew "$UNNAMED$108" @70
          location      (2302, 1549)
          quidu         "53447ED3027A"
          roleview_list    (list RoleViews
         (object RoleView "ConClosePer" @71
             Parent_View   @70
             location      (-610, 381)
             label         (object SegLabel @72
            Parent_View    @71
            location    (2018, 1508)
            anchor      1
            anchor_loc  1
            nlines      1
            max_width   450
            justify     0
            label       "ConClosePer"
            pctDist     0.800000
            height      42
            orientation    1)
             quidu         "53447ED6000E"
             client        @70
             supplier      @45
             line_style    3
             origin_attachment   (2302, 1549)
             terminal_attachment    (1947, 1549))
         (object RoleView "$UNNAMED$109" @73
             Parent_View   @70
             location      (-610, 381)
             quidu         "53447ED6000F"
             client        @70
             supplier      @19
             line_style    3
             origin_attachment   (2302, 1549)
             terminal_attachment    (2658, 1549))))
      (object AssociationViewNew "$UNNAMED$110" @74
          location      (2302, 1606)
          quidu         "53447EEC0116"
          roleview_list    (list RoleViews
         (object RoleView "CnpeConfirmPer" @75
             Parent_View   @74
             location      (-610, 438)
             label         (object SegLabel @76
            Parent_View    @75
            location    (2018, 1565)
            anchor      1
            anchor_loc  1
            nlines      1
            max_width   450
            justify     0
            label       "CnpeConfirmPer"
            pctDist     0.800000
            height      42
            orientation    1)
             quidu         "53447EEE005B"
             client        @74
             supplier      @45
             line_style    3
             origin_attachment   (2302, 1606)
             terminal_attachment    (1947, 1606))
         (object RoleView "$UNNAMED$111" @77
             Parent_View   @74
             location      (-610, 438)
             quidu         "53447EEE005D"
             client        @74
             supplier      @19
             line_style    3
             origin_attachment   (2302, 1606)
             terminal_attachment    (2658, 1606))))
      (object ClassView "Class" "GeneralStructure" @78
          location      (1712, 864)
          label         (object ItemLabel
         Parent_View    @78
         location    (1548, 818)
         nlines      1
         max_width   327
         justify     0
         label       "GeneralStructure")
          quidu         "5266BEB90366"
          width         354
          height        115
          autoResize    TRUE)
      (object ClassView "Class" "ConstrBreakGroundReq" @79
          IncludeAttribute    TRUE
          location      (512, 1136)
          label         (object ItemLabel
         Parent_View    @79
         location    (272, 660)
         nlines      1
         max_width   479
         justify     0
         label       "ConstrBreakGroundReq")
          quidu         "533C990C02B5"
          width         518
          height        974
          annotation    8
          autoResize    TRUE)
      (object AssociationViewNew "$UNNAMED$6" @80
          location      (1154, 662)
          quidu         "533CA26301D8"
          roleview_list    (list RoleViews
         (object RoleView "$UNNAMED$7" @81
             Parent_View   @80
             location      (306, -298)
             quidu         "533CA2640233"
             client        @80
             supplier      @20
             line_style    3
             origin_attachment   (1154, 662)
             terminal_attachment    (1537, 662))
         (object RoleView "$UNNAMED$8" @82
             Parent_View   @80
             location      (306, -298)
             quidu         "533CA2640234"
             client        @80
             supplier      @79
             line_style    3
             origin_attachment   (1154, 662)
             terminal_attachment    (771, 662))))
      (object AssociationViewNew "$UNNAMED$9" @83
          location      (1156, 1046)
          quidu         "533DB4E60348"
          roleview_list    (list RoleViews
         (object RoleView "BgRequestor" @84
             Parent_View   @83
             location      (532, -122)
             label         (object SegLabel @85
            Parent_View    @84
            location    (1464, 1005)
            anchor      1
            anchor_loc  1
            nlines      1
            max_width   450
            justify     0
            label       "BgRequestor"
            pctDist     0.800000
            height      42
            orientation    0)
             quidu         "533DB4E800DB"
             client        @83
             supplier      @45
             line_style    3
             origin_attachment   (1156, 1046)
             terminal_attachment    (1541, 1046))
         (object RoleView "$UNNAMED$10" @86
             Parent_View   @83
             location      (532, -122)
             quidu         "533DB4E800DD"
             client        @83
             supplier      @79
             line_style    3
             origin_attachment   (1156, 1046)
             terminal_attachment    (771, 1046))))
      (object AssociationViewNew "$UNNAMED$11" @87
          location      (1156, 1159)
          quidu         "533DB4F60355"
          roleview_list    (list RoleViews
         (object RoleView "BgReqAuditor" @88
             Parent_View   @87
             location      (532, -9)
             label         (object SegLabel @89
            Parent_View    @88
            location    (1464, 1118)
            anchor      1
            anchor_loc  1
            nlines      1
            max_width   450
            justify     0
            label       "BgReqAuditor"
            pctDist     0.800000
            height      42
            orientation    0)
             quidu         "533DB4F70347"
             client        @87
             supplier      @45
             line_style    3
             origin_attachment   (1156, 1159)
             terminal_attachment    (1541, 1159))
         (object RoleView "$UNNAMED$12" @90
             Parent_View   @87
             location      (532, -9)
             quidu         "533DB4F70348"
             client        @87
             supplier      @79
             line_style    3
             origin_attachment   (1156, 1159)
             terminal_attachment    (771, 1159))))
      (object AssociationViewNew "$UNNAMED$13" @91
          location      (1156, 1231)
          quidu         "533DB50000ED"
          roleview_list    (list RoleViews
         (object RoleView "BgReqApprover" @92
             Parent_View   @91
             location      (532, 63)
             label         (object SegLabel @93
            Parent_View    @92
            location    (1464, 1190)
            anchor      1
            anchor_loc  1
            nlines      1
            max_width   450
            justify     0
            label       "BgReqApprover"
            pctDist     0.800000
            height      42
            orientation    0)
             quidu         "533DB50300F9"
             client        @91
             supplier      @45
             line_style    3
             origin_attachment   (1156, 1231)
             terminal_attachment    (1541, 1231))
         (object RoleView "$UNNAMED$14" @94
             Parent_View   @91
             location      (532, 63)
             quidu         "533DB50300FA"
             client        @91
             supplier      @79
             line_style    3
             origin_attachment   (1156, 1231)
             terminal_attachment    (771, 1231))))
      (object AssociationViewNew "$UNNAMED$15" @95
          location      (1156, 1334)
          quidu         "533DB51001B3"
          roleview_list    (list RoleViews
         (object RoleView "SgbEditor" @96
             Parent_View   @95
             location      (532, 166)
             label         (object SegLabel @97
            Parent_View    @96
            location    (1464, 1293)
            anchor      1
            anchor_loc  1
            nlines      1
            max_width   450
            justify     0
            label       "SgbEditor"
            pctDist     0.800000
            height      42
            orientation    0)
             quidu         "533DB5120069"
             client        @95
             supplier      @45
             line_style    3
             origin_attachment   (1156, 1334)
             terminal_attachment    (1541, 1334))
         (object RoleView "$UNNAMED$16" @98
             Parent_View   @95
             location      (532, 166)
             quidu         "533DB512006A"
             client        @95
             supplier      @79
             line_style    3
             origin_attachment   (1156, 1334)
             terminal_attachment    (771, 1334))))
      (object AssociationViewNew "$UNNAMED$17" @99
          location      (1156, 1390)
          quidu         "533DB5370038"
          roleview_list    (list RoleViews
         (object RoleView "SgbAuditor" @100
             Parent_View   @99
             location      (532, 222)
             label         (object SegLabel @101
            Parent_View    @100
            location    (1464, 1349)
            anchor      1
            anchor_loc  1
            nlines      1
            max_width   450
            justify     0
            label       "SgbAuditor"
            pctDist     0.800000
            height      42
            orientation    0)
             quidu         "533DB53900AD"
             client        @99
             supplier      @45
             line_style    3
             origin_attachment   (1156, 1390)
             terminal_attachment    (1541, 1390))
         (object RoleView "$UNNAMED$18" @102
             Parent_View   @99
             location      (532, 222)
             quidu         "533DB53900AE"
             client        @99
             supplier      @79
             line_style    3
             origin_attachment   (1156, 1390)
             terminal_attachment    (771, 1390))))
      (object AssociationViewNew "$UNNAMED$19" @103
          location      (1156, 1493)
          quidu         "533DB54802D8"
          roleview_list    (list RoleViews
         (object RoleView "SgbApprover" @104
             Parent_View   @103
             location      (532, 325)
             label         (object SegLabel @105
            Parent_View    @104
            location    (1464, 1452)
            anchor      1
            anchor_loc  1
            nlines      1
            max_width   450
            justify     0
            label       "SgbApprover"
            pctDist     0.800000
            height      42
            orientation    0)
             quidu         "533DB54A01DF"
             client        @103
             supplier      @45
             line_style    3
             origin_attachment   (1156, 1493)
             terminal_attachment    (1541, 1493))
         (object RoleView "$UNNAMED$20" @106
             Parent_View   @103
             location      (532, 325)
             quidu         "533DB54A01E0"
             client        @103
             supplier      @79
             line_style    3
             origin_attachment   (1156, 1493)
             terminal_attachment    (771, 1493))))
      (object AssociationViewNew "$UNNAMED$3" @107
          location      (748, 106)
          quidu         "533CA24103DE"
          roleview_list    (list RoleViews
         (object RoleView "$UNNAMED$4" @108
             Parent_View   @107
             location      (-100, -854)
             quidu         "533CA2430111"
             client        @107
             supplier      @21
             line_style    3
             origin_attachment   (748, 106)
             terminal_attachment    (1517, 106))
         (object RoleView "$UNNAMED$5" @109
             Parent_View   @107
             location      (-100, -854)
             quidu         "533CA2430112"
             client        @107
             supplier      @79
             vertices      (list Points
            (748, 106)
            (522, 106)
            (522, 649))
             line_style    3
             origin_attachment   (748, 106)
             terminal_attachment    (512, 649))))
      (object AssociationViewNew "$UNNAMED$100" @110
          location      (882, 365)
          quidu         "534479CD01E4"
          roleview_list    (list RoleViews
         (object RoleView "BgRequestOrg " @111
             Parent_View   @110
             location      (290, -787)
             label         (object SegLabel @112
            Parent_View    @111
            location    (1339, 324)
            anchor      1
            anchor_loc  1
            nlines      1
            max_width   450
            justify     0
            label       "BgRequestOrg "
            pctDist     0.800000
            height      42
            orientation    0)
             quidu         "534479CF0160"
             client        @110
             supplier      @25
             line_style    3
             origin_attachment   (882, 365)
             terminal_attachment    (1454, 365))
         (object RoleView "$UNNAMED$101" @113
             Parent_View   @110
             location      (290, -787)
             quidu         "534479CF0161"
             client        @110
             supplier      @79
             vertices      (list Points
            (882, 365)
            (594, 365)
            (594, 649))
             line_style    3
             origin_attachment   (882, 365)
             terminal_attachment    (512, 649))))
      (object AssociationViewNew "$UNNAMED$102" @114
          location      (956, 415)
          quidu         "53447C6C012A"
          roleview_list    (list RoleViews
         (object RoleView "BgRequestDep " @115
             Parent_View   @114
             location      (444, -721)
             label         (object SegLabel @116
            Parent_View    @115
            location    (1353, 374)
            anchor      1
            anchor_loc  1
            nlines      1
            max_width   450
            justify     0
            label       "BgRequestDep "
            pctDist     0.800000
            height      42
            orientation    0)
             quidu         "53447C6E0247"
             client        @114
             supplier      @25
             line_style    3
             origin_attachment   (956, 415)
             terminal_attachment    (1454, 415))
         (object RoleView "$UNNAMED$103" @117
             Parent_View   @114
             location      (444, -721)
             quidu         "53447C6E0248"
             client        @114
             supplier      @79
             vertices      (list Points
            (956, 415)
            (691, 415)
            (691, 649))
             line_style    3
             origin_attachment   (956, 415)
             terminal_attachment    (512, 649))))
      (object AssociationViewNew "$UNNAMED$104" @118
          location      (1156, 1565)
          quidu         "53447E4C027D"
          roleview_list    (list RoleViews
         (object RoleView "ConClosePer" @119
             Parent_View   @118
             location      (644, 429)
             label         (object SegLabel @120
            Parent_View    @119
            location    (1464, 1524)
            anchor      1
            anchor_loc  1
            nlines      1
            max_width   450
            justify     0
            label       "ConClosePer"
            pctDist     0.800000
            height      42
            orientation    0)
             quidu         "53447E4F01A8"
             client        @118
             supplier      @45
             line_style    3
             origin_attachment   (1156, 1565)
             terminal_attachment    (1541, 1565))
         (object RoleView "$UNNAMED$105" @121
             Parent_View   @118
             location      (644, 429)
             quidu         "53447E4F01AA"
             client        @118
             supplier      @79
             line_style    3
             origin_attachment   (1156, 1565)
             terminal_attachment    (771, 1565))))
      (object AssociationViewNew "$UNNAMED$106" @122
          location      (1156, 1615)
          quidu         "53447E5E006D"
          roleview_list    (list RoleViews
         (object RoleView "CnpeConfirmPer" @123
             Parent_View   @122
             location      (644, 479)
             label         (object SegLabel @124
            Parent_View    @123
            location    (1464, 1574)
            anchor      1
            anchor_loc  1
            nlines      1
            max_width   450
            justify     0
            label       "CnpeConfirmPer"
            pctDist     0.800000
            height      42
            orientation    0)
             quidu         "53447E6002A5"
             client        @122
             supplier      @45
             line_style    3
             origin_attachment   (1156, 1615)
             terminal_attachment    (1541, 1615))
         (object RoleView "$UNNAMED$107" @125
             Parent_View   @122
             location      (644, 479)
             quidu         "53447E6002A6"
             client        @122
             supplier      @79
             line_style    3
             origin_attachment   (1156, 1615)
             terminal_attachment    (771, 1615))))
      (object AssociationViewNew "$UNNAMED$115" @126
          location      (1153, 878)
          quidu         "53448A6503D9"
          roleview_list    (list RoleViews
         (object RoleView "$UNNAMED$116" @127
             Parent_View   @126
             location      (641, -258)
             quidu         "53448A670181"
             client        @126
             supplier      @78
             line_style    3
             origin_attachment   (1153, 878)
             terminal_attachment    (1535, 878))
         (object RoleView "$UNNAMED$117" @128
             Parent_View   @126
             location      (641, -258)
             quidu         "53448A67019C"
             client        @126
             supplier      @79
             line_style    3
             origin_attachment   (1153, 878)
             terminal_attachment    (771, 878))))))
   (object ClassDiagram "Departure"
       quid          "533DC61900FA"
       title         "Departure"
       zoom          100
       max_height    28350
       max_width     21600
       origin_x      250
       origin_y      0
       items         (list diagram_item_list
      (object ClassView "Class" "GeneralOrganization" @129
          location      (672, 720)
          label         (object ItemLabel
         Parent_View    @129
         location    (477, 674)
         nlines      1
         max_width   388
         justify     0
         label       "GeneralOrganization")
          quidu         "51634D3401DD"
          width         420
          height        115
          autoResize    TRUE)
      (object AssociationViewNew "" @130
          location      (846, 945)
          quidu         "51634FAD00C6"
          roleview_list    (list RoleViews
         (object RoleView "ParentOrgNo" @131
             Parent_View   @130
             location      (-290, 337)
             label         (object SegLabel @132
            Parent_View    @131
            location    (631, 846)
            anchor      1
            anchor_loc  1
            nlines      1
            max_width   450
            justify     0
            label       "ParentOrgNo"
            pctDist     0.800000
            height      42
            orientation    0)
             quidu         "51634FB000F0"
             client        @130
             supplier      @129
             vertices      (list Points
            (846, 945)
            (672, 945)
            (672, 777))
             line_style    3
             origin_attachment   (846, 945)
             terminal_attachment    (672, 777))
         (object RoleView "" @133
             Parent_View   @130
             location      (-290, 337)
             quidu         "51634FB00100"
             client        @130
             supplier      @129
             vertices      (list Points
            (846, 945)
            (922, 945)
            (922, 720)
            (882, 720))
             line_style    3
             origin_attachment   (845, 662)
             terminal_attachment    (845, 663))))
      (object AssociationViewNew "" @134
          location      (846, 945)
          quidu         "51634FD1007D"
          roleview_list    (list RoleViews
         (object RoleView "ParentDepNo" @135
             Parent_View   @134
             location      (-290, 337)
             label         (object SegLabel @136
            Parent_View    @135
            location    (631, 846)
            anchor      1
            anchor_loc  1
            nlines      1
            max_width   450
            justify     0
            label       "ParentDepNo"
            pctDist     0.800000
            height      42
            orientation    0)
             quidu         "51634FD50354"
             client        @134
             supplier      @129
             vertices      (list Points
            (846, 945)
            (672, 945)
            (672, 777))
             line_style    3
             origin_attachment   (846, 945)
             terminal_attachment    (672, 777))
         (object RoleView "" @137
             Parent_View   @134
             location      (-290, 337)
             quidu         "51634FD50363"
             client        @134
             supplier      @129
             vertices      (list Points
            (846, 945)
            (922, 945)
            (922, 720)
            (882, 720))
             line_style    3
             origin_attachment   (845, 662)
             terminal_attachment    (845, 663))))
      (object ClassView "Class" "PersonInfo" @138
          location      (3040, 816)
          label         (object ItemLabel
         Parent_View    @138
         location    (2947, 140)
         nlines      1
         max_width   185
         justify     0
         label       "PersonInfo")
          quidu         "361B5EF402EF"
          width         200
          height        1375
          autoResize    TRUE)
      (object ClassView "Class" "ConstrDepartureCause" @139
          IncludeAttribute    TRUE
          location      (1440, 480)
          label         (object ItemLabel
         Parent_View    @139
         location    (1220, 357)
         nlines      1
         max_width   438
         justify     0
         label       "ConstrDepartureCause")
          quidu         "533DB80900A0"
          compartment   (object Compartment
         Parent_View    @139
         location    (1212, 414)
         anchor      2
         nlines      4
         max_width   397)
          width         474
          height        268
          annotation    8
          autoResize    TRUE)
      (object ClassView "Class" "GeneralMachGroup" @140
          location      (1408, 864)
          label         (object ItemLabel
         Parent_View    @140
         location    (1223, 818)
         nlines      1
         max_width   368
         justify     0
         label       "GeneralMachGroup")
          quidu         "5266F7030067"
          width         398
          height        115
          autoResize    TRUE)
      (object ClassView "Class" "GeneralSystem" @141
          location      (1408, 1184)
          label         (object ItemLabel
         Parent_View    @141
         location    (1260, 1138)
         nlines      1
         max_width   294
         justify     0
         label       "GeneralSystem")
          quidu         "5266BEB10304"
          width         318
          height        115
          autoResize    TRUE)
      (object ClassView "Class" "GeneralSpecialty" @142
          location      (1408, 1360)
          label         (object ItemLabel
         Parent_View    @142
         location    (1248, 1314)
         nlines      1
         max_width   318
         justify     0
         label       "GeneralSpecialty")
          quidu         "5266C359005A"
          width         344
          height        115
          autoResize    TRUE)
      (object ClassView "Class" "GeneralProject" @143
          location      (1232, 144)
          label         (object ItemLabel
         Parent_View    @143
         location    (1086, 98)
         nlines      1
         max_width   290
         justify     0
         label       "GeneralProject")
          quidu         "51CB21D3024F"
          width         314
          height        115
          autoResize    TRUE)
      (object AssociationViewNew "$UNNAMED$40" @144
          location      (1312, 273)
          quidu         "533DC72B0084"
          roleview_list    (list RoleViews
         (object RoleView "$UNNAMED$41" @145
             Parent_View   @144
             location      (480, -559)
             quidu         "533DC72D016F"
             client        @144
             supplier      @143
             line_style    3
             origin_attachment   (1312, 273)
             terminal_attachment    (1312, 201))
         (object RoleView "$UNNAMED$42" @146
             Parent_View   @144
             location      (480, -559)
             quidu         "533DC72D0170"
             client        @144
             supplier      @139
             line_style    3
             origin_attachment   (1312, 273)
             terminal_attachment    (1312, 346))))
      (object AssociationViewNew "" @147
          location      (725, 260)
          quidu         "51CB23340045"
          roleview_list    (list RoleViews
         (object RoleView "" @148
             Parent_View   @147
             location      (-523, 4)
             quidu         "51CB233600C9"
             client        @147
             supplier      @129
             line_style    3
             origin_attachment   (725, 260)
             terminal_attachment    (725, 663))
         (object RoleView "" @149
             Parent_View   @147
             location      (-523, 4)
             quidu         "51CB233600A0"
             client        @147
             supplier      @143
             vertices      (list Points
            (725, 260)
            (725, 200)
            (1075, 200))
             line_style    3
             origin_attachment   (725, 260)
             terminal_attachment    (1075, 144))))
      (object ClassView "Class" "GeneralStructure" @150
          location      (1392, 1024)
          label         (object ItemLabel
         Parent_View    @150
         location    (1228, 978)
         nlines      1
         max_width   327
         justify     0
         label       "GeneralStructure")
          quidu         "5266BEB90366"
          width         354
          height        115
          autoResize    TRUE)
      (object ClassView "Class" "ConstrDepartureReq" @151
          IncludeAttribute    TRUE
          location      (2128, 768)
          label         (object ItemLabel
         Parent_View    @151
         location    (1868, 52)
         nlines      1
         max_width   519
         justify     0
         label       "ConstrDepartureReq")
          quidu         "533DC8470369"
          compartment   (object Compartment
         Parent_View    @151
         location    (1856, 109)
         anchor      2
         nlines      28
         max_width   516)
          width         562
          height        1455
          annotation    8)
      (object AssociationViewNew "$UNNAMED$43" @152
          location      (1364, 665)
          quidu         "533DD330039C"
          roleview_list    (list RoleViews
         (object RoleView "ApplyUnit" @153
             Parent_View   @152
             location      (-396, -151)
             label         (object SegLabel @154
            Parent_View    @153
            location    (978, 624)
            anchor      1
            anchor_loc  1
            nlines      1
            max_width   450
            justify     0
            label       "ApplyUnit"
            pctDist     0.800000
            height      42
            orientation    1)
             quidu         "533DD3320343"
             client        @152
             supplier      @129
             line_style    3
             origin_attachment   (1364, 665)
             terminal_attachment    (882, 665))
         (object RoleView "$UNNAMED$44" @155
             Parent_View   @152
             location      (-396, -151)
             quidu         "533DD3320344"
             client        @152
             supplier      @151
             line_style    3
             origin_attachment   (1364, 665)
             terminal_attachment    (1847, 665))))
      (object AssociationViewNew "$UNNAMED$45" @156
          location      (1364, 759)
          quidu         "533DD34B0113"
          roleview_list    (list RoleViews
         (object RoleView "ApplyDepartment" @157
             Parent_View   @156
             location      (-396, -57)
             label         (object SegLabel @158
            Parent_View    @157
            location    (978, 718)
            anchor      1
            anchor_loc  1
            nlines      1
            max_width   450
            justify     0
            label       "ApplyDepartment"
            pctDist     0.800000
            height      42
            orientation    1)
             quidu         "533DD34D0390"
             client        @156
             supplier      @129
             line_style    3
             origin_attachment   (1364, 759)
             terminal_attachment    (882, 759))
         (object RoleView "$UNNAMED$46" @159
             Parent_View   @156
             location      (-396, -57)
             quidu         "533DD34D0391"
             client        @156
             supplier      @151
             line_style    3
             origin_attachment   (1364, 759)
             terminal_attachment    (1847, 759))))
      (object AssociationViewNew "$UNNAMED$47" @160
          location      (2674, 181)
          quidu         "533DD3960247"
          roleview_list    (list RoleViews
         (object RoleView "DraftPerson" @161
             Parent_View   @160
             location      (738, -635)
             label         (object SegLabel @162
            Parent_View    @161
            location    (2886, 140)
            anchor      1
            anchor_loc  1
            nlines      1
            max_width   450
            justify     0
            label       "DraftPerson"
            pctDist     0.800000
            height      42
            orientation    0)
             quidu         "533DD39803BC"
             client        @160
             supplier      @138
             line_style    3
             origin_attachment   (2674, 181)
             terminal_attachment    (2940, 181))
         (object RoleView "$UNNAMED$48" @163
             Parent_View   @160
             location      (738, -635)
             quidu         "533DD39803BD"
             client        @160
             supplier      @151
             line_style    3
             origin_attachment   (2674, 181)
             terminal_attachment    (2409, 181))))
      (object AssociationViewNew "$UNNAMED$49" @164
          location      (2674, 247)
          quidu         "533DD3B30240"
          roleview_list    (list RoleViews
         (object RoleView "Auditor" @165
             Parent_View   @164
             location      (706, -553)
             label         (object SegLabel @166
            Parent_View    @165
            location    (2886, 206)
            anchor      1
            anchor_loc  1
            nlines      1
            max_width   450
            justify     0
            label       "Auditor"
            pctDist     0.800000
            height      42
            orientation    0)
             quidu         "533DD3B601D4"
             client        @164
             supplier      @138
             line_style    3
             origin_attachment   (2674, 247)
             terminal_attachment    (2940, 247))
         (object RoleView "$UNNAMED$50" @167
             Parent_View   @164
             location      (706, -553)
             quidu         "533DD3B601D5"
             client        @164
             supplier      @151
             line_style    3
             origin_attachment   (2674, 247)
             terminal_attachment    (2409, 247))))
      (object AssociationViewNew "$UNNAMED$51" @168
          location      (2674, 325)
          quidu         "533DD3C40173"
          roleview_list    (list RoleViews
         (object RoleView "Approver" @169
             Parent_View   @168
             location      (706, -475)
             label         (object SegLabel @170
            Parent_View    @169
            location    (2886, 284)
            anchor      1
            anchor_loc  1
            nlines      1
            max_width   450
            justify     0
            label       "Approver"
            pctDist     0.800000
            height      42
            orientation    0)
             quidu         "533DD3C5038F"
             client        @168
             supplier      @138
             line_style    3
             origin_attachment   (2674, 325)
             terminal_attachment    (2940, 325))
         (object RoleView "$UNNAMED$52" @171
             Parent_View   @168
             location      (706, -475)
             quidu         "533DD3C50390"
             client        @168
             supplier      @151
             line_style    3
             origin_attachment   (2674, 325)
             terminal_attachment    (2409, 325))))
      (object AssociationViewNew "$UNNAMED$53" @172
          location      (2674, 422)
          quidu         "533DD3D10013"
          roleview_list    (list RoleViews
         (object RoleView "BsemAuditor" @173
             Parent_View   @172
             location      (706, -378)
             label         (object SegLabel @174
            Parent_View    @173
            location    (2886, 381)
            anchor      1
            anchor_loc  1
            nlines      1
            max_width   450
            justify     0
            label       "BsemAuditor"
            pctDist     0.800000
            height      42
            orientation    0)
             quidu         "533DD3D301D9"
             client        @172
             supplier      @138
             line_style    3
             origin_attachment   (2674, 422)
             terminal_attachment    (2940, 422))
         (object RoleView "$UNNAMED$54" @175
             Parent_View   @172
             location      (706, -378)
             quidu         "533DD3D301DB"
             client        @172
             supplier      @151
             line_style    3
             origin_attachment   (2674, 422)
             terminal_attachment    (2409, 422))))
      (object AssociationViewNew "$UNNAMED$55" @176
          location      (2674, 515)
          quidu         "533DD3E00313"
          roleview_list    (list RoleViews
         (object RoleView "BsemApprover" @177
             Parent_View   @176
             location      (706, -285)
             label         (object SegLabel @178
            Parent_View    @177
            location    (2886, 474)
            anchor      1
            anchor_loc  1
            nlines      1
            max_width   450
            justify     0
            label       "BsemApprover"
            pctDist     0.800000
            height      42
            orientation    0)
             quidu         "533DD3E20160"
             client        @176
             supplier      @138
             line_style    3
             origin_attachment   (2674, 515)
             terminal_attachment    (2940, 515))
         (object RoleView "$UNNAMED$56" @179
             Parent_View   @176
             location      (706, -285)
             quidu         "533DD3E20161"
             client        @176
             supplier      @151
             line_style    3
             origin_attachment   (2674, 515)
             terminal_attachment    (2409, 515))))
      (object AssociationViewNew "$UNNAMED$57" @180
          location      (2674, 612)
          quidu         "533DD3F401B2"
          roleview_list    (list RoleViews
         (object RoleView "PcbAuditor" @181
             Parent_View   @180
             location      (706, -188)
             label         (object SegLabel @182
            Parent_View    @181
            location    (2886, 571)
            anchor      1
            anchor_loc  1
            nlines      1
            max_width   450
            justify     0
            label       "PcbAuditor"
            pctDist     0.800000
            height      42
            orientation    0)
             quidu         "533DD3F603DE"
             client        @180
             supplier      @138
             line_style    3
             origin_attachment   (2674, 612)
             terminal_attachment    (2940, 612))
         (object RoleView "$UNNAMED$58" @183
             Parent_View   @180
             location      (706, -188)
             quidu         "533DD3F603DF"
             client        @180
             supplier      @151
             line_style    3
             origin_attachment   (2674, 612)
             terminal_attachment    (2409, 612))))
      (object AssociationViewNew "$UNNAMED$59" @184
          location      (2674, 709)
          quidu         "533DD407006F"
          roleview_list    (list RoleViews
         (object RoleView "PcbApprover" @185
             Parent_View   @184
             location      (706, -91)
             label         (object SegLabel @186
            Parent_View    @185
            location    (2886, 668)
            anchor      1
            anchor_loc  1
            nlines      1
            max_width   450
            justify     0
            label       "PcbApprover"
            pctDist     0.800000
            height      42
            orientation    0)
             quidu         "533DD408034B"
             client        @184
             supplier      @138
             line_style    3
             origin_attachment   (2674, 709)
             terminal_attachment    (2940, 709))
         (object RoleView "$UNNAMED$60" @187
             Parent_View   @184
             location      (706, -91)
             quidu         "533DD408034C"
             client        @184
             supplier      @151
             line_style    3
             origin_attachment   (2674, 709)
             terminal_attachment    (2409, 709))))
      (object AssociationViewNew "$UNNAMED$61" @188
          location      (2674, 806)
          quidu         "533DD41602F7"
          roleview_list    (list RoleViews
         (object RoleView "OwnerAuditor" @189
             Parent_View   @188
             location      (706, 6)
             label         (object SegLabel @190
            Parent_View    @189
            location    (2886, 765)
            anchor      1
            anchor_loc  1
            nlines      1
            max_width   450
            justify     0
            label       "OwnerAuditor"
            pctDist     0.800000
            height      42
            orientation    0)
             quidu         "533DD41801EE"
             client        @188
             supplier      @138
             line_style    3
             origin_attachment   (2674, 806)
             terminal_attachment    (2940, 806))
         (object RoleView "$UNNAMED$62" @191
             Parent_View   @188
             location      (706, 6)
             quidu         "533DD41801EF"
             client        @188
             supplier      @151
             line_style    3
             origin_attachment   (2674, 806)
             terminal_attachment    (2409, 806))))
      (object AssociationViewNew "$UNNAMED$63" @192
          location      (2674, 965)
          quidu         "533DD47E036A"
          roleview_list    (list RoleViews
         (object RoleView "ExecuteDrafter" @193
             Parent_View   @192
             location      (706, 165)
             label         (object SegLabel @194
            Parent_View    @193
            location    (2886, 924)
            anchor      1
            anchor_loc  1
            nlines      1
            max_width   450
            justify     0
            label       "ExecuteDrafter"
            pctDist     0.800000
            height      42
            orientation    0)
             quidu         "533DD4810135"
             client        @192
             supplier      @138
             line_style    3
             origin_attachment   (2674, 965)
             terminal_attachment    (2940, 965))
         (object RoleView "$UNNAMED$64" @195
             Parent_View   @192
             location      (706, 165)
             quidu         "533DD4810136"
             client        @192
             supplier      @151
             line_style    3
             origin_attachment   (2674, 965)
             terminal_attachment    (2409, 965))))
      (object AssociationViewNew "$UNNAMED$65" @196
          location      (2674, 1109)
          quidu         "533DD48C0192"
          roleview_list    (list RoleViews
         (object RoleView "ApplyClosePer" @197
             Parent_View   @196
             location      (706, 309)
             label         (object SegLabel @198
            Parent_View    @197
            location    (2886, 1068)
            anchor      1
            anchor_loc  1
            nlines      1
            max_width   450
            justify     0
            label       "ApplyClosePer"
            pctDist     0.800000
            height      42
            orientation    0)
             quidu         "533DD48D01FE"
             client        @196
             supplier      @138
             line_style    3
             origin_attachment   (2674, 1109)
             terminal_attachment    (2940, 1109))
         (object RoleView "$UNNAMED$66" @199
             Parent_View   @196
             location      (706, 309)
             quidu         "533DD48D0200"
             client        @196
             supplier      @151
             line_style    3
             origin_attachment   (2674, 1109)
             terminal_attachment    (2409, 1109))))
      (object AssociationViewNew "$UNNAMED$67" @200
          location      (2674, 1253)
          quidu         "533DD4A20392"
          roleview_list    (list RoleViews
         (object RoleView "BsemClosePer" @201
             Parent_View   @200
             location      (706, 453)
             label         (object SegLabel @202
            Parent_View    @201
            location    (2886, 1212)
            anchor      1
            anchor_loc  1
            nlines      1
            max_width   450
            justify     0
            label       "BsemClosePer"
            pctDist     0.800000
            height      42
            orientation    0)
             quidu         "533DD4A4030E"
             client        @200
             supplier      @138
             line_style    3
             origin_attachment   (2674, 1253)
             terminal_attachment    (2940, 1253))
         (object RoleView "$UNNAMED$68" @203
             Parent_View   @200
             location      (706, 453)
             quidu         "533DD4A4030F"
             client        @200
             supplier      @151
             line_style    3
             origin_attachment   (2674, 1253)
             terminal_attachment    (2409, 1253))))
      (object AssociationViewNew "$UNNAMED$69" @204
          location      (2674, 1331)
          quidu         "533DD4C502C0"
          roleview_list    (list RoleViews
         (object RoleView "PcbClosePer" @205
             Parent_View   @204
             location      (706, 531)
             label         (object SegLabel @206
            Parent_View    @205
            location    (2886, 1290)
            anchor      1
            anchor_loc  1
            nlines      1
            max_width   450
            justify     0
            label       "PcbClosePer"
            pctDist     0.800000
            height      42
            orientation    0)
             quidu         "533DD4C7003D"
             client        @204
             supplier      @138
             line_style    3
             origin_attachment   (2674, 1331)
             terminal_attachment    (2940, 1331))
         (object RoleView "$UNNAMED$70" @207
             Parent_View   @204
             location      (706, 531)
             quidu         "533DD4C7003E"
             client        @204
             supplier      @151
             line_style    3
             origin_attachment   (2674, 1331)
             terminal_attachment    (2409, 1331))))
      (object AssociationViewNew "$UNNAMED$71" @208
          location      (2674, 1449)
          quidu         "533DD4D20227"
          roleview_list    (list RoleViews
         (object RoleView "OwnerClosePer" @209
             Parent_View   @208
             location      (706, 649)
             label         (object SegLabel @210
            Parent_View    @209
            location    (2886, 1408)
            anchor      1
            anchor_loc  1
            nlines      1
            max_width   450
            justify     0
            label       "OwnerClosePer"
            pctDist     0.800000
            height      42
            orientation    0)
             quidu         "533DD4D4020F"
             client        @208
             supplier      @138
             line_style    3
             origin_attachment   (2674, 1449)
             terminal_attachment    (2940, 1449))
         (object RoleView "$UNNAMED$72" @211
             Parent_View   @208
             location      (706, 649)
             quidu         "533DD4D40210"
             client        @208
             supplier      @151
             line_style    3
             origin_attachment   (2674, 1449)
             terminal_attachment    (2409, 1449))))
      (object AssociationViewNew "$UNNAMED$73" @212
          location      (1762, 415)
          quidu         "533DD647012A"
          roleview_list    (list RoleViews
         (object RoleView "$UNNAMED$74" @213
             Parent_View   @212
             location      (-350, -369)
             quidu         "533DD64900F2"
             client        @212
             supplier      @139
             line_style    3
             origin_attachment   (1762, 415)
             terminal_attachment    (1677, 415))
         (object RoleView "$UNNAMED$75" @214
             Parent_View   @212
             location      (-350, -369)
             quidu         "533DD649010E"
             client        @212
             supplier      @151
             line_style    3
             origin_attachment   (1762, 415)
             terminal_attachment    (1847, 415))))
      (object AssociationViewNew "$UNNAMED$76" @215
          location      (1727, 846)
          quidu         "533DD6E10374"
          roleview_list    (list RoleViews
         (object RoleView "$UNNAMED$77" @216
             Parent_View   @215
             location      (-385, 62)
             quidu         "533DD6E20339"
             client        @215
             supplier      @140
             line_style    3
             origin_attachment   (1727, 846)
             terminal_attachment    (1607, 846))
         (object RoleView "$UNNAMED$78" @217
             Parent_View   @215
             location      (-385, 62)
             quidu         "533DD6E2033A"
             client        @215
             supplier      @151
             line_style    3
             origin_attachment   (1727, 846)
             terminal_attachment    (1847, 846))))
      (object AssociationViewNew "$UNNAMED$82" @218
          location      (1707, 1165)
          quidu         "533DD6EC0027"
          roleview_list    (list RoleViews
         (object RoleView "$UNNAMED$83" @219
             Parent_View   @218
             location      (-405, 381)
             quidu         "533DD6EC0340"
             client        @218
             supplier      @141
             line_style    3
             origin_attachment   (1707, 1165)
             terminal_attachment    (1567, 1165))
         (object RoleView "$UNNAMED$84" @220
             Parent_View   @218
             location      (-405, 381)
             quidu         "533DD6EC0341"
             client        @218
             supplier      @151
             line_style    3
             origin_attachment   (1707, 1165)
             terminal_attachment    (1847, 1165))))
      (object AssociationViewNew "$UNNAMED$85" @221
          location      (1713, 1359)
          quidu         "533DD6ED01F6"
          roleview_list    (list RoleViews
         (object RoleView "$UNNAMED$86" @222
             Parent_View   @221
             location      (-399, 575)
             quidu         "533DD6EE03E2"
             client        @221
             supplier      @142
             line_style    3
             origin_attachment   (1713, 1359)
             terminal_attachment    (1580, 1359))
         (object RoleView "$UNNAMED$87" @223
             Parent_View   @221
             location      (-399, 575)
             quidu         "533DD6EE03E3"
             client        @221
             supplier      @151
             line_style    3
             origin_attachment   (1713, 1359)
             terminal_attachment    (1847, 1359))))
      (object AssociationViewNew "$UNNAMED$88" @224
          location      (1618, 144)
          quidu         "533DD76401A0"
          roleview_list    (list RoleViews
         (object RoleView "$UNNAMED$89" @225
             Parent_View   @224
             location      (-542, -640)
             quidu         "533DD76600E8"
             client        @224
             supplier      @143
             line_style    3
             origin_attachment   (1618, 144)
             terminal_attachment    (1389, 144))
         (object RoleView "$UNNAMED$90" @226
             Parent_View   @224
             location      (-542, -640)
             quidu         "533DD76600E9"
             client        @224
             supplier      @151
             line_style    3
             origin_attachment   (1618, 144)
             terminal_attachment    (1847, 144))))
      (object AssociationViewNew "$UNNAMED$112" @227
          location      (1708, 1028)
          quidu         "53448A290168"
          roleview_list    (list RoleViews
         (object RoleView "$UNNAMED$113" @228
             Parent_View   @227
             location      (-420, 260)
             quidu         "53448A2A0148"
             client        @227
             supplier      @150
             line_style    3
             origin_attachment   (1708, 1028)
             terminal_attachment    (1569, 1028))
         (object RoleView "$UNNAMED$114" @229
             Parent_View   @227
             location      (-420, 260)
             quidu         "53448A2A0167"
             client        @227
             supplier      @151
             line_style    3
             origin_attachment   (1708, 1028)
             terminal_attachment    (1847, 1028))))))
   (object ClassDiagram "DocIssue"
       quid          "533DD81700F2"
       title         "DocIssue"
       zoom          100
       max_height    28350
       max_width     21600
       origin_x      0
       origin_y      0
       items         (list diagram_item_list
      (object ClassView "Class" "ConstrBreakGroundReq" @230
          location      (576, 448)
          label         (object ItemLabel
         Parent_View    @230
         location    (336, 402)
         nlines      1
         max_width   479
         justify     0
         label       "ConstrBreakGroundReq")
          quidu         "533C990C02B5"
          width         518
          height        115
          autoResize    TRUE)
      (object ClassView "Class" "ConstrLandReq" @231
          location      (576, 624)
          label         (object ItemLabel
         Parent_View    @231
         location    (422, 578)
         nlines      1
         max_width   307
         justify     0
         label       "ConstrLandReq")
          quidu         "533CA5E90267"
          width         332
          height        115
          autoResize    TRUE)
      (object ClassView "Class" "DocIssue" @232
          location      (1232, 656)
          label         (object ItemLabel
         Parent_View    @232
         location    (1148, 368)
         nlines      1
         max_width   167
         justify     0
         label       "DocIssue")
          quidu         "34B4899000D3"
          width         181
          height        599
          autoResize    TRUE)
      (object AssociationViewNew "$UNNAMED$91" @233
          location      (988, 422)
          quidu         "533DD86E0253"
          roleview_list    (list RoleViews
         (object RoleView "$UNNAMED$92" @234
             Parent_View   @233
             location      (412, -58)
             quidu         "533DD8700152"
             client        @233
             supplier      @232
             line_style    3
             origin_attachment   (988, 422)
             terminal_attachment    (1142, 422))
         (object RoleView "$UNNAMED$93" @235
             Parent_View   @233
             location      (412, -58)
             quidu         "533DD8700155"
             client        @233
             supplier      @230
             line_style    3
             origin_attachment   (988, 422)
             terminal_attachment    (835, 422))))
      (object AssociationViewNew "$UNNAMED$94" @236
          location      (942, 606)
          quidu         "533DD875012D"
          roleview_list    (list RoleViews
         (object RoleView "$UNNAMED$95" @237
             Parent_View   @236
             location      (366, -82)
             quidu         "533DD87601A4"
             client        @236
             supplier      @232
             line_style    3
             origin_attachment   (942, 606)
             terminal_attachment    (1142, 606))
         (object RoleView "$UNNAMED$96" @238
             Parent_View   @236
             location      (366, -82)
             quidu         "533DD87601A8"
             client        @236
             supplier      @231
             line_style    3
             origin_attachment   (942, 606)
             terminal_attachment    (742, 606))))
      (object ClassView "Class" "ConstrDepartureReq" @239
          location      (576, 816)
          label         (object ItemLabel
         Parent_View    @239
         location    (382, 770)
         nlines      1
         max_width   386
         justify     0
         label       "ConstrDepartureReq")
          quidu         "533DC8470369"
          width         418
          height        115
          autoResize    TRUE)
      (object AssociationViewNew "$UNNAMED$97" @240
          location      (963, 768)
          quidu         "533DD8780248"
          roleview_list    (list RoleViews
         (object RoleView "$UNNAMED$98" @241
             Parent_View   @240
             location      (387, -256)
             quidu         "533DD87D0023"
             client        @240
             supplier      @232
             line_style    3
             origin_attachment   (963, 768)
             terminal_attachment    (1142, 768))
         (object RoleView "$UNNAMED$99" @242
             Parent_View   @240
             location      (387, -256)
             quidu         "533DD87D0028"
             client        @240
             supplier      @239
             line_style    3
             origin_attachment   (963, 768)
             terminal_attachment    (785, 768))))))))
