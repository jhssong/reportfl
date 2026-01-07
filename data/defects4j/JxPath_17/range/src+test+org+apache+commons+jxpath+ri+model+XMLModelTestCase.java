{
  "filepath": "/tmp/JxPath-17b/src/test/org/apache/commons/jxpath/ri/model/XMLModelTestCase.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "XMLModelTestCase",
      "is_interface": false,
      "parent_types": [
        "JXPathTestCase"
      ],
      "begin_line": 37,
      "end_line": 860,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "context"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.XMLModelTestCase(java.lang.String)",
      "begin_line": 45,
      "end_line": 47,
      "comment": "\n     * Construct a new instance of this test case.\n     *\n     * @param name Name of the test case\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.setUp()",
      "begin_line": 49,
      "end_line": 60,
      "comment": "",
      "child_ranges": [
        "(line 50,col 9)-(line 59,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.getModel()",
      "begin_line": 62,
      "end_line": 62,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.createDocumentContainer()",
      "begin_line": 64,
      "end_line": 68,
      "comment": "",
      "child_ranges": [
        "(line 65,col 9)-(line 67,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.getAbstractFactory()",
      "begin_line": 70,
      "end_line": 70,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.createContext()",
      "begin_line": 72,
      "end_line": 78,
      "comment": "",
      "child_ranges": [
        "(line 73,col 9)-(line 74,col 64)",
        "(line 75,col 9)-(line 75,col 49)",
        "(line 76,col 9)-(line 76,col 58)",
        "(line 77,col 9)-(line 77,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.getXMLSignature(java.lang.Object, boolean, boolean, boolean, boolean)",
      "begin_line": 85,
      "end_line": 90,
      "comment": "\n     * An XML signature is used to determine if we have the right result\n     * after a modification of XML by JXPath.  It is basically a piece\n     * of simplified XML.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.assertXMLSignature(org.apache.commons.jxpath.JXPathContext, java.lang.String, java.lang.String, boolean, boolean, boolean, boolean)",
      "begin_line": 92,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 57)",
        "(line 102,col 9)-(line 102,col 75)",
        "(line 103,col 9)-(line 103,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testDocumentOrder()",
      "begin_line": 108,
      "end_line": 126,
      "comment": "",
      "child_ranges": [
        "(line 109,col 9)-(line 113,col 16)",
        "(line 115,col 9)-(line 119,col 16)",
        "(line 121,col 9)-(line 125,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testSetValue()",
      "begin_line": 129,
      "end_line": 157,
      "comment": "",
      "child_ranges": [
        "(line 130,col 9)-(line 133,col 24)",
        "(line 135,col 9)-(line 142,col 19)",
        "(line 144,col 9)-(line 147,col 32)",
        "(line 149,col 9)-(line 156,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testCreatePath()",
      "begin_line": 162,
      "end_line": 204,
      "comment": "\n     * Test JXPathContext.createPath() with various arguments\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 168,col 38)",
        "(line 171,col 9)-(line 175,col 59)",
        "(line 178,col 9)-(line 182,col 47)",
        "(line 184,col 9)-(line 188,col 44)",
        "(line 190,col 10)-(line 194,col 47)",
        "(line 196,col 10)-(line 196,col 55)",
        "(line 199,col 10)-(line 203,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testCreatePathAndSetValue()",
      "begin_line": 209,
      "end_line": 257,
      "comment": "\n     * Test JXPath.createPathAndSetValue() with various arguments\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 215,col 38)",
        "(line 218,col 9)-(line 222,col 59)",
        "(line 225,col 9)-(line 229,col 47)",
        "(line 231,col 9)-(line 235,col 47)",
        "(line 237,col 9)-(line 241,col 47)",
        "(line 243,col 9)-(line 247,col 69)",
        "(line 249,col 9)-(line 249,col 54)",
        "(line 252,col 9)-(line 256,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testRemovePath()",
      "begin_line": 262,
      "end_line": 281,
      "comment": "\n     * Test JXPathContext.removePath() with various arguments\n     ",
      "child_ranges": [
        "(line 264,col 9)-(line 264,col 74)",
        "(line 265,col 9)-(line 268,col 70)",
        "(line 270,col 9)-(line 270,col 67)",
        "(line 271,col 9)-(line 274,col 77)",
        "(line 276,col 9)-(line 276,col 65)",
        "(line 277,col 9)-(line 280,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testID()",
      "begin_line": 283,
      "end_line": 302,
      "comment": "",
      "child_ranges": [
        "(line 284,col 9)-(line 290,col 11)",
        "(line 292,col 9)-(line 296,col 46)",
        "(line 298,col 9)-(line 301,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.Anonymous-94d8eff0-ff9e-4335-bac6-b2b76359931d.getPointerByID(org.apache.commons.jxpath.JXPathContext, java.lang.String)",
      "begin_line": 285,
      "end_line": 289,
      "comment": "",
      "child_ranges": [
        "(line 286,col 17)-(line 286,col 72)",
        "(line 287,col 17)-(line 287,col 44)",
        "(line 288,col 17)-(line 288,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testAxisChild()",
      "begin_line": 304,
      "end_line": 383,
      "comment": "",
      "child_ranges": [
        "(line 305,col 9)-(line 308,col 28)",
        "(line 311,col 9)-(line 314,col 28)",
        "(line 317,col 9)-(line 320,col 22)",
        "(line 323,col 9)-(line 323,col 77)",
        "(line 326,col 9)-(line 329,col 28)",
        "(line 332,col 9)-(line 335,col 24)",
        "(line 338,col 9)-(line 341,col 23)",
        "(line 344,col 9)-(line 344,col 67)",
        "(line 346,col 9)-(line 346,col 73)",
        "(line 348,col 9)-(line 348,col 28)",
        "(line 349,col 9)-(line 355,col 9)",
        "(line 356,col 9)-(line 356,col 71)",
        "(line 358,col 9)-(line 358,col 20)",
        "(line 359,col 9)-(line 365,col 9)",
        "(line 366,col 9)-(line 366,col 74)",
        "(line 369,col 9)-(line 372,col 27)",
        "(line 375,col 9)-(line 375,col 76)",
        "(line 378,col 9)-(line 378,col 74)",
        "(line 381,col 9)-(line 381,col 47)",
        "(line 382,col 9)-(line 382,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testAxisChildIndexPredicate()",
      "begin_line": 385,
      "end_line": 390,
      "comment": "",
      "child_ranges": [
        "(line 386,col 9)-(line 389,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testAxisDescendant()",
      "begin_line": 392,
      "end_line": 412,
      "comment": "",
      "child_ranges": [
        "(line 394,col 9)-(line 394,col 62)",
        "(line 397,col 9)-(line 397,col 69)",
        "(line 399,col 9)-(line 399,col 77)",
        "(line 401,col 9)-(line 401,col 73)",
        "(line 403,col 9)-(line 406,col 27)",
        "(line 408,col 9)-(line 411,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testAxisParent()",
      "begin_line": 421,
      "end_line": 441,
      "comment": "",
      "child_ranges": [
        "(line 423,col 9)-(line 426,col 49)",
        "(line 429,col 9)-(line 434,col 54)",
        "(line 437,col 9)-(line 440,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testAxisFollowingSibling()",
      "begin_line": 443,
      "end_line": 457,
      "comment": "",
      "child_ranges": [
        "(line 445,col 9)-(line 449,col 31)",
        "(line 452,col 9)-(line 456,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testAxisPrecedingSibling()",
      "begin_line": 459,
      "end_line": 465,
      "comment": "",
      "child_ranges": [
        "(line 461,col 9)-(line 464,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testAxisPreceding()",
      "begin_line": 467,
      "end_line": 476,
      "comment": "",
      "child_ranges": [
        "(line 469,col 9)-(line 472,col 55)",
        "(line 473,col 9)-(line 473,col 112)",
        "(line 474,col 9)-(line 474,col 127)",
        "(line 475,col 9)-(line 475,col 117)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testAxisAttribute()",
      "begin_line": 478,
      "end_line": 586,
      "comment": "",
      "child_ranges": [
        "(line 480,col 9)-(line 480,col 64)",
        "(line 483,col 9)-(line 486,col 42)",
        "(line 489,col 9)-(line 492,col 32)",
        "(line 495,col 9)-(line 498,col 19)",
        "(line 501,col 9)-(line 504,col 23)",
        "(line 507,col 9)-(line 510,col 24)",
        "(line 513,col 9)-(line 516,col 30)",
        "(line 519,col 9)-(line 522,col 19)",
        "(line 525,col 9)-(line 528,col 16)",
        "(line 531,col 9)-(line 534,col 24)",
        "(line 537,col 9)-(line 540,col 24)",
        "(line 543,col 9)-(line 546,col 25)",
        "(line 549,col 9)-(line 552,col 37)",
        "(line 555,col 9)-(line 559,col 35)",
        "(line 562,col 9)-(line 565,col 25)",
        "(line 568,col 9)-(line 568,col 66)",
        "(line 571,col 9)-(line 571,col 75)",
        "(line 574,col 9)-(line 574,col 80)",
        "(line 577,col 9)-(line 580,col 31)",
        "(line 582,col 9)-(line 585,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testAxisNamespace()",
      "begin_line": 588,
      "end_line": 613,
      "comment": "",
      "child_ranges": [
        "(line 590,col 9)-(line 594,col 62)",
        "(line 597,col 9)-(line 600,col 27)",
        "(line 603,col 9)-(line 606,col 21)",
        "(line 609,col 9)-(line 612,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testAxisAncestor()",
      "begin_line": 615,
      "end_line": 629,
      "comment": "",
      "child_ranges": [
        "(line 617,col 9)-(line 621,col 21)",
        "(line 624,col 9)-(line 628,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testAxisAncestorOrSelf()",
      "begin_line": 631,
      "end_line": 638,
      "comment": "",
      "child_ranges": [
        "(line 633,col 9)-(line 637,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testAxisFollowing()",
      "begin_line": 640,
      "end_line": 652,
      "comment": "",
      "child_ranges": [
        "(line 641,col 9)-(line 644,col 53)",
        "(line 647,col 9)-(line 650,col 21)",
        "(line 651,col 9)-(line 651,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testAxisSelf()",
      "begin_line": 654,
      "end_line": 663,
      "comment": "",
      "child_ranges": [
        "(line 656,col 9)-(line 659,col 21)",
        "(line 662,col 9)-(line 662,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testNodeTypeComment()",
      "begin_line": 665,
      "end_line": 671,
      "comment": "",
      "child_ranges": [
        "(line 667,col 9)-(line 670,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testNodeTypeText()",
      "begin_line": 673,
      "end_line": 687,
      "comment": "",
      "child_ranges": [
        "(line 676,col 9)-(line 679,col 37)",
        "(line 682,col 9)-(line 685,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testNodeTypeProcessingInstruction()",
      "begin_line": 689,
      "end_line": 713,
      "comment": "",
      "child_ranges": [
        "(line 691,col 9)-(line 694,col 35)",
        "(line 697,col 9)-(line 700,col 28)",
        "(line 703,col 9)-(line 706,col 73)",
        "(line 709,col 9)-(line 712,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testLang()",
      "begin_line": 715,
      "end_line": 727,
      "comment": "",
      "child_ranges": [
        "(line 717,col 9)-(line 717,col 68)",
        "(line 720,col 9)-(line 720,col 74)",
        "(line 723,col 9)-(line 726,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testDocument()",
      "begin_line": 729,
      "end_line": 741,
      "comment": "",
      "child_ranges": [
        "(line 730,col 9)-(line 733,col 28)",
        "(line 735,col 9)-(line 738,col 68)",
        "(line 740,col 9)-(line 740,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testContainer()",
      "begin_line": 743,
      "end_line": 758,
      "comment": "",
      "child_ranges": [
        "(line 744,col 9)-(line 744,col 79)",
        "(line 746,col 9)-(line 746,col 72)",
        "(line 748,col 9)-(line 751,col 69)",
        "(line 754,col 9)-(line 757,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testElementInVariable()",
      "begin_line": 760,
      "end_line": 762,
      "comment": "",
      "child_ranges": [
        "(line 761,col 9)-(line 761,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testTypeConversions()",
      "begin_line": 764,
      "end_line": 776,
      "comment": "",
      "child_ranges": [
        "(line 766,col 9)-(line 769,col 28)",
        "(line 772,col 9)-(line 775,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testBooleanFunction()",
      "begin_line": 778,
      "end_line": 793,
      "comment": "",
      "child_ranges": [
        "(line 779,col 9)-(line 782,col 26)",
        "(line 784,col 9)-(line 787,col 26)",
        "(line 789,col 9)-(line 792,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testFunctionsLastAndPosition()",
      "begin_line": 795,
      "end_line": 800,
      "comment": "",
      "child_ranges": [
        "(line 796,col 9)-(line 799,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testNamespaceMapping()",
      "begin_line": 802,
      "end_line": 849,
      "comment": "",
      "child_ranges": [
        "(line 803,col 9)-(line 803,col 53)",
        "(line 804,col 9)-(line 804,col 56)",
        "(line 806,col 9)-(line 808,col 50)",
        "(line 810,col 9)-(line 812,col 49)",
        "(line 815,col 9)-(line 817,col 31)",
        "(line 819,col 9)-(line 820,col 77)",
        "(line 821,col 9)-(line 822,col 78)",
        "(line 823,col 9)-(line 824,col 78)",
        "(line 825,col 9)-(line 826,col 79)",
        "(line 829,col 9)-(line 832,col 55)",
        "(line 835,col 9)-(line 836,col 72)",
        "(line 837,col 9)-(line 840,col 55)",
        "(line 843,col 9)-(line 844,col 70)",
        "(line 845,col 9)-(line 848,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testUnion()",
      "begin_line": 851,
      "end_line": 854,
      "comment": "",
      "child_ranges": [
        "(line 852,col 9)-(line 852,col 91)",
        "(line 853,col 9)-(line 853,col 91)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testNodes()",
      "begin_line": 856,
      "end_line": 859,
      "comment": "",
      "child_ranges": [
        "(line 857,col 9)-(line 857,col 70)",
        "(line 858,col 9)-(line 858,col 66)"
      ]
    }
  ]
}