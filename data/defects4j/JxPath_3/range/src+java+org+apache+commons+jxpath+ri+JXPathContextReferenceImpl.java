{
  "filepath": "/tmp/JxPath-3b/src/java/org/apache/commons/jxpath/ri/JXPathContextReferenceImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JXPathContextReferenceImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.JXPathContext"
      ],
      "begin_line": 64,
      "end_line": 734,
      "comment": "\n * The reference implementation of JXPathContext.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "USE_SOFT_CACHE"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": "\n     * Change this to \u003ccode\u003efalse\u003c/code\u003e to disable soft caching of \n     * CompiledExpressions. \n     "
    },
    {
      "type": "field",
      "varNames": [
        "COMPILER"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compiled"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cleanupCount"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nodeFactories"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nodeFactoryArray"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "rootPointer"
      ],
      "begin_line": 113,
      "end_line": 113,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "contextPointer"
      ],
      "begin_line": 114,
      "end_line": 114,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "namespaceResolver"
      ],
      "begin_line": 116,
      "end_line": 116,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "defaultNamespaceURI"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CLEANUP_THRESHOLD"
      ],
      "begin_line": 120,
      "end_line": 120,
      "comment": " The frequency of the cache cleanup"
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.JXPathContextReferenceImpl(org.apache.commons.jxpath.JXPathContext, java.lang.Object)",
      "begin_line": 122,
      "end_line": 126,
      "comment": "",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 47)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.JXPathContextReferenceImpl(org.apache.commons.jxpath.JXPathContext, java.lang.Object, org.apache.commons.jxpath.Pointer)",
      "begin_line": 128,
      "end_line": 163,
      "comment": "",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 42)",
        "(line 135,col 9)-(line 137,col 9)",
        "(line 139,col 9)-(line 154,col 9)",
        "(line 156,col 9)-(line 156,col 42)",
        "(line 157,col 9)-(line 159,col 9)",
        "(line 160,col 9)-(line 160,col 60)",
        "(line 161,col 9)-(line 162,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.createNodeFactoryArray()",
      "begin_line": 165,
      "end_line": 178,
      "comment": "",
      "child_ranges": [
        "(line 166,col 9)-(line 177,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.Anonymous-3ee91149-fcca-46ad-b8fe-46aa53e63ede.compare(java.lang.Object, java.lang.Object)",
      "begin_line": 171,
      "end_line": 175,
      "comment": "",
      "child_ranges": [
        "(line 172,col 21)-(line 172,col 69)",
        "(line 173,col 21)-(line 173,col 69)",
        "(line 174,col 21)-(line 174,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.addNodePointerFactory(org.apache.commons.jxpath.ri.model.NodePointerFactory)",
      "begin_line": 185,
      "end_line": 190,
      "comment": "\n     * Call this with a custom NodePointerFactory to add support for\n     * additional types of objects.  Make sure the factory returns\n     * a name that puts it in the right position on the list of factories.\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 189,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getNodePointerFactories()",
      "begin_line": 192,
      "end_line": 194,
      "comment": "",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getCompiler()",
      "begin_line": 201,
      "end_line": 203,
      "comment": "\n     * Returns a static instance of TreeCompiler.\n     * \n     * Override this to return an aternate compiler.\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.compilePath(java.lang.String)",
      "begin_line": 205,
      "end_line": 207,
      "comment": "",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.compileExpression(java.lang.String)",
      "begin_line": 209,
      "end_line": 251,
      "comment": "",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 24)",
        "(line 212,col 9)-(line 223,col 9)",
        "(line 225,col 9)-(line 227,col 9)",
        "(line 229,col 9)-(line 229,col 73)",
        "(line 231,col 9)-(line 248,col 9)",
        "(line 250,col 9)-(line 250,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getValue(java.lang.String)",
      "begin_line": 257,
      "end_line": 292,
      "comment": "\n     * Traverses the xpath and returns the resulting object. Primitive\n     * types are wrapped into objects.\n     ",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 57)",
        "(line 291,col 9)-(line 291,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getValue(java.lang.String, org.apache.commons.jxpath.ri.compiler.Expression)",
      "begin_line": 324,
      "end_line": 364,
      "comment": "",
      "child_ranges": [
        "(line 325,col 9)-(line 325,col 60)",
        "(line 326,col 9)-(line 334,col 9)",
        "(line 335,col 9)-(line 342,col 9)",
        "(line 343,col 9)-(line 362,col 9)",
        "(line 363,col 9)-(line 363,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getValue(java.lang.String, java.lang.Class)",
      "begin_line": 370,
      "end_line": 373,
      "comment": "\n     * Calls getValue(xpath), converts the result to the required type\n     * and returns the result of the conversion.\n     ",
      "child_ranges": [
        "(line 371,col 9)-(line 371,col 51)",
        "(line 372,col 9)-(line 372,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getValue(java.lang.String, org.apache.commons.jxpath.ri.compiler.Expression, java.lang.Class)",
      "begin_line": 375,
      "end_line": 390,
      "comment": "",
      "child_ranges": [
        "(line 376,col 9)-(line 376,col 45)",
        "(line 377,col 9)-(line 388,col 9)",
        "(line 389,col 9)-(line 389,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.iterate(java.lang.String)",
      "begin_line": 397,
      "end_line": 399,
      "comment": "\n     * Traverses the xpath and returns a Iterator of all results found\n     * for the path. If the xpath matches no properties\n     * in the graph, the Iterator will not be null.\n     ",
      "child_ranges": [
        "(line 398,col 9)-(line 398,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.iterate(java.lang.String, org.apache.commons.jxpath.ri.compiler.Expression)",
      "begin_line": 401,
      "end_line": 403,
      "comment": "",
      "child_ranges": [
        "(line 402,col 9)-(line 402,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getPointer(java.lang.String)",
      "begin_line": 405,
      "end_line": 407,
      "comment": "",
      "child_ranges": [
        "(line 406,col 9)-(line 406,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getPointer(java.lang.String, org.apache.commons.jxpath.ri.compiler.Expression)",
      "begin_line": 409,
      "end_line": 424,
      "comment": "",
      "child_ranges": [
        "(line 410,col 9)-(line 410,col 60)",
        "(line 411,col 9)-(line 413,col 9)",
        "(line 414,col 9)-(line 423,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.setValue(java.lang.String, java.lang.Object)",
      "begin_line": 426,
      "end_line": 428,
      "comment": "",
      "child_ranges": [
        "(line 427,col 9)-(line 427,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.setValue(java.lang.String, org.apache.commons.jxpath.ri.compiler.Expression, java.lang.Object)",
      "begin_line": 431,
      "end_line": 439,
      "comment": "",
      "child_ranges": [
        "(line 432,col 9)-(line 438,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.createPath(java.lang.String)",
      "begin_line": 441,
      "end_line": 443,
      "comment": "",
      "child_ranges": [
        "(line 442,col 9)-(line 442,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.createPath(java.lang.String, org.apache.commons.jxpath.ri.compiler.Expression)",
      "begin_line": 445,
      "end_line": 469,
      "comment": "",
      "child_ranges": [
        "(line 446,col 9)-(line 468,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.createPathAndSetValue(java.lang.String, java.lang.Object)",
      "begin_line": 471,
      "end_line": 473,
      "comment": "",
      "child_ranges": [
        "(line 472,col 9)-(line 472,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.createPathAndSetValue(java.lang.String, org.apache.commons.jxpath.ri.compiler.Expression, java.lang.Object)",
      "begin_line": 475,
      "end_line": 488,
      "comment": "",
      "child_ranges": [
        "(line 480,col 9)-(line 487,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.setValue(java.lang.String, org.apache.commons.jxpath.ri.compiler.Expression, java.lang.Object, boolean)",
      "begin_line": 490,
      "end_line": 521,
      "comment": "",
      "child_ranges": [
        "(line 496,col 9)-(line 496,col 60)",
        "(line 497,col 9)-(line 497,col 31)",
        "(line 499,col 9)-(line 513,col 9)",
        "(line 514,col 9)-(line 519,col 9)",
        "(line 520,col 9)-(line 520,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.checkSimplePath(org.apache.commons.jxpath.ri.compiler.Expression)",
      "begin_line": 527,
      "end_line": 535,
      "comment": "\n     * Checks if the path follows the JXPath restrictions on the type\n     * of path that can be passed to create... methods.\n     ",
      "child_ranges": [
        "(line 528,col 9)-(line 534,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.iteratePointers(java.lang.String)",
      "begin_line": 543,
      "end_line": 545,
      "comment": "\n     * Traverses the xpath and returns an Iterator of Pointers.\n     * A Pointer provides easy access to a property.\n     * If the xpath matches no properties\n     * in the graph, the Iterator be empty, but not null.\n     ",
      "child_ranges": [
        "(line 544,col 9)-(line 544,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.iteratePointers(java.lang.String, org.apache.commons.jxpath.ri.compiler.Expression)",
      "begin_line": 547,
      "end_line": 549,
      "comment": "",
      "child_ranges": [
        "(line 548,col 9)-(line 548,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.removePath(java.lang.String)",
      "begin_line": 551,
      "end_line": 553,
      "comment": "",
      "child_ranges": [
        "(line 552,col 9)-(line 552,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.removePath(java.lang.String, org.apache.commons.jxpath.ri.compiler.Expression)",
      "begin_line": 555,
      "end_line": 567,
      "comment": "",
      "child_ranges": [
        "(line 556,col 9)-(line 566,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.removeAll(java.lang.String)",
      "begin_line": 569,
      "end_line": 571,
      "comment": "",
      "child_ranges": [
        "(line 570,col 9)-(line 570,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.removeAll(java.lang.String, org.apache.commons.jxpath.ri.compiler.Expression)",
      "begin_line": 573,
      "end_line": 595,
      "comment": "",
      "child_ranges": [
        "(line 574,col 9)-(line 594,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getRelativeContext(org.apache.commons.jxpath.Pointer)",
      "begin_line": 597,
      "end_line": 605,
      "comment": "",
      "child_ranges": [
        "(line 598,col 9)-(line 598,col 47)",
        "(line 599,col 9)-(line 603,col 9)",
        "(line 604,col 9)-(line 604,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getContextPointer()",
      "begin_line": 607,
      "end_line": 609,
      "comment": "",
      "child_ranges": [
        "(line 608,col 9)-(line 608,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getAbsoluteRootPointer()",
      "begin_line": 611,
      "end_line": 613,
      "comment": "",
      "child_ranges": [
        "(line 612,col 9)-(line 612,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getEvalContext()",
      "begin_line": 615,
      "end_line": 618,
      "comment": "",
      "child_ranges": [
        "(line 616,col 9)-(line 617,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getAbsoluteRootContext()",
      "begin_line": 620,
      "end_line": 623,
      "comment": "",
      "child_ranges": [
        "(line 621,col 9)-(line 622,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getVariablePointer(org.apache.commons.jxpath.ri.QName)",
      "begin_line": 625,
      "end_line": 646,
      "comment": "",
      "child_ranges": [
        "(line 626,col 9)-(line 626,col 41)",
        "(line 627,col 9)-(line 627,col 36)",
        "(line 628,col 9)-(line 628,col 30)",
        "(line 629,col 9)-(line 636,col 9)",
        "(line 637,col 9)-(line 645,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getFunction(org.apache.commons.jxpath.ri.QName, java.lang.Object[])",
      "begin_line": 648,
      "end_line": 666,
      "comment": "",
      "child_ranges": [
        "(line 649,col 9)-(line 649,col 52)",
        "(line 650,col 9)-(line 650,col 45)",
        "(line 651,col 9)-(line 651,col 37)",
        "(line 652,col 9)-(line 652,col 29)",
        "(line 653,col 9)-(line 653,col 24)",
        "(line 654,col 9)-(line 663,col 9)",
        "(line 664,col 9)-(line 665,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.registerNamespace(java.lang.String, java.lang.String)",
      "begin_line": 668,
      "end_line": 673,
      "comment": "",
      "child_ranges": [
        "(line 669,col 9)-(line 671,col 9)",
        "(line 672,col 9)-(line 672,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getNamespaceURI(java.lang.String)",
      "begin_line": 675,
      "end_line": 677,
      "comment": "",
      "child_ranges": [
        "(line 676,col 9)-(line 676,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.setNamespaceContextPointer(org.apache.commons.jxpath.Pointer)",
      "begin_line": 679,
      "end_line": 684,
      "comment": "",
      "child_ranges": [
        "(line 680,col 9)-(line 682,col 9)",
        "(line 683,col 9)-(line 683,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getNamespaceContextPointer()",
      "begin_line": 686,
      "end_line": 688,
      "comment": "",
      "child_ranges": [
        "(line 687,col 9)-(line 687,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getNamespaceResolver()",
      "begin_line": 690,
      "end_line": 694,
      "comment": "",
      "child_ranges": [
        "(line 691,col 9)-(line 691,col 33)",
        "(line 692,col 9)-(line 692,col 80)",
        "(line 693,col 9)-(line 693,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getDefaultNamespaceURI()",
      "begin_line": 696,
      "end_line": 705,
      "comment": "",
      "child_ranges": [
        "(line 697,col 9)-(line 699,col 9)",
        "(line 700,col 9)-(line 702,col 9)",
        "(line 704,col 9)-(line 704,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.registerDefaultNamespace(java.lang.String)",
      "begin_line": 707,
      "end_line": 709,
      "comment": "",
      "child_ranges": [
        "(line 708,col 9)-(line 708,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.allocateConditionally(java.lang.String, java.lang.String)",
      "begin_line": 715,
      "end_line": 733,
      "comment": "\n     * Checks if existenceCheckClass exists on the class path. If so, allocates\n     * an instance of the specified class, otherwise returns null.\n     ",
      "child_ranges": [
        "(line 719,col 9)-(line 732,col 9)"
      ]
    }
  ]
}