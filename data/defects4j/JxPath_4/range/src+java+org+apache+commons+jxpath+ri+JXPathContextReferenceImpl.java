{
  "filepath": "/tmp/JxPath-4b/src/java/org/apache/commons/jxpath/ri/JXPathContextReferenceImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JXPathContextReferenceImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.JXPathContext"
      ],
      "begin_line": 64,
      "end_line": 729,
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
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.Anonymous-83ab819e-4163-40f0-a95f-66fd75964f2e.compare(java.lang.Object, java.lang.Object)",
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
      "end_line": 422,
      "comment": "",
      "child_ranges": [
        "(line 410,col 9)-(line 410,col 60)",
        "(line 411,col 9)-(line 413,col 9)",
        "(line 414,col 9)-(line 420,col 9)",
        "(line 421,col 9)-(line 421,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.setValue(java.lang.String, java.lang.Object)",
      "begin_line": 424,
      "end_line": 426,
      "comment": "",
      "child_ranges": [
        "(line 425,col 9)-(line 425,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.setValue(java.lang.String, org.apache.commons.jxpath.ri.compiler.Expression, java.lang.Object)",
      "begin_line": 428,
      "end_line": 436,
      "comment": "",
      "child_ranges": [
        "(line 429,col 9)-(line 435,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.createPath(java.lang.String)",
      "begin_line": 438,
      "end_line": 440,
      "comment": "",
      "child_ranges": [
        "(line 439,col 9)-(line 439,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.createPath(java.lang.String, org.apache.commons.jxpath.ri.compiler.Expression)",
      "begin_line": 442,
      "end_line": 466,
      "comment": "",
      "child_ranges": [
        "(line 443,col 9)-(line 465,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.createPathAndSetValue(java.lang.String, java.lang.Object)",
      "begin_line": 468,
      "end_line": 470,
      "comment": "",
      "child_ranges": [
        "(line 469,col 9)-(line 469,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.createPathAndSetValue(java.lang.String, org.apache.commons.jxpath.ri.compiler.Expression, java.lang.Object)",
      "begin_line": 472,
      "end_line": 485,
      "comment": "",
      "child_ranges": [
        "(line 477,col 9)-(line 484,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.setValue(java.lang.String, org.apache.commons.jxpath.ri.compiler.Expression, java.lang.Object, boolean)",
      "begin_line": 487,
      "end_line": 518,
      "comment": "",
      "child_ranges": [
        "(line 493,col 9)-(line 493,col 60)",
        "(line 494,col 9)-(line 494,col 31)",
        "(line 496,col 9)-(line 510,col 9)",
        "(line 511,col 9)-(line 516,col 9)",
        "(line 517,col 9)-(line 517,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.checkSimplePath(org.apache.commons.jxpath.ri.compiler.Expression)",
      "begin_line": 524,
      "end_line": 532,
      "comment": "\n     * Checks if the path follows the JXPath restrictions on the type\n     * of path that can be passed to create... methods.\n     ",
      "child_ranges": [
        "(line 525,col 9)-(line 531,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.iteratePointers(java.lang.String)",
      "begin_line": 540,
      "end_line": 542,
      "comment": "\n     * Traverses the xpath and returns an Iterator of Pointers.\n     * A Pointer provides easy access to a property.\n     * If the xpath matches no properties\n     * in the graph, the Iterator be empty, but not null.\n     ",
      "child_ranges": [
        "(line 541,col 9)-(line 541,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.iteratePointers(java.lang.String, org.apache.commons.jxpath.ri.compiler.Expression)",
      "begin_line": 544,
      "end_line": 546,
      "comment": "",
      "child_ranges": [
        "(line 545,col 9)-(line 545,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.removePath(java.lang.String)",
      "begin_line": 548,
      "end_line": 550,
      "comment": "",
      "child_ranges": [
        "(line 549,col 9)-(line 549,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.removePath(java.lang.String, org.apache.commons.jxpath.ri.compiler.Expression)",
      "begin_line": 552,
      "end_line": 564,
      "comment": "",
      "child_ranges": [
        "(line 553,col 9)-(line 563,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.removeAll(java.lang.String)",
      "begin_line": 566,
      "end_line": 568,
      "comment": "",
      "child_ranges": [
        "(line 567,col 9)-(line 567,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.removeAll(java.lang.String, org.apache.commons.jxpath.ri.compiler.Expression)",
      "begin_line": 570,
      "end_line": 592,
      "comment": "",
      "child_ranges": [
        "(line 571,col 9)-(line 591,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getRelativeContext(org.apache.commons.jxpath.Pointer)",
      "begin_line": 594,
      "end_line": 602,
      "comment": "",
      "child_ranges": [
        "(line 595,col 9)-(line 595,col 47)",
        "(line 596,col 9)-(line 600,col 9)",
        "(line 601,col 9)-(line 601,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getContextPointer()",
      "begin_line": 604,
      "end_line": 606,
      "comment": "",
      "child_ranges": [
        "(line 605,col 9)-(line 605,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getAbsoluteRootPointer()",
      "begin_line": 608,
      "end_line": 610,
      "comment": "",
      "child_ranges": [
        "(line 609,col 9)-(line 609,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getEvalContext()",
      "begin_line": 612,
      "end_line": 615,
      "comment": "",
      "child_ranges": [
        "(line 613,col 9)-(line 614,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getAbsoluteRootContext()",
      "begin_line": 617,
      "end_line": 620,
      "comment": "",
      "child_ranges": [
        "(line 618,col 9)-(line 619,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getVariablePointer(org.apache.commons.jxpath.ri.QName)",
      "begin_line": 622,
      "end_line": 643,
      "comment": "",
      "child_ranges": [
        "(line 623,col 9)-(line 623,col 41)",
        "(line 624,col 9)-(line 624,col 36)",
        "(line 625,col 9)-(line 625,col 30)",
        "(line 626,col 9)-(line 633,col 9)",
        "(line 634,col 9)-(line 642,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getFunction(org.apache.commons.jxpath.ri.QName, java.lang.Object[])",
      "begin_line": 645,
      "end_line": 663,
      "comment": "",
      "child_ranges": [
        "(line 646,col 9)-(line 646,col 52)",
        "(line 647,col 9)-(line 647,col 45)",
        "(line 648,col 9)-(line 648,col 37)",
        "(line 649,col 9)-(line 649,col 29)",
        "(line 650,col 9)-(line 650,col 24)",
        "(line 651,col 9)-(line 660,col 9)",
        "(line 661,col 9)-(line 662,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.registerNamespace(java.lang.String, java.lang.String)",
      "begin_line": 665,
      "end_line": 670,
      "comment": "",
      "child_ranges": [
        "(line 666,col 9)-(line 668,col 9)",
        "(line 669,col 9)-(line 669,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getNamespaceURI(java.lang.String)",
      "begin_line": 672,
      "end_line": 674,
      "comment": "",
      "child_ranges": [
        "(line 673,col 9)-(line 673,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.setNamespaceContextPointer(org.apache.commons.jxpath.Pointer)",
      "begin_line": 676,
      "end_line": 681,
      "comment": "",
      "child_ranges": [
        "(line 677,col 9)-(line 679,col 9)",
        "(line 680,col 9)-(line 680,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getNamespaceContextPointer()",
      "begin_line": 683,
      "end_line": 685,
      "comment": "",
      "child_ranges": [
        "(line 684,col 9)-(line 684,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getNamespaceResolver()",
      "begin_line": 687,
      "end_line": 691,
      "comment": "",
      "child_ranges": [
        "(line 688,col 9)-(line 688,col 33)",
        "(line 689,col 9)-(line 689,col 80)",
        "(line 690,col 9)-(line 690,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getDefaultNamespaceURI()",
      "begin_line": 693,
      "end_line": 701,
      "comment": "",
      "child_ranges": [
        "(line 694,col 9)-(line 696,col 9)",
        "(line 697,col 9)-(line 699,col 9)",
        "(line 700,col 9)-(line 700,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.registerDefaultNamespace(java.lang.String)",
      "begin_line": 703,
      "end_line": 705,
      "comment": "",
      "child_ranges": [
        "(line 704,col 9)-(line 704,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.allocateConditionally(java.lang.String, java.lang.String)",
      "begin_line": 711,
      "end_line": 728,
      "comment": "\n     * Checks if existenceCheckClass exists on the class path. If so, allocates\n     * an instance of the specified class, otherwise returns null.\n     ",
      "child_ranges": [
        "(line 715,col 9)-(line 727,col 9)"
      ]
    }
  ]
}