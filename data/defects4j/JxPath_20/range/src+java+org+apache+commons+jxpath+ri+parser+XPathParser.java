{
  "filepath": "/tmp/JxPath-20b/src/java/org/apache/commons/jxpath/ri/parser/XPathParser.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "XPathParser",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.parser.XPathParserConstants"
      ],
      "begin_line": 7,
      "end_line": 3350,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 8,
      "end_line": 8,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.setCompiler(org.apache.commons.jxpath.ri.Compiler)",
      "begin_line": 10,
      "end_line": 12,
      "comment": "",
      "child_ranges": [
        "(line 11,col 13)-(line 11,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.unescape(java.lang.String)",
      "begin_line": 14,
      "end_line": 26,
      "comment": "",
      "child_ranges": [
        "(line 15,col 13)-(line 15,col 49)",
        "(line 16,col 13)-(line 19,col 13)",
        "(line 20,col 13)-(line 20,col 45)",
        "(line 21,col 13)-(line 24,col 13)",
        "(line 25,col 13)-(line 25,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.NCName()",
      "begin_line": 29,
      "end_line": 150,
      "comment": " Note: XPath does not have reserved words, so we have to include all these terminals",
      "child_ranges": [
        "(line 30,col 5)-(line 147,col 5)",
        "(line 148,col 9)-(line 148,col 39)",
        "(line 149,col 5)-(line 149,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.NCName_Without_CoreFunctions()",
      "begin_line": 152,
      "end_line": 176,
      "comment": "",
      "child_ranges": [
        "(line 153,col 5)-(line 173,col 5)",
        "(line 174,col 9)-(line 174,col 39)",
        "(line 175,col 5)-(line 175,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.CoreFunctionName()",
      "begin_line": 178,
      "end_line": 312,
      "comment": "",
      "child_ranges": [
        "(line 179,col 5)-(line 179,col 13)",
        "(line 180,col 5)-(line 309,col 5)",
        "(line 310,col 9)-(line 310,col 32)",
        "(line 311,col 5)-(line 311,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.QName()",
      "begin_line": 314,
      "end_line": 333,
      "comment": "",
      "child_ranges": [
        "(line 315,col 2)-(line 315,col 24)",
        "(line 316,col 5)-(line 316,col 19)",
        "(line 317,col 5)-(line 325,col 5)",
        "(line 326,col 9)-(line 331,col 9)",
        "(line 332,col 5)-(line 332,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.QName_Without_CoreFunctions()",
      "begin_line": 335,
      "end_line": 363,
      "comment": "",
      "child_ranges": [
        "(line 336,col 5)-(line 336,col 27)",
        "(line 337,col 5)-(line 355,col 5)",
        "(line 356,col 9)-(line 361,col 9)",
        "(line 362,col 5)-(line 362,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.parseExpression()",
      "begin_line": 365,
      "end_line": 371,
      "comment": "",
      "child_ranges": [
        "(line 366,col 5)-(line 366,col 14)",
        "(line 367,col 5)-(line 367,col 22)",
        "(line 368,col 5)-(line 368,col 24)",
        "(line 369,col 9)-(line 369,col 30)",
        "(line 370,col 5)-(line 370,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.LocationPath()",
      "begin_line": 444,
      "end_line": 517,
      "comment": " [1] LocationPath ::\u003d RelativeLocationPath | AbsoluteLocationPath  ",
      "child_ranges": [
        "(line 445,col 2)-(line 445,col 18)",
        "(line 446,col 5)-(line 514,col 5)",
        "(line 515,col 9)-(line 515,col 30)",
        "(line 516,col 5)-(line 516,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.AbsoluteLocationPath()",
      "begin_line": 521,
      "end_line": 551,
      "comment": " [10]    AbbreviatedAbsoluteLocationPath    ::\u003d    \u0027//\u0027 RelativeLocationPath  ",
      "child_ranges": [
        "(line 522,col 5)-(line 522,col 38)",
        "(line 523,col 5)-(line 548,col 5)",
        "(line 549,col 9)-(line 549,col 72)",
        "(line 550,col 5)-(line 550,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.RelativeLocationPath()",
      "begin_line": 554,
      "end_line": 572,
      "comment": " [3] RelativeLocationPath ::\u003d Step | RelativeLocationPath \u0027/\u0027 Step | AbbreviatedRelativeLocationPath ",
      "child_ranges": [
        "(line 555,col 5)-(line 555,col 38)",
        "(line 556,col 5)-(line 556,col 20)",
        "(line 557,col 5)-(line 569,col 5)",
        "(line 570,col 9)-(line 570,col 73)",
        "(line 571,col 5)-(line 571,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.LocationStep(java.util.ArrayList)",
      "begin_line": 583,
      "end_line": 602,
      "comment": " [4] Step ::\u003d AxisSpecifier NodeTest Predicate*   | AbbreviatedStep  ",
      "child_ranges": [
        "(line 584,col 5)-(line 584,col 13)",
        "(line 585,col 5)-(line 585,col 13)",
        "(line 586,col 5)-(line 600,col 5)",
        "(line 601,col 5)-(line 601,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.NodeTest(java.util.ArrayList)",
      "begin_line": 605,
      "end_line": 770,
      "comment": " [7] NodeTest ::\u003d WildcardName | NodeType \u0027(\u0027 \u0027)\u0027 | \u0027processing-instruction\u0027 \u0027(\u0027 Literal \u0027)\u0027 ",
      "child_ranges": [
        "(line 606,col 5)-(line 606,col 13)",
        "(line 607,col 5)-(line 607,col 18)",
        "(line 608,col 5)-(line 608,col 30)",
        "(line 609,col 5)-(line 609,col 23)",
        "(line 610,col 5)-(line 610,col 13)",
        "(line 611,col 5)-(line 611,col 13)",
        "(line 612,col 5)-(line 612,col 35)",
        "(line 613,col 5)-(line 746,col 5)",
        "(line 747,col 5)-(line 759,col 5)",
        "(line 760,col 9)-(line 768,col 9)",
        "(line 769,col 9)-(line 769,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.AxisSpecifier()",
      "begin_line": 773,
      "end_line": 797,
      "comment": " [5] AxisSpecifier ::\u003d    AxisName \u0027::\u0027 | AbbreviatedAxisSpecifier  ",
      "child_ranges": [
        "(line 774,col 5)-(line 774,col 13)",
        "(line 775,col 5)-(line 794,col 5)",
        "(line 795,col 9)-(line 795,col 32)",
        "(line 796,col 5)-(line 796,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.AxisName()",
      "begin_line": 807,
      "end_line": 869,
      "comment": " [6] AxisName ::\u003d \u0027ancestor\u0027 | \u0027ancestor-or-self\u0027 | \u0027attribute\u0027  | \u0027child\u0027 | \u0027descendant\u0027\n                    | \u0027descendant-or-self\u0027 | \u0027following\u0027 | \u0027following-sibling\u0027 | \u0027namespace\u0027\n                       | \u0027parent\u0027 | \u0027preceding\u0027 | \u0027preceding-sibling\u0027 | \u0027self\u0027\n",
      "child_ranges": [
        "(line 808,col 5)-(line 808,col 17)",
        "(line 809,col 5)-(line 866,col 5)",
        "(line 867,col 9)-(line 867,col 32)",
        "(line 868,col 5)-(line 868,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.Predicate()",
      "begin_line": 881,
      "end_line": 888,
      "comment": " [9] PredicateExpr ::\u003d  Expr  ",
      "child_ranges": [
        "(line 882,col 5)-(line 882,col 14)",
        "(line 883,col 5)-(line 883,col 25)",
        "(line 884,col 5)-(line 884,col 22)",
        "(line 885,col 5)-(line 885,col 25)",
        "(line 886,col 9)-(line 886,col 30)",
        "(line 887,col 5)-(line 887,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.AbbreviatedAxisSpecifier()",
      "begin_line": 893,
      "end_line": 906,
      "comment": " [13]    AbbreviatedAxisSpecifier    ::\u003d    \u0027@\u0027? ",
      "child_ranges": [
        "(line 894,col 5)-(line 894,col 35)",
        "(line 895,col 5)-(line 903,col 5)",
        "(line 904,col 9)-(line 904,col 32)",
        "(line 905,col 5)-(line 905,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.Expression()",
      "begin_line": 927,
      "end_line": 932,
      "comment": " [14] Expr ::\u003d OrExpr ",
      "child_ranges": [
        "(line 928,col 2)-(line 928,col 11)",
        "(line 929,col 5)-(line 929,col 18)",
        "(line 930,col 9)-(line 930,col 30)",
        "(line 931,col 5)-(line 931,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.PrimaryExpr()",
      "begin_line": 935,
      "end_line": 1011,
      "comment": " [15] PrimaryExpr ::\u003d VariableReference | \u0027(\u0027 Expr \u0027)\u0027 | Literal | Number | FunctionCall ",
      "child_ranges": [
        "(line 936,col 5)-(line 936,col 21)",
        "(line 937,col 5)-(line 1008,col 5)",
        "(line 1009,col 9)-(line 1009,col 30)",
        "(line 1010,col 5)-(line 1010,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.FunctionCall()",
      "begin_line": 1018,
      "end_line": 1030,
      "comment": " [16]    FunctionCall    ::\u003d    FunctionName \u0027(\u0027 ( Argument ( \u0027,\u0027 Argument)*)? \u0027)\u0027  ",
      "child_ranges": [
        "(line 1019,col 5)-(line 1019,col 16)",
        "(line 1020,col 5)-(line 1020,col 19)",
        "(line 1021,col 5)-(line 1021,col 26)",
        "(line 1022,col 5)-(line 1022,col 26)",
        "(line 1023,col 9)-(line 1028,col 9)",
        "(line 1029,col 5)-(line 1029,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.CoreFunctionCall()",
      "begin_line": 1032,
      "end_line": 1044,
      "comment": "",
      "child_ranges": [
        "(line 1033,col 5)-(line 1033,col 17)",
        "(line 1034,col 5)-(line 1034,col 19)",
        "(line 1035,col 5)-(line 1035,col 30)",
        "(line 1036,col 5)-(line 1036,col 26)",
        "(line 1037,col 9)-(line 1042,col 9)",
        "(line 1043,col 5)-(line 1043,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.ArgumentList()",
      "begin_line": 1046,
      "end_line": 1139,
      "comment": "",
      "child_ranges": [
        "(line 1047,col 5)-(line 1047,col 26)",
        "(line 1048,col 5)-(line 1048,col 15)",
        "(line 1049,col 5)-(line 1049,col 25)",
        "(line 1050,col 5)-(line 1135,col 5)",
        "(line 1136,col 5)-(line 1136,col 25)",
        "(line 1137,col 9)-(line 1137,col 32)",
        "(line 1138,col 5)-(line 1138,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.Argument()",
      "begin_line": 1142,
      "end_line": 1147,
      "comment": " [17]    Argument    ::\u003d    Expr ",
      "child_ranges": [
        "(line 1143,col 5)-(line 1143,col 14)",
        "(line 1144,col 5)-(line 1144,col 22)",
        "(line 1145,col 9)-(line 1145,col 30)",
        "(line 1146,col 5)-(line 1146,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.UnionExpr()",
      "begin_line": 1154,
      "end_line": 1181,
      "comment": " [18] UnionExpr    ::\u003d    PathExpr | UnionExpr \u0027|\u0027 PathExpr ",
      "child_ranges": [
        "(line 1155,col 5)-(line 1155,col 17)",
        "(line 1156,col 5)-(line 1156,col 26)",
        "(line 1157,col 5)-(line 1157,col 20)",
        "(line 1158,col 5)-(line 1175,col 5)",
        "(line 1176,col 9)-(line 1178,col 9)",
        "(line 1179,col 9)-(line 1179,col 30)",
        "(line 1180,col 5)-(line 1180,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.PathExpr()",
      "begin_line": 1184,
      "end_line": 1260,
      "comment": " [19] PathExpr ::\u003d LocationPath | FilterExpr | FilterExpr \u0027/\u0027 RelativeLocationPath | FilterExpr \u0027//\u0027 RelativeLocationPath  ",
      "child_ranges": [
        "(line 1185,col 5)-(line 1185,col 21)",
        "(line 1186,col 5)-(line 1186,col 19)",
        "(line 1187,col 5)-(line 1257,col 5)",
        "(line 1258,col 9)-(line 1258,col 30)",
        "(line 1259,col 5)-(line 1259,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.FilterExpr()",
      "begin_line": 1263,
      "end_line": 1304,
      "comment": " [20]    FilterExpr    ::\u003d    PrimaryExpr    | FilterExpr Predicate ",
      "child_ranges": [
        "(line 1264,col 5)-(line 1264,col 17)",
        "(line 1265,col 5)-(line 1265,col 35)",
        "(line 1266,col 5)-(line 1266,col 25)",
        "(line 1267,col 5)-(line 1267,col 38)",
        "(line 1268,col 5)-(line 1268,col 23)",
        "(line 1269,col 5)-(line 1282,col 5)",
        "(line 1283,col 5)-(line 1296,col 5)",
        "(line 1297,col 9)-(line 1302,col 9)",
        "(line 1303,col 5)-(line 1303,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.OrExpr()",
      "begin_line": 1311,
      "end_line": 1338,
      "comment": " [21] OrExpr    ::\u003d    AndExpr | OrExpr \u0027or\u0027 AndExpr ",
      "child_ranges": [
        "(line 1312,col 5)-(line 1312,col 17)",
        "(line 1313,col 5)-(line 1313,col 26)",
        "(line 1314,col 5)-(line 1314,col 19)",
        "(line 1315,col 5)-(line 1332,col 5)",
        "(line 1333,col 9)-(line 1335,col 9)",
        "(line 1336,col 9)-(line 1336,col 30)",
        "(line 1337,col 5)-(line 1337,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.AndExpr()",
      "begin_line": 1341,
      "end_line": 1368,
      "comment": " [22] AndExpr    ::\u003d    EqualityExpr  | AndExpr \u0027and\u0027 EqualityExpr  ",
      "child_ranges": [
        "(line 1342,col 5)-(line 1342,col 17)",
        "(line 1343,col 5)-(line 1343,col 26)",
        "(line 1344,col 5)-(line 1344,col 24)",
        "(line 1345,col 5)-(line 1362,col 5)",
        "(line 1363,col 9)-(line 1365,col 9)",
        "(line 1366,col 9)-(line 1366,col 30)",
        "(line 1367,col 5)-(line 1367,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.EqualityExpr()",
      "begin_line": 1371,
      "end_line": 1404,
      "comment": " [23] EqualityExpr    ::\u003d    RelationalExpr | EqualityExpr \u0027\u003d\u0027 RelationalExpr | EqualityExpr \u0027!\u003d\u0027 RelationalExpr ",
      "child_ranges": [
        "(line 1372,col 2)-(line 1372,col 14)",
        "(line 1373,col 5)-(line 1373,col 26)",
        "(line 1374,col 5)-(line 1401,col 5)",
        "(line 1402,col 9)-(line 1402,col 30)",
        "(line 1403,col 5)-(line 1403,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.RelationalExpr()",
      "begin_line": 1408,
      "end_line": 1453,
      "comment": " [24] RelationalExpr    ::\u003d    AdditiveExpr | RelationalExpr \u0027\u003c\u0027 AdditiveExpr | RelationalExpr \u0027\u003e\u0027 AdditiveExpr\n                       | RelationalExpr \u0027\u003c\u003d\u0027 AdditiveExpr  | RelationalExpr \u0027\u003e\u003d\u0027 AdditiveExpr ",
      "child_ranges": [
        "(line 1409,col 2)-(line 1409,col 14)",
        "(line 1410,col 5)-(line 1410,col 24)",
        "(line 1411,col 5)-(line 1450,col 5)",
        "(line 1451,col 9)-(line 1451,col 30)",
        "(line 1452,col 5)-(line 1452,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.AdditiveExpr()",
      "begin_line": 1460,
      "end_line": 1487,
      "comment": " [25] AdditiveExpr ::\u003d MultiplicativeExpr  | AdditiveExpr \u0027+\u0027 MultiplicativeExpr  | AdditiveExpr \u0027-\u0027 MultiplicativeExpr  ",
      "child_ranges": [
        "(line 1461,col 5)-(line 1461,col 17)",
        "(line 1462,col 5)-(line 1462,col 26)",
        "(line 1463,col 5)-(line 1463,col 27)",
        "(line 1464,col 5)-(line 1481,col 5)",
        "(line 1482,col 9)-(line 1484,col 9)",
        "(line 1485,col 9)-(line 1485,col 30)",
        "(line 1486,col 5)-(line 1486,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.SubtractiveExpr()",
      "begin_line": 1489,
      "end_line": 1508,
      "comment": "",
      "child_ranges": [
        "(line 1490,col 5)-(line 1490,col 24)",
        "(line 1491,col 5)-(line 1491,col 30)",
        "(line 1492,col 5)-(line 1505,col 5)",
        "(line 1506,col 9)-(line 1506,col 30)",
        "(line 1507,col 5)-(line 1507,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.MultiplicativeExpr()",
      "begin_line": 1512,
      "end_line": 1551,
      "comment": " [26] MultiplicativeExpr ::\u003d UnaryExpr | MultiplicativeExpr MultiplyOperator UnaryExpr\n            | MultiplicativeExpr \u0027div\u0027 UnaryExpr | MultiplicativeExpr \u0027mod\u0027 UnaryExpr  ",
      "child_ranges": [
        "(line 1513,col 5)-(line 1513,col 17)",
        "(line 1514,col 5)-(line 1514,col 21)",
        "(line 1515,col 5)-(line 1548,col 5)",
        "(line 1549,col 9)-(line 1549,col 30)",
        "(line 1550,col 5)-(line 1550,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.UnaryExpr()",
      "begin_line": 1554,
      "end_line": 1634,
      "comment": " [27]    UnaryExpr    ::\u003d    UnionExpr  | \u0027-\u0027 UnaryExpr  ",
      "child_ranges": [
        "(line 1555,col 5)-(line 1555,col 14)",
        "(line 1556,col 5)-(line 1631,col 5)",
        "(line 1632,col 9)-(line 1632,col 30)",
        "(line 1633,col 5)-(line 1633,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.FunctionName()",
      "begin_line": 1670,
      "end_line": 1675,
      "comment": " [35]    FunctionName    ::\u003d    QName - NodeType   ",
      "child_ranges": [
        "(line 1671,col 5)-(line 1671,col 17)",
        "(line 1672,col 5)-(line 1672,col 42)",
        "(line 1673,col 9)-(line 1673,col 33)",
        "(line 1674,col 5)-(line 1674,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.VariableReference()",
      "begin_line": 1678,
      "end_line": 1684,
      "comment": " [36]    VariableReference    ::\u003d    \u0027$\u0027 QName  ",
      "child_ranges": [
        "(line 1679,col 5)-(line 1679,col 14)",
        "(line 1680,col 5)-(line 1680,col 31)",
        "(line 1681,col 5)-(line 1681,col 17)",
        "(line 1682,col 9)-(line 1682,col 58)",
        "(line 1683,col 5)-(line 1683,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.WildcardName()",
      "begin_line": 1687,
      "end_line": 1810,
      "comment": " [37]    WildcardName    ::\u003d    \u0027*\u0027     | NCName \u0027:\u0027 \u0027*\u0027     | QName  ",
      "child_ranges": [
        "(line 1688,col 5)-(line 1688,col 14)",
        "(line 1689,col 5)-(line 1689,col 27)",
        "(line 1690,col 5)-(line 1740,col 5)",
        "(line 1741,col 28)-(line 1741,col 45)",
        "(line 1742,col 5)-(line 1801,col 5)",
        "(line 1802,col 9)-(line 1807,col 9)",
        "(line 1808,col 9)-(line 1808,col 30)",
        "(line 1809,col 5)-(line 1809,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.NodeType()",
      "begin_line": 1813,
      "end_line": 1839,
      "comment": " [38]    NodeType    ::\u003d    \u0027comment\u0027 | \u0027text\u0027  | \u0027processing-instruction\u0027  | \u0027node\u0027  ",
      "child_ranges": [
        "(line 1814,col 5)-(line 1814,col 13)",
        "(line 1815,col 5)-(line 1836,col 5)",
        "(line 1837,col 9)-(line 1837,col 32)",
        "(line 1838,col 5)-(line 1838,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_2_1(int)",
      "begin_line": 1841,
      "end_line": 1846,
      "comment": "",
      "child_ranges": [
        "(line 1842,col 5)-(line 1842,col 16)",
        "(line 1842,col 18)-(line 1842,col 49)",
        "(line 1843,col 5)-(line 1845,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_2_2(int)",
      "begin_line": 1848,
      "end_line": 1853,
      "comment": "",
      "child_ranges": [
        "(line 1849,col 5)-(line 1849,col 16)",
        "(line 1849,col 18)-(line 1849,col 49)",
        "(line 1850,col 5)-(line 1852,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_2_3(int)",
      "begin_line": 1855,
      "end_line": 1860,
      "comment": "",
      "child_ranges": [
        "(line 1856,col 5)-(line 1856,col 16)",
        "(line 1856,col 18)-(line 1856,col 49)",
        "(line 1857,col 5)-(line 1859,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_2_4(int)",
      "begin_line": 1862,
      "end_line": 1867,
      "comment": "",
      "child_ranges": [
        "(line 1863,col 5)-(line 1863,col 16)",
        "(line 1863,col 18)-(line 1863,col 49)",
        "(line 1864,col 5)-(line 1866,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_2_5(int)",
      "begin_line": 1869,
      "end_line": 1874,
      "comment": "",
      "child_ranges": [
        "(line 1870,col 5)-(line 1870,col 16)",
        "(line 1870,col 18)-(line 1870,col 49)",
        "(line 1871,col 5)-(line 1873,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_2_6(int)",
      "begin_line": 1876,
      "end_line": 1881,
      "comment": "",
      "child_ranges": [
        "(line 1877,col 5)-(line 1877,col 16)",
        "(line 1877,col 18)-(line 1877,col 49)",
        "(line 1878,col 5)-(line 1880,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3_2()",
      "begin_line": 1883,
      "end_line": 1886,
      "comment": "",
      "child_ranges": [
        "(line 1884,col 5)-(line 1884,col 32)",
        "(line 1885,col 5)-(line 1885,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_144()",
      "begin_line": 1888,
      "end_line": 1891,
      "comment": "",
      "child_ranges": [
        "(line 1889,col 5)-(line 1889,col 32)",
        "(line 1890,col 5)-(line 1890,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_143()",
      "begin_line": 1893,
      "end_line": 1896,
      "comment": "",
      "child_ranges": [
        "(line 1894,col 5)-(line 1894,col 32)",
        "(line 1895,col 5)-(line 1895,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_150()",
      "begin_line": 1898,
      "end_line": 1906,
      "comment": "",
      "child_ranges": [
        "(line 1899,col 5)-(line 1899,col 32)",
        "(line 1900,col 5)-(line 1900,col 14)",
        "(line 1901,col 5)-(line 1904,col 5)",
        "(line 1905,col 5)-(line 1905,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_132()",
      "begin_line": 1908,
      "end_line": 1912,
      "comment": "",
      "child_ranges": [
        "(line 1909,col 5)-(line 1909,col 42)",
        "(line 1910,col 5)-(line 1910,col 33)",
        "(line 1911,col 5)-(line 1911,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_130()",
      "begin_line": 1914,
      "end_line": 1925,
      "comment": "",
      "child_ranges": [
        "(line 1915,col 5)-(line 1915,col 14)",
        "(line 1916,col 5)-(line 1916,col 21)",
        "(line 1917,col 5)-(line 1923,col 5)",
        "(line 1924,col 5)-(line 1924,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_148()",
      "begin_line": 1927,
      "end_line": 1935,
      "comment": "",
      "child_ranges": [
        "(line 1928,col 5)-(line 1928,col 14)",
        "(line 1929,col 5)-(line 1929,col 21)",
        "(line 1930,col 5)-(line 1933,col 5)",
        "(line 1934,col 5)-(line 1934,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_131()",
      "begin_line": 1937,
      "end_line": 1940,
      "comment": "",
      "child_ranges": [
        "(line 1938,col 5)-(line 1938,col 33)",
        "(line 1939,col 5)-(line 1939,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_64()",
      "begin_line": 1942,
      "end_line": 1959,
      "comment": "",
      "child_ranges": [
        "(line 1943,col 5)-(line 1943,col 14)",
        "(line 1944,col 5)-(line 1944,col 21)",
        "(line 1945,col 5)-(line 1957,col 5)",
        "(line 1958,col 5)-(line 1958,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_113()",
      "begin_line": 1961,
      "end_line": 1964,
      "comment": "",
      "child_ranges": [
        "(line 1962,col 5)-(line 1962,col 39)",
        "(line 1963,col 5)-(line 1963,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_91()",
      "begin_line": 1966,
      "end_line": 1971,
      "comment": "",
      "child_ranges": [
        "(line 1967,col 5)-(line 1967,col 14)",
        "(line 1968,col 5)-(line 1968,col 21)",
        "(line 1969,col 5)-(line 1969,col 38)",
        "(line 1970,col 5)-(line 1970,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_141()",
      "begin_line": 1973,
      "end_line": 1985,
      "comment": "",
      "child_ranges": [
        "(line 1974,col 5)-(line 1974,col 32)",
        "(line 1975,col 5)-(line 1975,col 14)",
        "(line 1976,col 5)-(line 1979,col 5)",
        "(line 1980,col 5)-(line 1983,col 5)",
        "(line 1984,col 5)-(line 1984,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_129()",
      "begin_line": 1987,
      "end_line": 1995,
      "comment": "",
      "child_ranges": [
        "(line 1988,col 5)-(line 1988,col 14)",
        "(line 1989,col 5)-(line 1989,col 21)",
        "(line 1990,col 5)-(line 1993,col 5)",
        "(line 1994,col 5)-(line 1994,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3_6()",
      "begin_line": 1997,
      "end_line": 2000,
      "comment": "",
      "child_ranges": [
        "(line 1998,col 5)-(line 1998,col 32)",
        "(line 1999,col 5)-(line 1999,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_146()",
      "begin_line": 2002,
      "end_line": 2005,
      "comment": "",
      "child_ranges": [
        "(line 2003,col 5)-(line 2003,col 33)",
        "(line 2004,col 5)-(line 2004,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_135()",
      "begin_line": 2007,
      "end_line": 2011,
      "comment": "",
      "child_ranges": [
        "(line 2008,col 5)-(line 2008,col 40)",
        "(line 2009,col 5)-(line 2009,col 33)",
        "(line 2010,col 5)-(line 2010,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_145()",
      "begin_line": 2013,
      "end_line": 2016,
      "comment": "",
      "child_ranges": [
        "(line 2014,col 5)-(line 2014,col 33)",
        "(line 2015,col 5)-(line 2015,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_134()",
      "begin_line": 2018,
      "end_line": 2022,
      "comment": "",
      "child_ranges": [
        "(line 2019,col 5)-(line 2019,col 40)",
        "(line 2020,col 5)-(line 2020,col 33)",
        "(line 2021,col 5)-(line 2021,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_133()",
      "begin_line": 2024,
      "end_line": 2028,
      "comment": "",
      "child_ranges": [
        "(line 2025,col 5)-(line 2025,col 39)",
        "(line 2026,col 5)-(line 2026,col 33)",
        "(line 2027,col 5)-(line 2027,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_142()",
      "begin_line": 2030,
      "end_line": 2038,
      "comment": "",
      "child_ranges": [
        "(line 2031,col 5)-(line 2031,col 14)",
        "(line 2032,col 5)-(line 2032,col 21)",
        "(line 2033,col 5)-(line 2036,col 5)",
        "(line 2037,col 5)-(line 2037,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_140()",
      "begin_line": 2040,
      "end_line": 2043,
      "comment": "",
      "child_ranges": [
        "(line 2041,col 5)-(line 2041,col 33)",
        "(line 2042,col 5)-(line 2042,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_139()",
      "begin_line": 2045,
      "end_line": 2048,
      "comment": "",
      "child_ranges": [
        "(line 2046,col 5)-(line 2046,col 33)",
        "(line 2047,col 5)-(line 2047,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_77()",
      "begin_line": 2050,
      "end_line": 2055,
      "comment": "",
      "child_ranges": [
        "(line 2051,col 5)-(line 2051,col 39)",
        "(line 2052,col 5)-(line 2052,col 32)",
        "(line 2053,col 5)-(line 2053,col 39)",
        "(line 2054,col 5)-(line 2054,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_127()",
      "begin_line": 2057,
      "end_line": 2065,
      "comment": "",
      "child_ranges": [
        "(line 2058,col 5)-(line 2058,col 33)",
        "(line 2059,col 5)-(line 2059,col 14)",
        "(line 2060,col 5)-(line 2063,col 5)",
        "(line 2064,col 5)-(line 2064,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_137()",
      "begin_line": 2067,
      "end_line": 2075,
      "comment": "",
      "child_ranges": [
        "(line 2068,col 5)-(line 2068,col 14)",
        "(line 2069,col 5)-(line 2069,col 21)",
        "(line 2070,col 5)-(line 2073,col 5)",
        "(line 2074,col 5)-(line 2074,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_128()",
      "begin_line": 2077,
      "end_line": 2081,
      "comment": "",
      "child_ranges": [
        "(line 2078,col 5)-(line 2078,col 42)",
        "(line 2079,col 5)-(line 2079,col 33)",
        "(line 2080,col 5)-(line 2080,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_112()",
      "begin_line": 2083,
      "end_line": 2086,
      "comment": "",
      "child_ranges": [
        "(line 2084,col 5)-(line 2084,col 60)",
        "(line 2085,col 5)-(line 2085,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_111()",
      "begin_line": 2088,
      "end_line": 2091,
      "comment": "",
      "child_ranges": [
        "(line 2089,col 5)-(line 2089,col 59)",
        "(line 2090,col 5)-(line 2090,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_110()",
      "begin_line": 2093,
      "end_line": 2096,
      "comment": "",
      "child_ranges": [
        "(line 2094,col 5)-(line 2094,col 59)",
        "(line 2095,col 5)-(line 2095,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_122()",
      "begin_line": 2098,
      "end_line": 2102,
      "comment": "",
      "child_ranges": [
        "(line 2099,col 5)-(line 2099,col 41)",
        "(line 2100,col 5)-(line 2100,col 33)",
        "(line 2101,col 5)-(line 2101,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_109()",
      "begin_line": 2104,
      "end_line": 2107,
      "comment": "",
      "child_ranges": [
        "(line 2105,col 5)-(line 2105,col 58)",
        "(line 2106,col 5)-(line 2106,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_108()",
      "begin_line": 2109,
      "end_line": 2112,
      "comment": "",
      "child_ranges": [
        "(line 2110,col 5)-(line 2110,col 52)",
        "(line 2111,col 5)-(line 2111,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_107()",
      "begin_line": 2114,
      "end_line": 2117,
      "comment": "",
      "child_ranges": [
        "(line 2115,col 5)-(line 2115,col 51)",
        "(line 2116,col 5)-(line 2116,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_106()",
      "begin_line": 2119,
      "end_line": 2122,
      "comment": "",
      "child_ranges": [
        "(line 2120,col 5)-(line 2120,col 51)",
        "(line 2121,col 5)-(line 2121,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_121()",
      "begin_line": 2124,
      "end_line": 2132,
      "comment": "",
      "child_ranges": [
        "(line 2125,col 5)-(line 2125,col 33)",
        "(line 2126,col 5)-(line 2126,col 14)",
        "(line 2127,col 5)-(line 2130,col 5)",
        "(line 2131,col 5)-(line 2131,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_105()",
      "begin_line": 2134,
      "end_line": 2137,
      "comment": "",
      "child_ranges": [
        "(line 2135,col 5)-(line 2135,col 51)",
        "(line 2136,col 5)-(line 2136,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_104()",
      "begin_line": 2139,
      "end_line": 2142,
      "comment": "",
      "child_ranges": [
        "(line 2140,col 5)-(line 2140,col 51)",
        "(line 2141,col 5)-(line 2141,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_103()",
      "begin_line": 2144,
      "end_line": 2147,
      "comment": "",
      "child_ranges": [
        "(line 2145,col 5)-(line 2145,col 50)",
        "(line 2146,col 5)-(line 2146,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_20()",
      "begin_line": 2149,
      "end_line": 2152,
      "comment": "",
      "child_ranges": [
        "(line 2150,col 5)-(line 2150,col 32)",
        "(line 2151,col 5)-(line 2151,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_102()",
      "begin_line": 2154,
      "end_line": 2157,
      "comment": "",
      "child_ranges": [
        "(line 2155,col 5)-(line 2155,col 48)",
        "(line 2156,col 5)-(line 2156,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_101()",
      "begin_line": 2159,
      "end_line": 2162,
      "comment": "",
      "child_ranges": [
        "(line 2160,col 5)-(line 2160,col 47)",
        "(line 2161,col 5)-(line 2161,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_100()",
      "begin_line": 2164,
      "end_line": 2167,
      "comment": "",
      "child_ranges": [
        "(line 2165,col 5)-(line 2165,col 46)",
        "(line 2166,col 5)-(line 2166,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_138()",
      "begin_line": 2169,
      "end_line": 2173,
      "comment": "",
      "child_ranges": [
        "(line 2170,col 5)-(line 2170,col 42)",
        "(line 2171,col 5)-(line 2171,col 33)",
        "(line 2172,col 5)-(line 2172,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_15()",
      "begin_line": 2175,
      "end_line": 2285,
      "comment": "",
      "child_ranges": [
        "(line 2176,col 5)-(line 2176,col 14)",
        "(line 2177,col 5)-(line 2177,col 21)",
        "(line 2178,col 5)-(line 2283,col 5)",
        "(line 2284,col 5)-(line 2284,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_90()",
      "begin_line": 2287,
      "end_line": 2328,
      "comment": "",
      "child_ranges": [
        "(line 2288,col 5)-(line 2288,col 14)",
        "(line 2289,col 5)-(line 2289,col 21)",
        "(line 2290,col 5)-(line 2326,col 5)",
        "(line 2327,col 5)-(line 2327,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_136()",
      "begin_line": 2330,
      "end_line": 2338,
      "comment": "",
      "child_ranges": [
        "(line 2331,col 5)-(line 2331,col 33)",
        "(line 2332,col 5)-(line 2332,col 14)",
        "(line 2333,col 5)-(line 2336,col 5)",
        "(line 2337,col 5)-(line 2337,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_118()",
      "begin_line": 2340,
      "end_line": 2354,
      "comment": "",
      "child_ranges": [
        "(line 2341,col 5)-(line 2341,col 14)",
        "(line 2342,col 5)-(line 2342,col 21)",
        "(line 2343,col 5)-(line 2352,col 5)",
        "(line 2353,col 5)-(line 2353,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_117()",
      "begin_line": 2356,
      "end_line": 2364,
      "comment": "",
      "child_ranges": [
        "(line 2357,col 5)-(line 2357,col 33)",
        "(line 2358,col 5)-(line 2358,col 14)",
        "(line 2359,col 5)-(line 2362,col 5)",
        "(line 2363,col 5)-(line 2363,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_83()",
      "begin_line": 2366,
      "end_line": 2369,
      "comment": "",
      "child_ranges": [
        "(line 2367,col 5)-(line 2367,col 32)",
        "(line 2368,col 5)-(line 2368,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_82()",
      "begin_line": 2371,
      "end_line": 2374,
      "comment": "",
      "child_ranges": [
        "(line 2372,col 5)-(line 2372,col 32)",
        "(line 2373,col 5)-(line 2373,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_96()",
      "begin_line": 2376,
      "end_line": 2379,
      "comment": "",
      "child_ranges": [
        "(line 2377,col 5)-(line 2377,col 32)",
        "(line 2378,col 5)-(line 2378,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_126()",
      "begin_line": 2381,
      "end_line": 2385,
      "comment": "",
      "child_ranges": [
        "(line 2382,col 5)-(line 2382,col 40)",
        "(line 2383,col 5)-(line 2383,col 33)",
        "(line 2384,col 5)-(line 2384,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_97()",
      "begin_line": 2387,
      "end_line": 2391,
      "comment": "",
      "child_ranges": [
        "(line 2388,col 5)-(line 2388,col 39)",
        "(line 2389,col 5)-(line 2389,col 32)",
        "(line 2390,col 5)-(line 2390,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_125()",
      "begin_line": 2393,
      "end_line": 2397,
      "comment": "",
      "child_ranges": [
        "(line 2394,col 5)-(line 2394,col 40)",
        "(line 2395,col 5)-(line 2395,col 33)",
        "(line 2396,col 5)-(line 2396,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_73()",
      "begin_line": 2399,
      "end_line": 2407,
      "comment": "",
      "child_ranges": [
        "(line 2400,col 5)-(line 2400,col 14)",
        "(line 2401,col 5)-(line 2401,col 21)",
        "(line 2402,col 5)-(line 2405,col 5)",
        "(line 2406,col 5)-(line 2406,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_124()",
      "begin_line": 2409,
      "end_line": 2413,
      "comment": "",
      "child_ranges": [
        "(line 2410,col 5)-(line 2410,col 39)",
        "(line 2411,col 5)-(line 2411,col 33)",
        "(line 2412,col 5)-(line 2412,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_116()",
      "begin_line": 2415,
      "end_line": 2423,
      "comment": "",
      "child_ranges": [
        "(line 2416,col 5)-(line 2416,col 14)",
        "(line 2417,col 5)-(line 2417,col 21)",
        "(line 2418,col 5)-(line 2421,col 5)",
        "(line 2422,col 5)-(line 2422,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_123()",
      "begin_line": 2425,
      "end_line": 2429,
      "comment": "",
      "child_ranges": [
        "(line 2426,col 5)-(line 2426,col 39)",
        "(line 2427,col 5)-(line 2427,col 33)",
        "(line 2428,col 5)-(line 2428,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_88()",
      "begin_line": 2431,
      "end_line": 2439,
      "comment": "",
      "child_ranges": [
        "(line 2432,col 5)-(line 2432,col 32)",
        "(line 2433,col 5)-(line 2433,col 14)",
        "(line 2434,col 5)-(line 2437,col 5)",
        "(line 2438,col 5)-(line 2438,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_115()",
      "begin_line": 2441,
      "end_line": 2449,
      "comment": "",
      "child_ranges": [
        "(line 2442,col 5)-(line 2442,col 33)",
        "(line 2443,col 5)-(line 2443,col 14)",
        "(line 2444,col 5)-(line 2447,col 5)",
        "(line 2448,col 5)-(line 2448,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_26()",
      "begin_line": 2451,
      "end_line": 2454,
      "comment": "",
      "child_ranges": [
        "(line 2452,col 5)-(line 2452,col 39)",
        "(line 2453,col 5)-(line 2453,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_80()",
      "begin_line": 2456,
      "end_line": 2463,
      "comment": "",
      "child_ranges": [
        "(line 2457,col 5)-(line 2457,col 39)",
        "(line 2458,col 5)-(line 2458,col 14)",
        "(line 2459,col 5)-(line 2459,col 21)",
        "(line 2460,col 5)-(line 2460,col 37)",
        "(line 2461,col 5)-(line 2461,col 39)",
        "(line 2462,col 5)-(line 2462,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_25()",
      "begin_line": 2465,
      "end_line": 2468,
      "comment": "",
      "child_ranges": [
        "(line 2466,col 5)-(line 2466,col 44)",
        "(line 2467,col 5)-(line 2467,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_24()",
      "begin_line": 2470,
      "end_line": 2473,
      "comment": "",
      "child_ranges": [
        "(line 2471,col 5)-(line 2471,col 41)",
        "(line 2472,col 5)-(line 2472,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_120()",
      "begin_line": 2475,
      "end_line": 2479,
      "comment": "",
      "child_ranges": [
        "(line 2476,col 5)-(line 2476,col 40)",
        "(line 2477,col 5)-(line 2477,col 33)",
        "(line 2478,col 5)-(line 2478,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_23()",
      "begin_line": 2481,
      "end_line": 2484,
      "comment": "",
      "child_ranges": [
        "(line 2482,col 5)-(line 2482,col 41)",
        "(line 2483,col 5)-(line 2483,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_119()",
      "begin_line": 2486,
      "end_line": 2490,
      "comment": "",
      "child_ranges": [
        "(line 2487,col 5)-(line 2487,col 39)",
        "(line 2488,col 5)-(line 2488,col 33)",
        "(line 2489,col 5)-(line 2489,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_68()",
      "begin_line": 2492,
      "end_line": 2495,
      "comment": "",
      "child_ranges": [
        "(line 2493,col 5)-(line 2493,col 32)",
        "(line 2494,col 5)-(line 2494,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3_1()",
      "begin_line": 2497,
      "end_line": 2501,
      "comment": "",
      "child_ranges": [
        "(line 2498,col 5)-(line 2498,col 32)",
        "(line 2499,col 5)-(line 2499,col 39)",
        "(line 2500,col 5)-(line 2500,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3_4()",
      "begin_line": 2503,
      "end_line": 2506,
      "comment": "",
      "child_ranges": [
        "(line 2504,col 5)-(line 2504,col 39)",
        "(line 2505,col 5)-(line 2505,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3_3()",
      "begin_line": 2508,
      "end_line": 2513,
      "comment": "",
      "child_ranges": [
        "(line 2509,col 5)-(line 2509,col 32)",
        "(line 2510,col 5)-(line 2510,col 39)",
        "(line 2511,col 5)-(line 2511,col 39)",
        "(line 2512,col 5)-(line 2512,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_17()",
      "begin_line": 2515,
      "end_line": 2529,
      "comment": "",
      "child_ranges": [
        "(line 2516,col 5)-(line 2516,col 14)",
        "(line 2517,col 5)-(line 2517,col 21)",
        "(line 2518,col 5)-(line 2527,col 5)",
        "(line 2528,col 5)-(line 2528,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_67()",
      "begin_line": 2531,
      "end_line": 2534,
      "comment": "",
      "child_ranges": [
        "(line 2532,col 5)-(line 2532,col 39)",
        "(line 2533,col 5)-(line 2533,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_114()",
      "begin_line": 2536,
      "end_line": 2539,
      "comment": "",
      "child_ranges": [
        "(line 2537,col 5)-(line 2537,col 32)",
        "(line 2538,col 5)-(line 2538,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_66()",
      "begin_line": 2541,
      "end_line": 2544,
      "comment": "",
      "child_ranges": [
        "(line 2542,col 5)-(line 2542,col 39)",
        "(line 2543,col 5)-(line 2543,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_94()",
      "begin_line": 2546,
      "end_line": 2554,
      "comment": "",
      "child_ranges": [
        "(line 2547,col 5)-(line 2547,col 33)",
        "(line 2548,col 5)-(line 2548,col 14)",
        "(line 2549,col 5)-(line 2552,col 5)",
        "(line 2553,col 5)-(line 2553,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_76()",
      "begin_line": 2556,
      "end_line": 2559,
      "comment": "",
      "child_ranges": [
        "(line 2557,col 5)-(line 2557,col 32)",
        "(line 2558,col 5)-(line 2558,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_99()",
      "begin_line": 2561,
      "end_line": 2564,
      "comment": "",
      "child_ranges": [
        "(line 2562,col 5)-(line 2562,col 32)",
        "(line 2563,col 5)-(line 2563,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_98()",
      "begin_line": 2566,
      "end_line": 2571,
      "comment": "",
      "child_ranges": [
        "(line 2567,col 5)-(line 2567,col 32)",
        "(line 2568,col 5)-(line 2568,col 39)",
        "(line 2569,col 5)-(line 2569,col 32)",
        "(line 2570,col 5)-(line 2570,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_75()",
      "begin_line": 2573,
      "end_line": 2579,
      "comment": "",
      "child_ranges": [
        "(line 2574,col 5)-(line 2574,col 39)",
        "(line 2575,col 5)-(line 2575,col 39)",
        "(line 2576,col 5)-(line 2576,col 44)",
        "(line 2577,col 5)-(line 2577,col 39)",
        "(line 2578,col 5)-(line 2578,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_92()",
      "begin_line": 2581,
      "end_line": 2584,
      "comment": "",
      "child_ranges": [
        "(line 2582,col 5)-(line 2582,col 32)",
        "(line 2583,col 5)-(line 2583,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_74()",
      "begin_line": 2586,
      "end_line": 2591,
      "comment": "",
      "child_ranges": [
        "(line 2587,col 5)-(line 2587,col 32)",
        "(line 2588,col 5)-(line 2588,col 39)",
        "(line 2589,col 5)-(line 2589,col 39)",
        "(line 2590,col 5)-(line 2590,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_71()",
      "begin_line": 2593,
      "end_line": 2597,
      "comment": "",
      "child_ranges": [
        "(line 2594,col 5)-(line 2594,col 32)",
        "(line 2595,col 5)-(line 2595,col 32)",
        "(line 2596,col 5)-(line 2596,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_93()",
      "begin_line": 2599,
      "end_line": 2608,
      "comment": "",
      "child_ranges": [
        "(line 2600,col 5)-(line 2600,col 39)",
        "(line 2601,col 5)-(line 2601,col 14)",
        "(line 2602,col 5)-(line 2602,col 21)",
        "(line 2603,col 5)-(line 2606,col 5)",
        "(line 2607,col 5)-(line 2607,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_65()",
      "begin_line": 2610,
      "end_line": 2622,
      "comment": "",
      "child_ranges": [
        "(line 2611,col 5)-(line 2611,col 32)",
        "(line 2612,col 5)-(line 2612,col 14)",
        "(line 2613,col 5)-(line 2613,col 21)",
        "(line 2614,col 5)-(line 2620,col 5)",
        "(line 2621,col 5)-(line 2621,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_85()",
      "begin_line": 2624,
      "end_line": 2628,
      "comment": "",
      "child_ranges": [
        "(line 2625,col 5)-(line 2625,col 39)",
        "(line 2626,col 5)-(line 2626,col 32)",
        "(line 2627,col 5)-(line 2627,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_89()",
      "begin_line": 2630,
      "end_line": 2638,
      "comment": "",
      "child_ranges": [
        "(line 2631,col 5)-(line 2631,col 14)",
        "(line 2632,col 5)-(line 2632,col 21)",
        "(line 2633,col 5)-(line 2636,col 5)",
        "(line 2637,col 5)-(line 2637,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_95()",
      "begin_line": 2640,
      "end_line": 2644,
      "comment": "",
      "child_ranges": [
        "(line 2641,col 5)-(line 2641,col 40)",
        "(line 2642,col 5)-(line 2642,col 32)",
        "(line 2643,col 5)-(line 2643,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_84()",
      "begin_line": 2646,
      "end_line": 2656,
      "comment": "",
      "child_ranges": [
        "(line 2647,col 5)-(line 2647,col 14)",
        "(line 2648,col 5)-(line 2648,col 21)",
        "(line 2649,col 5)-(line 2652,col 5)",
        "(line 2653,col 5)-(line 2653,col 21)",
        "(line 2654,col 5)-(line 2654,col 37)",
        "(line 2655,col 5)-(line 2655,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_22()",
      "begin_line": 2658,
      "end_line": 2673,
      "comment": "",
      "child_ranges": [
        "(line 2659,col 5)-(line 2659,col 14)",
        "(line 2660,col 5)-(line 2660,col 21)",
        "(line 2661,col 5)-(line 2667,col 5)",
        "(line 2668,col 5)-(line 2671,col 5)",
        "(line 2672,col 5)-(line 2672,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_72()",
      "begin_line": 2675,
      "end_line": 2679,
      "comment": "",
      "child_ranges": [
        "(line 2676,col 5)-(line 2676,col 32)",
        "(line 2677,col 5)-(line 2677,col 32)",
        "(line 2678,col 5)-(line 2678,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_86()",
      "begin_line": 2681,
      "end_line": 2689,
      "comment": "",
      "child_ranges": [
        "(line 2682,col 5)-(line 2682,col 32)",
        "(line 2683,col 5)-(line 2683,col 14)",
        "(line 2684,col 5)-(line 2687,col 5)",
        "(line 2688,col 5)-(line 2688,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_151()",
      "begin_line": 2691,
      "end_line": 2694,
      "comment": "",
      "child_ranges": [
        "(line 2692,col 5)-(line 2692,col 32)",
        "(line 2693,col 5)-(line 2693,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3_5()",
      "begin_line": 2696,
      "end_line": 2700,
      "comment": "",
      "child_ranges": [
        "(line 2697,col 5)-(line 2697,col 32)",
        "(line 2698,col 5)-(line 2698,col 39)",
        "(line 2699,col 5)-(line 2699,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_78()",
      "begin_line": 2702,
      "end_line": 2708,
      "comment": "",
      "child_ranges": [
        "(line 2703,col 5)-(line 2703,col 32)",
        "(line 2704,col 5)-(line 2704,col 14)",
        "(line 2705,col 5)-(line 2705,col 21)",
        "(line 2706,col 5)-(line 2706,col 37)",
        "(line 2707,col 5)-(line 2707,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_69()",
      "begin_line": 2710,
      "end_line": 2714,
      "comment": "",
      "child_ranges": [
        "(line 2711,col 5)-(line 2711,col 45)",
        "(line 2712,col 5)-(line 2712,col 32)",
        "(line 2713,col 5)-(line 2713,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_57()",
      "begin_line": 2716,
      "end_line": 2719,
      "comment": "",
      "child_ranges": [
        "(line 2717,col 5)-(line 2717,col 59)",
        "(line 2718,col 5)-(line 2718,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_56()",
      "begin_line": 2721,
      "end_line": 2724,
      "comment": "",
      "child_ranges": [
        "(line 2722,col 5)-(line 2722,col 49)",
        "(line 2723,col 5)-(line 2723,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_55()",
      "begin_line": 2726,
      "end_line": 2729,
      "comment": "",
      "child_ranges": [
        "(line 2727,col 5)-(line 2727,col 51)",
        "(line 2728,col 5)-(line 2728,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_63()",
      "begin_line": 2731,
      "end_line": 2734,
      "comment": "",
      "child_ranges": [
        "(line 2732,col 5)-(line 2732,col 32)",
        "(line 2733,col 5)-(line 2733,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_54()",
      "begin_line": 2736,
      "end_line": 2739,
      "comment": "",
      "child_ranges": [
        "(line 2737,col 5)-(line 2737,col 53)",
        "(line 2738,col 5)-(line 2738,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_62()",
      "begin_line": 2741,
      "end_line": 2744,
      "comment": "",
      "child_ranges": [
        "(line 2742,col 5)-(line 2742,col 32)",
        "(line 2743,col 5)-(line 2743,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_53()",
      "begin_line": 2746,
      "end_line": 2749,
      "comment": "",
      "child_ranges": [
        "(line 2747,col 5)-(line 2747,col 51)",
        "(line 2748,col 5)-(line 2748,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_61()",
      "begin_line": 2751,
      "end_line": 2754,
      "comment": "",
      "child_ranges": [
        "(line 2752,col 5)-(line 2752,col 43)",
        "(line 2753,col 5)-(line 2753,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_52()",
      "begin_line": 2756,
      "end_line": 2759,
      "comment": "",
      "child_ranges": [
        "(line 2757,col 5)-(line 2757,col 49)",
        "(line 2758,col 5)-(line 2758,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_21()",
      "begin_line": 2761,
      "end_line": 2764,
      "comment": "",
      "child_ranges": [
        "(line 2762,col 5)-(line 2762,col 47)",
        "(line 2763,col 5)-(line 2763,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_60()",
      "begin_line": 2766,
      "end_line": 2769,
      "comment": "",
      "child_ranges": [
        "(line 2767,col 5)-(line 2767,col 44)",
        "(line 2768,col 5)-(line 2768,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_51()",
      "begin_line": 2771,
      "end_line": 2774,
      "comment": "",
      "child_ranges": [
        "(line 2772,col 5)-(line 2772,col 52)",
        "(line 2773,col 5)-(line 2773,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_59()",
      "begin_line": 2776,
      "end_line": 2781,
      "comment": "",
      "child_ranges": [
        "(line 2777,col 5)-(line 2777,col 39)",
        "(line 2778,col 5)-(line 2778,col 32)",
        "(line 2779,col 5)-(line 2779,col 39)",
        "(line 2780,col 5)-(line 2780,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_87()",
      "begin_line": 2783,
      "end_line": 2787,
      "comment": "",
      "child_ranges": [
        "(line 2784,col 5)-(line 2784,col 39)",
        "(line 2785,col 5)-(line 2785,col 32)",
        "(line 2786,col 5)-(line 2786,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_50()",
      "begin_line": 2789,
      "end_line": 2792,
      "comment": "",
      "child_ranges": [
        "(line 2790,col 5)-(line 2790,col 50)",
        "(line 2791,col 5)-(line 2791,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_58()",
      "begin_line": 2794,
      "end_line": 2797,
      "comment": "",
      "child_ranges": [
        "(line 2795,col 5)-(line 2795,col 32)",
        "(line 2796,col 5)-(line 2796,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_81()",
      "begin_line": 2799,
      "end_line": 2802,
      "comment": "",
      "child_ranges": [
        "(line 2800,col 5)-(line 2800,col 32)",
        "(line 2801,col 5)-(line 2801,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_49()",
      "begin_line": 2804,
      "end_line": 2807,
      "comment": "",
      "child_ranges": [
        "(line 2805,col 5)-(line 2805,col 50)",
        "(line 2806,col 5)-(line 2806,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_48()",
      "begin_line": 2809,
      "end_line": 2812,
      "comment": "",
      "child_ranges": [
        "(line 2810,col 5)-(line 2810,col 51)",
        "(line 2811,col 5)-(line 2811,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_47()",
      "begin_line": 2814,
      "end_line": 2817,
      "comment": "",
      "child_ranges": [
        "(line 2815,col 5)-(line 2815,col 50)",
        "(line 2816,col 5)-(line 2816,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_46()",
      "begin_line": 2819,
      "end_line": 2822,
      "comment": "",
      "child_ranges": [
        "(line 2820,col 5)-(line 2820,col 49)",
        "(line 2821,col 5)-(line 2821,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_16()",
      "begin_line": 2824,
      "end_line": 2833,
      "comment": "",
      "child_ranges": [
        "(line 2825,col 5)-(line 2825,col 14)",
        "(line 2826,col 5)-(line 2826,col 21)",
        "(line 2827,col 5)-(line 2830,col 5)",
        "(line 2831,col 5)-(line 2831,col 32)",
        "(line 2832,col 5)-(line 2832,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_149()",
      "begin_line": 2835,
      "end_line": 2838,
      "comment": "",
      "child_ranges": [
        "(line 2836,col 5)-(line 2836,col 32)",
        "(line 2837,col 5)-(line 2837,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_45()",
      "begin_line": 2840,
      "end_line": 2843,
      "comment": "",
      "child_ranges": [
        "(line 2841,col 5)-(line 2841,col 53)",
        "(line 2842,col 5)-(line 2842,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_44()",
      "begin_line": 2845,
      "end_line": 2848,
      "comment": "",
      "child_ranges": [
        "(line 2846,col 5)-(line 2846,col 55)",
        "(line 2847,col 5)-(line 2847,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_19()",
      "begin_line": 2850,
      "end_line": 2870,
      "comment": "",
      "child_ranges": [
        "(line 2851,col 5)-(line 2851,col 14)",
        "(line 2852,col 5)-(line 2852,col 21)",
        "(line 2853,col 5)-(line 2868,col 5)",
        "(line 2869,col 5)-(line 2869,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_43()",
      "begin_line": 2872,
      "end_line": 2875,
      "comment": "",
      "child_ranges": [
        "(line 2873,col 5)-(line 2873,col 61)",
        "(line 2874,col 5)-(line 2874,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_42()",
      "begin_line": 2877,
      "end_line": 2880,
      "comment": "",
      "child_ranges": [
        "(line 2878,col 5)-(line 2878,col 59)",
        "(line 2879,col 5)-(line 2879,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_41()",
      "begin_line": 2882,
      "end_line": 2885,
      "comment": "",
      "child_ranges": [
        "(line 2883,col 5)-(line 2883,col 55)",
        "(line 2884,col 5)-(line 2884,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_40()",
      "begin_line": 2887,
      "end_line": 2890,
      "comment": "",
      "child_ranges": [
        "(line 2888,col 5)-(line 2888,col 61)",
        "(line 2889,col 5)-(line 2889,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_79()",
      "begin_line": 2892,
      "end_line": 2900,
      "comment": "",
      "child_ranges": [
        "(line 2893,col 5)-(line 2893,col 32)",
        "(line 2894,col 5)-(line 2894,col 14)",
        "(line 2895,col 5)-(line 2898,col 5)",
        "(line 2899,col 5)-(line 2899,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_39()",
      "begin_line": 2902,
      "end_line": 2905,
      "comment": "",
      "child_ranges": [
        "(line 2903,col 5)-(line 2903,col 62)",
        "(line 2904,col 5)-(line 2904,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_38()",
      "begin_line": 2907,
      "end_line": 2910,
      "comment": "",
      "child_ranges": [
        "(line 2908,col 5)-(line 2908,col 54)",
        "(line 2909,col 5)-(line 2909,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_37()",
      "begin_line": 2912,
      "end_line": 2915,
      "comment": "",
      "child_ranges": [
        "(line 2913,col 5)-(line 2913,col 55)",
        "(line 2914,col 5)-(line 2914,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_36()",
      "begin_line": 2917,
      "end_line": 2920,
      "comment": "",
      "child_ranges": [
        "(line 2918,col 5)-(line 2918,col 57)",
        "(line 2919,col 5)-(line 2919,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_35()",
      "begin_line": 2922,
      "end_line": 2925,
      "comment": "",
      "child_ranges": [
        "(line 2923,col 5)-(line 2923,col 52)",
        "(line 2924,col 5)-(line 2924,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_34()",
      "begin_line": 2927,
      "end_line": 2930,
      "comment": "",
      "child_ranges": [
        "(line 2928,col 5)-(line 2928,col 52)",
        "(line 2929,col 5)-(line 2929,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_33()",
      "begin_line": 2932,
      "end_line": 2935,
      "comment": "",
      "child_ranges": [
        "(line 2933,col 5)-(line 2933,col 50)",
        "(line 2934,col 5)-(line 2934,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_32()",
      "begin_line": 2937,
      "end_line": 2940,
      "comment": "",
      "child_ranges": [
        "(line 2938,col 5)-(line 2938,col 59)",
        "(line 2939,col 5)-(line 2939,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_31()",
      "begin_line": 2942,
      "end_line": 2945,
      "comment": "",
      "child_ranges": [
        "(line 2943,col 5)-(line 2943,col 56)",
        "(line 2944,col 5)-(line 2944,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_70()",
      "begin_line": 2947,
      "end_line": 2950,
      "comment": "",
      "child_ranges": [
        "(line 2948,col 5)-(line 2948,col 32)",
        "(line 2949,col 5)-(line 2949,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_30()",
      "begin_line": 2952,
      "end_line": 2955,
      "comment": "",
      "child_ranges": [
        "(line 2953,col 5)-(line 2953,col 48)",
        "(line 2954,col 5)-(line 2954,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_29()",
      "begin_line": 2957,
      "end_line": 2960,
      "comment": "",
      "child_ranges": [
        "(line 2958,col 5)-(line 2958,col 51)",
        "(line 2959,col 5)-(line 2959,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_28()",
      "begin_line": 2962,
      "end_line": 2965,
      "comment": "",
      "child_ranges": [
        "(line 2963,col 5)-(line 2963,col 54)",
        "(line 2964,col 5)-(line 2964,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_27()",
      "begin_line": 2967,
      "end_line": 2970,
      "comment": "",
      "child_ranges": [
        "(line 2968,col 5)-(line 2968,col 50)",
        "(line 2969,col 5)-(line 2969,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_147()",
      "begin_line": 2972,
      "end_line": 2980,
      "comment": "",
      "child_ranges": [
        "(line 2973,col 5)-(line 2973,col 32)",
        "(line 2974,col 5)-(line 2974,col 14)",
        "(line 2975,col 5)-(line 2978,col 5)",
        "(line 2979,col 5)-(line 2979,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_3R_18()",
      "begin_line": 2982,
      "end_line": 3077,
      "comment": "",
      "child_ranges": [
        "(line 2983,col 5)-(line 2983,col 14)",
        "(line 2984,col 5)-(line 2984,col 21)",
        "(line 2985,col 5)-(line 3075,col 5)",
        "(line 3076,col 5)-(line 3076,col 17)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "token_source"
      ],
      "begin_line": 3079,
      "end_line": 3079,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "jj_input_stream"
      ],
      "begin_line": 3080,
      "end_line": 3080,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "token",
        "jj_nt"
      ],
      "begin_line": 3081,
      "end_line": 3081,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "jj_scanpos",
        "jj_lastpos"
      ],
      "begin_line": 3082,
      "end_line": 3082,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "jj_la"
      ],
      "begin_line": 3083,
      "end_line": 3083,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lookingAhead"
      ],
      "begin_line": 3084,
      "end_line": 3084,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "jj_semLA"
      ],
      "begin_line": 3085,
      "end_line": 3085,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "jj_gen"
      ],
      "begin_line": 3086,
      "end_line": 3086,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "jj_la1"
      ],
      "begin_line": 3087,
      "end_line": 3087,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "jj_la1_0"
      ],
      "begin_line": 3088,
      "end_line": 3088,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "jj_la1_1"
      ],
      "begin_line": 3089,
      "end_line": 3089,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "jj_la1_2"
      ],
      "begin_line": 3090,
      "end_line": 3090,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_la1_0()",
      "begin_line": 3096,
      "end_line": 3098,
      "comment": "",
      "child_ranges": [
        "(line 3097,col 7)-(line 3097,col 334)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_la1_1()",
      "begin_line": 3099,
      "end_line": 3101,
      "comment": "",
      "child_ranges": [
        "(line 3100,col 7)-(line 3100,col 269)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_la1_2()",
      "begin_line": 3102,
      "end_line": 3104,
      "comment": "",
      "child_ranges": [
        "(line 3103,col 7)-(line 3103,col 294)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "jj_2_rtns"
      ],
      "begin_line": 3105,
      "end_line": 3105,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "jj_rescan"
      ],
      "begin_line": 3106,
      "end_line": 3106,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "jj_gc"
      ],
      "begin_line": 3107,
      "end_line": 3107,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.XPathParser(java.io.InputStream)",
      "begin_line": 3109,
      "end_line": 3117,
      "comment": "",
      "child_ranges": [
        "(line 3110,col 5)-(line 3110,col 57)",
        "(line 3111,col 5)-(line 3111,col 64)",
        "(line 3112,col 5)-(line 3112,col 24)",
        "(line 3113,col 5)-(line 3113,col 53)",
        "(line 3114,col 5)-(line 3114,col 15)",
        "(line 3115,col 5)-(line 3115,col 48)",
        "(line 3116,col 5)-(line 3116,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.ReInit(java.io.InputStream)",
      "begin_line": 3119,
      "end_line": 3127,
      "comment": "",
      "child_ranges": [
        "(line 3120,col 5)-(line 3120,col 41)",
        "(line 3121,col 5)-(line 3121,col 41)",
        "(line 3122,col 5)-(line 3122,col 24)",
        "(line 3123,col 5)-(line 3123,col 53)",
        "(line 3124,col 5)-(line 3124,col 15)",
        "(line 3125,col 5)-(line 3125,col 48)",
        "(line 3126,col 5)-(line 3126,col 76)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.XPathParser(java.io.Reader)",
      "begin_line": 3129,
      "end_line": 3137,
      "comment": "",
      "child_ranges": [
        "(line 3130,col 5)-(line 3130,col 57)",
        "(line 3131,col 5)-(line 3131,col 64)",
        "(line 3132,col 5)-(line 3132,col 24)",
        "(line 3133,col 5)-(line 3133,col 53)",
        "(line 3134,col 5)-(line 3134,col 15)",
        "(line 3135,col 5)-(line 3135,col 48)",
        "(line 3136,col 5)-(line 3136,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.ReInit(java.io.Reader)",
      "begin_line": 3139,
      "end_line": 3147,
      "comment": "",
      "child_ranges": [
        "(line 3140,col 5)-(line 3140,col 41)",
        "(line 3141,col 5)-(line 3141,col 41)",
        "(line 3142,col 5)-(line 3142,col 24)",
        "(line 3143,col 5)-(line 3143,col 53)",
        "(line 3144,col 5)-(line 3144,col 15)",
        "(line 3145,col 5)-(line 3145,col 48)",
        "(line 3146,col 5)-(line 3146,col 76)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.XPathParser(org.apache.commons.jxpath.ri.parser.XPathParserTokenManager)",
      "begin_line": 3149,
      "end_line": 3156,
      "comment": "",
      "child_ranges": [
        "(line 3150,col 5)-(line 3150,col 22)",
        "(line 3151,col 5)-(line 3151,col 24)",
        "(line 3152,col 5)-(line 3152,col 53)",
        "(line 3153,col 5)-(line 3153,col 15)",
        "(line 3154,col 5)-(line 3154,col 48)",
        "(line 3155,col 5)-(line 3155,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.ReInit(org.apache.commons.jxpath.ri.parser.XPathParserTokenManager)",
      "begin_line": 3158,
      "end_line": 3165,
      "comment": "",
      "child_ranges": [
        "(line 3159,col 5)-(line 3159,col 22)",
        "(line 3160,col 5)-(line 3160,col 24)",
        "(line 3161,col 5)-(line 3161,col 53)",
        "(line 3162,col 5)-(line 3162,col 15)",
        "(line 3163,col 5)-(line 3163,col 48)",
        "(line 3164,col 5)-(line 3164,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_consume_token(int)",
      "begin_line": 3167,
      "end_line": 3189,
      "comment": "",
      "child_ranges": [
        "(line 3168,col 5)-(line 3168,col 27)",
        "(line 3169,col 5)-(line 3170,col 58)",
        "(line 3171,col 5)-(line 3184,col 5)",
        "(line 3185,col 5)-(line 3185,col 18)",
        "(line 3186,col 5)-(line 3186,col 21)",
        "(line 3187,col 5)-(line 3187,col 19)",
        "(line 3188,col 5)-(line 3188,col 35)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LookaheadSuccess",
      "is_interface": false,
      "parent_types": [
        "java.lang.Error"
      ],
      "begin_line": 3191,
      "end_line": 3191,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "jj_ls"
      ],
      "begin_line": 3192,
      "end_line": 3192,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_scan_token(int)",
      "begin_line": 3193,
      "end_line": 3212,
      "comment": "",
      "child_ranges": [
        "(line 3194,col 5)-(line 3203,col 5)",
        "(line 3204,col 5)-(line 3208,col 5)",
        "(line 3209,col 5)-(line 3209,col 45)",
        "(line 3210,col 5)-(line 3210,col 60)",
        "(line 3211,col 5)-(line 3211,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.getNextToken()",
      "begin_line": 3214,
      "end_line": 3219,
      "comment": "",
      "child_ranges": [
        "(line 3215,col 5)-(line 3216,col 58)",
        "(line 3217,col 5)-(line 3217,col 13)",
        "(line 3218,col 5)-(line 3218,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.getToken(int)",
      "begin_line": 3221,
      "end_line": 3228,
      "comment": "",
      "child_ranges": [
        "(line 3222,col 5)-(line 3222,col 48)",
        "(line 3223,col 5)-(line 3226,col 5)",
        "(line 3227,col 5)-(line 3227,col 13)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "jj_expentries"
      ],
      "begin_line": 3230,
      "end_line": 3230,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "jj_expentry"
      ],
      "begin_line": 3231,
      "end_line": 3231,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "jj_kind"
      ],
      "begin_line": 3232,
      "end_line": 3232,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "jj_lasttokens"
      ],
      "begin_line": 3233,
      "end_line": 3233,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "jj_endpos"
      ],
      "begin_line": 3234,
      "end_line": 3234,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_add_error_token(int, int)",
      "begin_line": 3236,
      "end_line": 3262,
      "comment": "",
      "child_ranges": [
        "(line 3237,col 5)-(line 3237,col 27)",
        "(line 3238,col 5)-(line 3261,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.generateParseException()",
      "begin_line": 3264,
      "end_line": 3304,
      "comment": "",
      "child_ranges": [
        "(line 3265,col 5)-(line 3265,col 38)",
        "(line 3266,col 5)-(line 3266,col 42)",
        "(line 3267,col 5)-(line 3269,col 5)",
        "(line 3270,col 5)-(line 3273,col 5)",
        "(line 3274,col 5)-(line 3288,col 5)",
        "(line 3289,col 5)-(line 3295,col 5)",
        "(line 3296,col 5)-(line 3296,col 18)",
        "(line 3297,col 5)-(line 3297,col 22)",
        "(line 3298,col 5)-(line 3298,col 29)",
        "(line 3299,col 5)-(line 3299,col 56)",
        "(line 3300,col 5)-(line 3302,col 5)",
        "(line 3303,col 5)-(line 3303,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.enable_tracing()",
      "begin_line": 3306,
      "end_line": 3307,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.disable_tracing()",
      "begin_line": 3309,
      "end_line": 3310,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_rescan_token()",
      "begin_line": 3312,
      "end_line": 3332,
      "comment": "",
      "child_ranges": [
        "(line 3313,col 5)-(line 3313,col 21)",
        "(line 3314,col 5)-(line 3330,col 5)",
        "(line 3331,col 5)-(line 3331,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.XPathParser.jj_save(int, int)",
      "begin_line": 3334,
      "end_line": 3341,
      "comment": "",
      "child_ranges": [
        "(line 3335,col 5)-(line 3335,col 33)",
        "(line 3336,col 5)-(line 3339,col 5)",
        "(line 3340,col 5)-(line 3340,col 33)",
        "(line 3340,col 35)-(line 3340,col 50)",
        "(line 3340,col 52)-(line 3340,col 63)"
      ]
    },
    {
      "type": "class_interface",
      "name": "JJCalls",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 3343,
      "end_line": 3348,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "gen"
      ],
      "begin_line": 3344,
      "end_line": 3344,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "first"
      ],
      "begin_line": 3345,
      "end_line": 3345,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "arg"
      ],
      "begin_line": 3346,
      "end_line": 3346,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "next"
      ],
      "begin_line": 3347,
      "end_line": 3347,
      "comment": ""
    }
  ]
}