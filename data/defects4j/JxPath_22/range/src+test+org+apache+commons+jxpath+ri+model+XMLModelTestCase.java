{
  "filepath": "/tmp/JxPath-22b/src/test/org/apache/commons/jxpath/ri/model/XMLModelTestCase.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "XMLModelTestCase",
      "is_interface": false,
      "parent_types": [
        "JXPathTestCase"
      ],
      "begin_line": 37,
      "end_line": 856,
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
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.setUp()",
      "begin_line": 40,
      "end_line": 49,
      "comment": "",
      "child_ranges": [
        "(line 41,col 9)-(line 48,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.getModel()",
      "begin_line": 51,
      "end_line": 51,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.createDocumentContainer()",
      "begin_line": 53,
      "end_line": 57,
      "comment": "",
      "child_ranges": [
        "(line 54,col 9)-(line 56,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.getAbstractFactory()",
      "begin_line": 59,
      "end_line": 59,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.createContext()",
      "begin_line": 61,
      "end_line": 67,
      "comment": "",
      "child_ranges": [
        "(line 62,col 9)-(line 63,col 64)",
        "(line 64,col 9)-(line 64,col 49)",
        "(line 65,col 9)-(line 65,col 58)",
        "(line 66,col 9)-(line 66,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.getXMLSignature(java.lang.Object, boolean, boolean, boolean, boolean)",
      "begin_line": 74,
      "end_line": 79,
      "comment": "\n     * An XML signature is used to determine if we have the right result\n     * after a modification of XML by JXPath.  It is basically a piece\n     * of simplified XML.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.assertXMLSignature(org.apache.commons.jxpath.JXPathContext, java.lang.String, java.lang.String, boolean, boolean, boolean, boolean)",
      "begin_line": 81,
      "end_line": 93,
      "comment": "",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 57)",
        "(line 91,col 9)-(line 91,col 75)",
        "(line 92,col 9)-(line 92,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testDocumentOrder()",
      "begin_line": 97,
      "end_line": 115,
      "comment": "",
      "child_ranges": [
        "(line 98,col 9)-(line 102,col 16)",
        "(line 104,col 9)-(line 108,col 16)",
        "(line 110,col 9)-(line 114,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testSetValue()",
      "begin_line": 118,
      "end_line": 146,
      "comment": "",
      "child_ranges": [
        "(line 119,col 9)-(line 122,col 24)",
        "(line 124,col 9)-(line 131,col 19)",
        "(line 133,col 9)-(line 136,col 32)",
        "(line 138,col 9)-(line 145,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testCreatePath()",
      "begin_line": 151,
      "end_line": 193,
      "comment": "\n     * Test JXPathContext.createPath() with various arguments\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 157,col 38)",
        "(line 160,col 9)-(line 164,col 59)",
        "(line 167,col 9)-(line 171,col 47)",
        "(line 173,col 9)-(line 177,col 44)",
        "(line 179,col 10)-(line 183,col 47)",
        "(line 185,col 10)-(line 185,col 55)",
        "(line 188,col 10)-(line 192,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testCreatePathAndSetValue()",
      "begin_line": 198,
      "end_line": 246,
      "comment": "\n     * Test JXPath.createPathAndSetValue() with various arguments\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 204,col 38)",
        "(line 207,col 9)-(line 211,col 59)",
        "(line 214,col 9)-(line 218,col 47)",
        "(line 220,col 9)-(line 224,col 47)",
        "(line 226,col 9)-(line 230,col 47)",
        "(line 232,col 9)-(line 236,col 69)",
        "(line 238,col 9)-(line 238,col 54)",
        "(line 241,col 9)-(line 245,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testRemovePath()",
      "begin_line": 251,
      "end_line": 270,
      "comment": "\n     * Test JXPathContext.removePath() with various arguments\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 74)",
        "(line 254,col 9)-(line 257,col 70)",
        "(line 259,col 9)-(line 259,col 67)",
        "(line 260,col 9)-(line 263,col 77)",
        "(line 265,col 9)-(line 265,col 65)",
        "(line 266,col 9)-(line 269,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testID()",
      "begin_line": 272,
      "end_line": 291,
      "comment": "",
      "child_ranges": [
        "(line 273,col 9)-(line 279,col 11)",
        "(line 281,col 9)-(line 285,col 46)",
        "(line 287,col 9)-(line 290,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.Anonymous-1970146e-e21a-4026-99de-1294273e5c4d.getPointerByID(org.apache.commons.jxpath.JXPathContext, java.lang.String)",
      "begin_line": 274,
      "end_line": 278,
      "comment": "",
      "child_ranges": [
        "(line 275,col 17)-(line 275,col 72)",
        "(line 276,col 17)-(line 276,col 44)",
        "(line 277,col 17)-(line 277,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testAxisChild()",
      "begin_line": 293,
      "end_line": 372,
      "comment": "",
      "child_ranges": [
        "(line 294,col 9)-(line 297,col 28)",
        "(line 300,col 9)-(line 303,col 28)",
        "(line 306,col 9)-(line 309,col 22)",
        "(line 312,col 9)-(line 312,col 77)",
        "(line 315,col 9)-(line 318,col 28)",
        "(line 321,col 9)-(line 324,col 24)",
        "(line 327,col 9)-(line 330,col 23)",
        "(line 333,col 9)-(line 333,col 67)",
        "(line 335,col 9)-(line 335,col 73)",
        "(line 337,col 9)-(line 337,col 28)",
        "(line 338,col 9)-(line 344,col 9)",
        "(line 345,col 9)-(line 345,col 71)",
        "(line 347,col 9)-(line 347,col 20)",
        "(line 348,col 9)-(line 354,col 9)",
        "(line 355,col 9)-(line 355,col 74)",
        "(line 358,col 9)-(line 361,col 27)",
        "(line 364,col 9)-(line 364,col 76)",
        "(line 367,col 9)-(line 367,col 74)",
        "(line 370,col 9)-(line 370,col 47)",
        "(line 371,col 9)-(line 371,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testAxisChildIndexPredicate()",
      "begin_line": 374,
      "end_line": 379,
      "comment": "",
      "child_ranges": [
        "(line 375,col 9)-(line 378,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testAxisDescendant()",
      "begin_line": 381,
      "end_line": 401,
      "comment": "",
      "child_ranges": [
        "(line 383,col 9)-(line 383,col 62)",
        "(line 386,col 9)-(line 386,col 69)",
        "(line 388,col 9)-(line 388,col 77)",
        "(line 390,col 9)-(line 390,col 73)",
        "(line 392,col 9)-(line 395,col 27)",
        "(line 397,col 9)-(line 400,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testAxisParent()",
      "begin_line": 410,
      "end_line": 430,
      "comment": "",
      "child_ranges": [
        "(line 412,col 9)-(line 415,col 49)",
        "(line 418,col 9)-(line 423,col 54)",
        "(line 426,col 9)-(line 429,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testAxisFollowingSibling()",
      "begin_line": 432,
      "end_line": 446,
      "comment": "",
      "child_ranges": [
        "(line 434,col 9)-(line 438,col 31)",
        "(line 441,col 9)-(line 445,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testAxisPrecedingSibling()",
      "begin_line": 448,
      "end_line": 454,
      "comment": "",
      "child_ranges": [
        "(line 450,col 9)-(line 453,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testAxisPreceding()",
      "begin_line": 456,
      "end_line": 465,
      "comment": "",
      "child_ranges": [
        "(line 458,col 9)-(line 461,col 55)",
        "(line 462,col 9)-(line 462,col 112)",
        "(line 463,col 9)-(line 463,col 127)",
        "(line 464,col 9)-(line 464,col 117)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testAxisAttribute()",
      "begin_line": 467,
      "end_line": 582,
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
        "(line 544,col 9)-(line 548,col 35)",
        "(line 551,col 9)-(line 555,col 35)",
        "(line 558,col 9)-(line 561,col 25)",
        "(line 564,col 9)-(line 564,col 66)",
        "(line 567,col 9)-(line 567,col 75)",
        "(line 570,col 9)-(line 570,col 80)",
        "(line 573,col 9)-(line 576,col 31)",
        "(line 578,col 9)-(line 581,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testAxisNamespace()",
      "begin_line": 584,
      "end_line": 609,
      "comment": "",
      "child_ranges": [
        "(line 586,col 9)-(line 590,col 62)",
        "(line 593,col 9)-(line 596,col 27)",
        "(line 599,col 9)-(line 602,col 21)",
        "(line 605,col 9)-(line 608,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testAxisAncestor()",
      "begin_line": 611,
      "end_line": 625,
      "comment": "",
      "child_ranges": [
        "(line 613,col 9)-(line 617,col 21)",
        "(line 620,col 9)-(line 624,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testAxisAncestorOrSelf()",
      "begin_line": 627,
      "end_line": 634,
      "comment": "",
      "child_ranges": [
        "(line 629,col 9)-(line 633,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testAxisFollowing()",
      "begin_line": 636,
      "end_line": 648,
      "comment": "",
      "child_ranges": [
        "(line 637,col 9)-(line 640,col 53)",
        "(line 643,col 9)-(line 646,col 21)",
        "(line 647,col 9)-(line 647,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testAxisSelf()",
      "begin_line": 650,
      "end_line": 659,
      "comment": "",
      "child_ranges": [
        "(line 652,col 9)-(line 655,col 21)",
        "(line 658,col 9)-(line 658,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testNodeTypeComment()",
      "begin_line": 661,
      "end_line": 667,
      "comment": "",
      "child_ranges": [
        "(line 663,col 9)-(line 666,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testNodeTypeText()",
      "begin_line": 669,
      "end_line": 683,
      "comment": "",
      "child_ranges": [
        "(line 672,col 9)-(line 675,col 37)",
        "(line 678,col 9)-(line 681,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testNodeTypeProcessingInstruction()",
      "begin_line": 685,
      "end_line": 709,
      "comment": "",
      "child_ranges": [
        "(line 687,col 9)-(line 690,col 35)",
        "(line 693,col 9)-(line 696,col 28)",
        "(line 699,col 9)-(line 702,col 73)",
        "(line 705,col 9)-(line 708,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testLang()",
      "begin_line": 711,
      "end_line": 723,
      "comment": "",
      "child_ranges": [
        "(line 713,col 9)-(line 713,col 68)",
        "(line 716,col 9)-(line 716,col 74)",
        "(line 719,col 9)-(line 722,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testDocument()",
      "begin_line": 725,
      "end_line": 737,
      "comment": "",
      "child_ranges": [
        "(line 726,col 9)-(line 729,col 28)",
        "(line 731,col 9)-(line 734,col 68)",
        "(line 736,col 9)-(line 736,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testContainer()",
      "begin_line": 739,
      "end_line": 754,
      "comment": "",
      "child_ranges": [
        "(line 740,col 9)-(line 740,col 79)",
        "(line 742,col 9)-(line 742,col 72)",
        "(line 744,col 9)-(line 747,col 69)",
        "(line 750,col 9)-(line 753,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testElementInVariable()",
      "begin_line": 756,
      "end_line": 758,
      "comment": "",
      "child_ranges": [
        "(line 757,col 9)-(line 757,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testTypeConversions()",
      "begin_line": 760,
      "end_line": 772,
      "comment": "",
      "child_ranges": [
        "(line 762,col 9)-(line 765,col 28)",
        "(line 768,col 9)-(line 771,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testBooleanFunction()",
      "begin_line": 774,
      "end_line": 789,
      "comment": "",
      "child_ranges": [
        "(line 775,col 9)-(line 778,col 26)",
        "(line 780,col 9)-(line 783,col 26)",
        "(line 785,col 9)-(line 788,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testFunctionsLastAndPosition()",
      "begin_line": 791,
      "end_line": 796,
      "comment": "",
      "child_ranges": [
        "(line 792,col 9)-(line 795,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testNamespaceMapping()",
      "begin_line": 798,
      "end_line": 845,
      "comment": "",
      "child_ranges": [
        "(line 799,col 9)-(line 799,col 53)",
        "(line 800,col 9)-(line 800,col 56)",
        "(line 802,col 9)-(line 804,col 50)",
        "(line 806,col 9)-(line 808,col 49)",
        "(line 811,col 9)-(line 813,col 31)",
        "(line 815,col 9)-(line 816,col 77)",
        "(line 817,col 9)-(line 818,col 78)",
        "(line 819,col 9)-(line 820,col 78)",
        "(line 821,col 9)-(line 822,col 79)",
        "(line 825,col 9)-(line 828,col 55)",
        "(line 831,col 9)-(line 832,col 72)",
        "(line 833,col 9)-(line 836,col 55)",
        "(line 839,col 9)-(line 840,col 70)",
        "(line 841,col 9)-(line 844,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testUnion()",
      "begin_line": 847,
      "end_line": 850,
      "comment": "",
      "child_ranges": [
        "(line 848,col 9)-(line 848,col 91)",
        "(line 849,col 9)-(line 849,col 91)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.XMLModelTestCase.testNodes()",
      "begin_line": 852,
      "end_line": 855,
      "comment": "",
      "child_ranges": [
        "(line 853,col 9)-(line 853,col 70)",
        "(line 854,col 9)-(line 854,col 66)"
      ]
    }
  ]
}