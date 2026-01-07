{
  "filepath": "/tmp/JxPath-16b/src/test/org/apache/commons/jxpath/ri/model/XMLModelTestCase.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "XMLModelTestCase",
      "is_interface": false,
      "parent_types": [
        "JXPathTestCase"
      ],
      "begin_line": 37,
      "end_line": 853,
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
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.Anonymous-d073289f-7810-4693-aaad-323780d35374.getPointerByID(org.apache.commons.jxpath.JXPathContext, java.lang.String)",
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
      "end_line": 579,
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
        "(line 555,col 9)-(line 558,col 25)",
        "(line 561,col 9)-(line 561,col 66)",
        "(line 564,col 9)-(line 564,col 75)",
        "(line 567,col 9)-(line 567,col 80)",
        "(line 570,col 9)-(line 573,col 31)",
        "(line 575,col 9)-(line 578,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testAxisNamespace()",
      "begin_line": 581,
      "end_line": 606,
      "comment": "",
      "child_ranges": [
        "(line 583,col 9)-(line 587,col 62)",
        "(line 590,col 9)-(line 593,col 27)",
        "(line 596,col 9)-(line 599,col 21)",
        "(line 602,col 9)-(line 605,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testAxisAncestor()",
      "begin_line": 608,
      "end_line": 622,
      "comment": "",
      "child_ranges": [
        "(line 610,col 9)-(line 614,col 21)",
        "(line 617,col 9)-(line 621,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testAxisAncestorOrSelf()",
      "begin_line": 624,
      "end_line": 631,
      "comment": "",
      "child_ranges": [
        "(line 626,col 9)-(line 630,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testAxisFollowing()",
      "begin_line": 633,
      "end_line": 645,
      "comment": "",
      "child_ranges": [
        "(line 634,col 9)-(line 637,col 53)",
        "(line 640,col 9)-(line 643,col 21)",
        "(line 644,col 9)-(line 644,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testAxisSelf()",
      "begin_line": 647,
      "end_line": 656,
      "comment": "",
      "child_ranges": [
        "(line 649,col 9)-(line 652,col 21)",
        "(line 655,col 9)-(line 655,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testNodeTypeComment()",
      "begin_line": 658,
      "end_line": 664,
      "comment": "",
      "child_ranges": [
        "(line 660,col 9)-(line 663,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testNodeTypeText()",
      "begin_line": 666,
      "end_line": 680,
      "comment": "",
      "child_ranges": [
        "(line 669,col 9)-(line 672,col 37)",
        "(line 675,col 9)-(line 678,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testNodeTypeProcessingInstruction()",
      "begin_line": 682,
      "end_line": 706,
      "comment": "",
      "child_ranges": [
        "(line 684,col 9)-(line 687,col 35)",
        "(line 690,col 9)-(line 693,col 28)",
        "(line 696,col 9)-(line 699,col 73)",
        "(line 702,col 9)-(line 705,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testLang()",
      "begin_line": 708,
      "end_line": 720,
      "comment": "",
      "child_ranges": [
        "(line 710,col 9)-(line 710,col 68)",
        "(line 713,col 9)-(line 713,col 74)",
        "(line 716,col 9)-(line 719,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testDocument()",
      "begin_line": 722,
      "end_line": 734,
      "comment": "",
      "child_ranges": [
        "(line 723,col 9)-(line 726,col 28)",
        "(line 728,col 9)-(line 731,col 68)",
        "(line 733,col 9)-(line 733,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testContainer()",
      "begin_line": 736,
      "end_line": 751,
      "comment": "",
      "child_ranges": [
        "(line 737,col 9)-(line 737,col 79)",
        "(line 739,col 9)-(line 739,col 72)",
        "(line 741,col 9)-(line 744,col 69)",
        "(line 747,col 9)-(line 750,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testElementInVariable()",
      "begin_line": 753,
      "end_line": 755,
      "comment": "",
      "child_ranges": [
        "(line 754,col 9)-(line 754,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testTypeConversions()",
      "begin_line": 757,
      "end_line": 769,
      "comment": "",
      "child_ranges": [
        "(line 759,col 9)-(line 762,col 28)",
        "(line 765,col 9)-(line 768,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testBooleanFunction()",
      "begin_line": 771,
      "end_line": 786,
      "comment": "",
      "child_ranges": [
        "(line 772,col 9)-(line 775,col 26)",
        "(line 777,col 9)-(line 780,col 26)",
        "(line 782,col 9)-(line 785,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testFunctionsLastAndPosition()",
      "begin_line": 788,
      "end_line": 793,
      "comment": "",
      "child_ranges": [
        "(line 789,col 9)-(line 792,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testNamespaceMapping()",
      "begin_line": 795,
      "end_line": 842,
      "comment": "",
      "child_ranges": [
        "(line 796,col 9)-(line 796,col 53)",
        "(line 797,col 9)-(line 797,col 56)",
        "(line 799,col 9)-(line 801,col 50)",
        "(line 803,col 9)-(line 805,col 49)",
        "(line 808,col 9)-(line 810,col 31)",
        "(line 812,col 9)-(line 813,col 77)",
        "(line 814,col 9)-(line 815,col 78)",
        "(line 816,col 9)-(line 817,col 78)",
        "(line 818,col 9)-(line 819,col 79)",
        "(line 822,col 9)-(line 825,col 55)",
        "(line 828,col 9)-(line 829,col 72)",
        "(line 830,col 9)-(line 833,col 55)",
        "(line 836,col 9)-(line 837,col 70)",
        "(line 838,col 9)-(line 841,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testUnion()",
      "begin_line": 844,
      "end_line": 847,
      "comment": "",
      "child_ranges": [
        "(line 845,col 9)-(line 845,col 91)",
        "(line 846,col 9)-(line 846,col 91)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testNodes()",
      "begin_line": 849,
      "end_line": 852,
      "comment": "",
      "child_ranges": [
        "(line 850,col 9)-(line 850,col 70)",
        "(line 851,col 9)-(line 851,col 66)"
      ]
    }
  ]
}