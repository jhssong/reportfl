{
  "filepath": "/tmp/JxPath-7b/src/java/org/apache/commons/jxpath/ri/JXPathContextReferenceImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JXPathContextReferenceImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.JXPathContext"
      ],
      "begin_line": 64,
      "end_line": 721,
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
        "CLEANUP_THRESHOLD"
      ],
      "begin_line": 119,
      "end_line": 119,
      "comment": " The frequency of the cache cleanup"
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.JXPathContextReferenceImpl(org.apache.commons.jxpath.JXPathContext, java.lang.Object)",
      "begin_line": 121,
      "end_line": 125,
      "comment": "",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 47)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.JXPathContextReferenceImpl(org.apache.commons.jxpath.JXPathContext, java.lang.Object, org.apache.commons.jxpath.Pointer)",
      "begin_line": 127,
      "end_line": 162,
      "comment": "",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 42)",
        "(line 134,col 9)-(line 136,col 9)",
        "(line 138,col 9)-(line 153,col 9)",
        "(line 155,col 9)-(line 155,col 42)",
        "(line 156,col 9)-(line 158,col 9)",
        "(line 159,col 9)-(line 159,col 60)",
        "(line 160,col 9)-(line 161,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.createNodeFactoryArray()",
      "begin_line": 164,
      "end_line": 177,
      "comment": "",
      "child_ranges": [
        "(line 165,col 9)-(line 176,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.Anonymous-781b9d06-a0be-4180-afb6-08a59c00b2c3.compare(java.lang.Object, java.lang.Object)",
      "begin_line": 170,
      "end_line": 174,
      "comment": "",
      "child_ranges": [
        "(line 171,col 21)-(line 171,col 69)",
        "(line 172,col 21)-(line 172,col 69)",
        "(line 173,col 21)-(line 173,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.addNodePointerFactory(org.apache.commons.jxpath.ri.model.NodePointerFactory)",
      "begin_line": 184,
      "end_line": 189,
      "comment": "\n     * Call this with a custom NodePointerFactory to add support for\n     * additional types of objects.  Make sure the factory returns\n     * a name that puts it in the right position on the list of factories.\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 188,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getNodePointerFactories()",
      "begin_line": 191,
      "end_line": 193,
      "comment": "",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getCompiler()",
      "begin_line": 200,
      "end_line": 202,
      "comment": "\n     * Returns a static instance of TreeCompiler.\n     * \n     * Override this to return an aternate compiler.\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.compilePath(java.lang.String)",
      "begin_line": 204,
      "end_line": 206,
      "comment": "",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.compileExpression(java.lang.String)",
      "begin_line": 208,
      "end_line": 250,
      "comment": "",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 24)",
        "(line 211,col 9)-(line 222,col 9)",
        "(line 224,col 9)-(line 226,col 9)",
        "(line 228,col 9)-(line 228,col 73)",
        "(line 230,col 9)-(line 247,col 9)",
        "(line 249,col 9)-(line 249,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getValue(java.lang.String)",
      "begin_line": 256,
      "end_line": 291,
      "comment": "\n     * Traverses the xpath and returns the resulting object. Primitive\n     * types are wrapped into objects.\n     ",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 57)",
        "(line 290,col 9)-(line 290,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getValue(java.lang.String, org.apache.commons.jxpath.ri.compiler.Expression)",
      "begin_line": 323,
      "end_line": 363,
      "comment": "",
      "child_ranges": [
        "(line 324,col 9)-(line 324,col 60)",
        "(line 325,col 9)-(line 333,col 9)",
        "(line 334,col 9)-(line 341,col 9)",
        "(line 342,col 9)-(line 361,col 9)",
        "(line 362,col 9)-(line 362,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getValue(java.lang.String, java.lang.Class)",
      "begin_line": 369,
      "end_line": 372,
      "comment": "\n     * Calls getValue(xpath), converts the result to the required type\n     * and returns the result of the conversion.\n     ",
      "child_ranges": [
        "(line 370,col 9)-(line 370,col 51)",
        "(line 371,col 9)-(line 371,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getValue(java.lang.String, org.apache.commons.jxpath.ri.compiler.Expression, java.lang.Class)",
      "begin_line": 374,
      "end_line": 389,
      "comment": "",
      "child_ranges": [
        "(line 375,col 9)-(line 375,col 45)",
        "(line 376,col 9)-(line 387,col 9)",
        "(line 388,col 9)-(line 388,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.iterate(java.lang.String)",
      "begin_line": 396,
      "end_line": 398,
      "comment": "\n     * Traverses the xpath and returns a Iterator of all results found\n     * for the path. If the xpath matches no properties\n     * in the graph, the Iterator will not be null.\n     ",
      "child_ranges": [
        "(line 397,col 9)-(line 397,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.iterate(java.lang.String, org.apache.commons.jxpath.ri.compiler.Expression)",
      "begin_line": 400,
      "end_line": 402,
      "comment": "",
      "child_ranges": [
        "(line 401,col 9)-(line 401,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getPointer(java.lang.String)",
      "begin_line": 404,
      "end_line": 406,
      "comment": "",
      "child_ranges": [
        "(line 405,col 9)-(line 405,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getPointer(java.lang.String, org.apache.commons.jxpath.ri.compiler.Expression)",
      "begin_line": 408,
      "end_line": 421,
      "comment": "",
      "child_ranges": [
        "(line 409,col 9)-(line 409,col 60)",
        "(line 410,col 9)-(line 412,col 9)",
        "(line 413,col 9)-(line 419,col 9)",
        "(line 420,col 9)-(line 420,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.setValue(java.lang.String, java.lang.Object)",
      "begin_line": 423,
      "end_line": 425,
      "comment": "",
      "child_ranges": [
        "(line 424,col 9)-(line 424,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.setValue(java.lang.String, org.apache.commons.jxpath.ri.compiler.Expression, java.lang.Object)",
      "begin_line": 427,
      "end_line": 435,
      "comment": "",
      "child_ranges": [
        "(line 428,col 9)-(line 434,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.createPath(java.lang.String)",
      "begin_line": 437,
      "end_line": 439,
      "comment": "",
      "child_ranges": [
        "(line 438,col 9)-(line 438,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.createPath(java.lang.String, org.apache.commons.jxpath.ri.compiler.Expression)",
      "begin_line": 441,
      "end_line": 465,
      "comment": "",
      "child_ranges": [
        "(line 442,col 9)-(line 464,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.createPathAndSetValue(java.lang.String, java.lang.Object)",
      "begin_line": 467,
      "end_line": 469,
      "comment": "",
      "child_ranges": [
        "(line 468,col 9)-(line 468,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.createPathAndSetValue(java.lang.String, org.apache.commons.jxpath.ri.compiler.Expression, java.lang.Object)",
      "begin_line": 471,
      "end_line": 484,
      "comment": "",
      "child_ranges": [
        "(line 476,col 9)-(line 483,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.setValue(java.lang.String, org.apache.commons.jxpath.ri.compiler.Expression, java.lang.Object, boolean)",
      "begin_line": 486,
      "end_line": 517,
      "comment": "",
      "child_ranges": [
        "(line 492,col 9)-(line 492,col 60)",
        "(line 493,col 9)-(line 493,col 31)",
        "(line 495,col 9)-(line 509,col 9)",
        "(line 510,col 9)-(line 515,col 9)",
        "(line 516,col 9)-(line 516,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.checkSimplePath(org.apache.commons.jxpath.ri.compiler.Expression)",
      "begin_line": 523,
      "end_line": 531,
      "comment": "\n     * Checks if the path follows the JXPath restrictions on the type\n     * of path that can be passed to create... methods.\n     ",
      "child_ranges": [
        "(line 524,col 9)-(line 530,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.iteratePointers(java.lang.String)",
      "begin_line": 539,
      "end_line": 541,
      "comment": "\n     * Traverses the xpath and returns an Iterator of Pointers.\n     * A Pointer provides easy access to a property.\n     * If the xpath matches no properties\n     * in the graph, the Iterator be empty, but not null.\n     ",
      "child_ranges": [
        "(line 540,col 9)-(line 540,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.iteratePointers(java.lang.String, org.apache.commons.jxpath.ri.compiler.Expression)",
      "begin_line": 543,
      "end_line": 545,
      "comment": "",
      "child_ranges": [
        "(line 544,col 9)-(line 544,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.removePath(java.lang.String)",
      "begin_line": 547,
      "end_line": 549,
      "comment": "",
      "child_ranges": [
        "(line 548,col 9)-(line 548,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.removePath(java.lang.String, org.apache.commons.jxpath.ri.compiler.Expression)",
      "begin_line": 551,
      "end_line": 563,
      "comment": "",
      "child_ranges": [
        "(line 552,col 9)-(line 562,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.removeAll(java.lang.String)",
      "begin_line": 565,
      "end_line": 567,
      "comment": "",
      "child_ranges": [
        "(line 566,col 9)-(line 566,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.removeAll(java.lang.String, org.apache.commons.jxpath.ri.compiler.Expression)",
      "begin_line": 569,
      "end_line": 591,
      "comment": "",
      "child_ranges": [
        "(line 570,col 9)-(line 590,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getRelativeContext(org.apache.commons.jxpath.Pointer)",
      "begin_line": 593,
      "end_line": 601,
      "comment": "",
      "child_ranges": [
        "(line 594,col 9)-(line 594,col 47)",
        "(line 595,col 9)-(line 599,col 9)",
        "(line 600,col 9)-(line 600,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getContextPointer()",
      "begin_line": 603,
      "end_line": 605,
      "comment": "",
      "child_ranges": [
        "(line 604,col 9)-(line 604,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getAbsoluteRootPointer()",
      "begin_line": 607,
      "end_line": 609,
      "comment": "",
      "child_ranges": [
        "(line 608,col 9)-(line 608,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getEvalContext()",
      "begin_line": 611,
      "end_line": 614,
      "comment": "",
      "child_ranges": [
        "(line 612,col 9)-(line 613,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getAbsoluteRootContext()",
      "begin_line": 616,
      "end_line": 619,
      "comment": "",
      "child_ranges": [
        "(line 617,col 9)-(line 618,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getVariablePointer(org.apache.commons.jxpath.ri.QName)",
      "begin_line": 621,
      "end_line": 642,
      "comment": "",
      "child_ranges": [
        "(line 622,col 9)-(line 622,col 41)",
        "(line 623,col 9)-(line 623,col 36)",
        "(line 624,col 9)-(line 624,col 30)",
        "(line 625,col 9)-(line 632,col 9)",
        "(line 633,col 9)-(line 641,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getFunction(org.apache.commons.jxpath.ri.QName, java.lang.Object[])",
      "begin_line": 644,
      "end_line": 662,
      "comment": "",
      "child_ranges": [
        "(line 645,col 9)-(line 645,col 52)",
        "(line 646,col 9)-(line 646,col 45)",
        "(line 647,col 9)-(line 647,col 37)",
        "(line 648,col 9)-(line 648,col 29)",
        "(line 649,col 9)-(line 649,col 24)",
        "(line 650,col 9)-(line 659,col 9)",
        "(line 660,col 9)-(line 661,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.registerNamespace(java.lang.String, java.lang.String)",
      "begin_line": 664,
      "end_line": 669,
      "comment": "",
      "child_ranges": [
        "(line 665,col 9)-(line 667,col 9)",
        "(line 668,col 9)-(line 668,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getNamespaceURI(java.lang.String)",
      "begin_line": 671,
      "end_line": 673,
      "comment": "",
      "child_ranges": [
        "(line 672,col 9)-(line 672,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getPrefix(java.lang.String)",
      "begin_line": 679,
      "end_line": 681,
      "comment": "\n     * {@inheritDoc}\n     * @see org.apache.commons.jxpath.JXPathContext#getPrefix(java.lang.String)\n     ",
      "child_ranges": [
        "(line 680,col 9)-(line 680,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.setNamespaceContextPointer(org.apache.commons.jxpath.Pointer)",
      "begin_line": 683,
      "end_line": 688,
      "comment": "",
      "child_ranges": [
        "(line 684,col 9)-(line 686,col 9)",
        "(line 687,col 9)-(line 687,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getNamespaceContextPointer()",
      "begin_line": 690,
      "end_line": 692,
      "comment": "",
      "child_ranges": [
        "(line 691,col 9)-(line 691,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getNamespaceResolver()",
      "begin_line": 694,
      "end_line": 697,
      "comment": "",
      "child_ranges": [
        "(line 695,col 9)-(line 695,col 33)",
        "(line 696,col 9)-(line 696,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.allocateConditionally(java.lang.String, java.lang.String)",
      "begin_line": 703,
      "end_line": 720,
      "comment": "\n     * Checks if existenceCheckClass exists on the class path. If so, allocates\n     * an instance of the specified class, otherwise returns null.\n     ",
      "child_ranges": [
        "(line 707,col 9)-(line 719,col 9)"
      ]
    }
  ]
}