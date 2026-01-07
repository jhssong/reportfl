{
  "filepath": "/tmp/JxPath-13b/src/test/org/apache/commons/jxpath/ri/model/XMLModelTestCase.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "XMLModelTestCase",
      "is_interface": false,
      "parent_types": [
        "JXPathTestCase"
      ],
      "begin_line": 37,
      "end_line": 831,
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
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.Anonymous-5b7a4948-9f9b-4dbb-9715-5ef2541761e3.getPointerByID(org.apache.commons.jxpath.JXPathContext, java.lang.String)",
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
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testAxisAttribute()",
      "begin_line": 467,
      "end_line": 568,
      "comment": "",
      "child_ranges": [
        "(line 469,col 9)-(line 469,col 64)",
        "(line 472,col 9)-(line 475,col 42)",
        "(line 478,col 9)-(line 481,col 32)",
        "(line 484,col 9)-(line 487,col 19)",
        "(line 490,col 9)-(line 493,col 23)",
        "(line 496,col 9)-(line 499,col 24)",
        "(line 502,col 9)-(line 505,col 30)",
        "(line 508,col 9)-(line 511,col 19)",
        "(line 514,col 9)-(line 517,col 16)",
        "(line 520,col 9)-(line 523,col 24)",
        "(line 526,col 9)-(line 529,col 24)",
        "(line 532,col 9)-(line 535,col 25)",
        "(line 538,col 9)-(line 541,col 37)",
        "(line 544,col 9)-(line 547,col 25)",
        "(line 550,col 9)-(line 550,col 66)",
        "(line 553,col 9)-(line 553,col 75)",
        "(line 556,col 9)-(line 556,col 80)",
        "(line 559,col 9)-(line 562,col 31)",
        "(line 564,col 9)-(line 567,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testAxisNamespace()",
      "begin_line": 570,
      "end_line": 595,
      "comment": "",
      "child_ranges": [
        "(line 572,col 9)-(line 576,col 62)",
        "(line 579,col 9)-(line 582,col 27)",
        "(line 585,col 9)-(line 588,col 21)",
        "(line 591,col 9)-(line 594,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testAxisAncestor()",
      "begin_line": 597,
      "end_line": 611,
      "comment": "",
      "child_ranges": [
        "(line 599,col 9)-(line 603,col 21)",
        "(line 606,col 9)-(line 610,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testAxisAncestorOrSelf()",
      "begin_line": 613,
      "end_line": 620,
      "comment": "",
      "child_ranges": [
        "(line 615,col 9)-(line 619,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testAxisFollowing()",
      "begin_line": 622,
      "end_line": 633,
      "comment": "",
      "child_ranges": [
        "(line 623,col 9)-(line 626,col 53)",
        "(line 629,col 9)-(line 632,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testAxisSelf()",
      "begin_line": 635,
      "end_line": 644,
      "comment": "",
      "child_ranges": [
        "(line 637,col 9)-(line 640,col 21)",
        "(line 643,col 9)-(line 643,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testNodeTypeComment()",
      "begin_line": 646,
      "end_line": 652,
      "comment": "",
      "child_ranges": [
        "(line 648,col 9)-(line 651,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testNodeTypeText()",
      "begin_line": 654,
      "end_line": 668,
      "comment": "",
      "child_ranges": [
        "(line 657,col 9)-(line 660,col 37)",
        "(line 663,col 9)-(line 666,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testNodeTypeProcessingInstruction()",
      "begin_line": 670,
      "end_line": 694,
      "comment": "",
      "child_ranges": [
        "(line 672,col 9)-(line 675,col 35)",
        "(line 678,col 9)-(line 681,col 28)",
        "(line 684,col 9)-(line 687,col 73)",
        "(line 690,col 9)-(line 693,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testLang()",
      "begin_line": 696,
      "end_line": 708,
      "comment": "",
      "child_ranges": [
        "(line 698,col 9)-(line 698,col 68)",
        "(line 701,col 9)-(line 701,col 74)",
        "(line 704,col 9)-(line 707,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testDocument()",
      "begin_line": 710,
      "end_line": 722,
      "comment": "",
      "child_ranges": [
        "(line 711,col 9)-(line 714,col 28)",
        "(line 716,col 9)-(line 719,col 68)",
        "(line 721,col 9)-(line 721,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testContainer()",
      "begin_line": 724,
      "end_line": 739,
      "comment": "",
      "child_ranges": [
        "(line 725,col 9)-(line 725,col 79)",
        "(line 727,col 9)-(line 727,col 72)",
        "(line 729,col 9)-(line 732,col 69)",
        "(line 735,col 9)-(line 738,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testElementInVariable()",
      "begin_line": 741,
      "end_line": 743,
      "comment": "",
      "child_ranges": [
        "(line 742,col 9)-(line 742,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testTypeConversions()",
      "begin_line": 745,
      "end_line": 757,
      "comment": "",
      "child_ranges": [
        "(line 747,col 9)-(line 750,col 28)",
        "(line 753,col 9)-(line 756,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testBooleanFunction()",
      "begin_line": 759,
      "end_line": 774,
      "comment": "",
      "child_ranges": [
        "(line 760,col 9)-(line 763,col 26)",
        "(line 765,col 9)-(line 768,col 26)",
        "(line 770,col 9)-(line 773,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testFunctionsLastAndPosition()",
      "begin_line": 776,
      "end_line": 781,
      "comment": "",
      "child_ranges": [
        "(line 777,col 9)-(line 780,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testNamespaceMapping()",
      "begin_line": 783,
      "end_line": 830,
      "comment": "",
      "child_ranges": [
        "(line 784,col 9)-(line 784,col 53)",
        "(line 785,col 9)-(line 785,col 56)",
        "(line 787,col 9)-(line 789,col 50)",
        "(line 791,col 9)-(line 793,col 49)",
        "(line 796,col 9)-(line 798,col 31)",
        "(line 800,col 9)-(line 801,col 77)",
        "(line 802,col 9)-(line 803,col 78)",
        "(line 804,col 9)-(line 805,col 78)",
        "(line 806,col 9)-(line 807,col 79)",
        "(line 810,col 9)-(line 813,col 55)",
        "(line 816,col 9)-(line 817,col 72)",
        "(line 818,col 9)-(line 821,col 55)",
        "(line 824,col 9)-(line 825,col 70)",
        "(line 826,col 9)-(line 829,col 55)"
      ]
    }
  ]
}