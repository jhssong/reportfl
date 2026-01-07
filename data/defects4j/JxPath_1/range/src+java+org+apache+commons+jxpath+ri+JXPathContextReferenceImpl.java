{
  "filepath": "/tmp/JxPath-1b/src/java/org/apache/commons/jxpath/ri/JXPathContextReferenceImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JXPathContextReferenceImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.JXPathContext"
      ],
      "begin_line": 63,
      "end_line": 729,
      "comment": "\n * The reference implementation of JXPathContext.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "USE_SOFT_CACHE"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": "\n     * Change this to \u003ccode\u003efalse\u003c/code\u003e to disable soft caching of \n     * CompiledExpressions. \n     "
    },
    {
      "type": "field",
      "varNames": [
        "COMPILER"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compiled"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cleanupCount"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nodeFactories"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nodeFactoryArray"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "rootPointer"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "contextPointer"
      ],
      "begin_line": 113,
      "end_line": 113,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "namespaceResolver"
      ],
      "begin_line": 115,
      "end_line": 115,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "defaultNamespaceURI"
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
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.Anonymous-09837862-c3e6-43c4-b820-f906d0e93e6b.compare(java.lang.Object, java.lang.Object)",
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
      "end_line": 423,
      "comment": "",
      "child_ranges": [
        "(line 409,col 9)-(line 409,col 60)",
        "(line 410,col 9)-(line 412,col 9)",
        "(line 413,col 9)-(line 422,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.setValue(java.lang.String, java.lang.Object)",
      "begin_line": 425,
      "end_line": 427,
      "comment": "",
      "child_ranges": [
        "(line 426,col 9)-(line 426,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.setValue(java.lang.String, org.apache.commons.jxpath.ri.compiler.Expression, java.lang.Object)",
      "begin_line": 430,
      "end_line": 438,
      "comment": "",
      "child_ranges": [
        "(line 431,col 9)-(line 437,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.createPath(java.lang.String)",
      "begin_line": 440,
      "end_line": 442,
      "comment": "",
      "child_ranges": [
        "(line 441,col 9)-(line 441,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.createPath(java.lang.String, org.apache.commons.jxpath.ri.compiler.Expression)",
      "begin_line": 444,
      "end_line": 468,
      "comment": "",
      "child_ranges": [
        "(line 445,col 9)-(line 467,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.createPathAndSetValue(java.lang.String, java.lang.Object)",
      "begin_line": 470,
      "end_line": 472,
      "comment": "",
      "child_ranges": [
        "(line 471,col 9)-(line 471,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.createPathAndSetValue(java.lang.String, org.apache.commons.jxpath.ri.compiler.Expression, java.lang.Object)",
      "begin_line": 474,
      "end_line": 487,
      "comment": "",
      "child_ranges": [
        "(line 479,col 9)-(line 486,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.setValue(java.lang.String, org.apache.commons.jxpath.ri.compiler.Expression, java.lang.Object, boolean)",
      "begin_line": 489,
      "end_line": 520,
      "comment": "",
      "child_ranges": [
        "(line 495,col 9)-(line 495,col 60)",
        "(line 496,col 9)-(line 496,col 31)",
        "(line 498,col 9)-(line 512,col 9)",
        "(line 513,col 9)-(line 518,col 9)",
        "(line 519,col 9)-(line 519,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.checkSimplePath(org.apache.commons.jxpath.ri.compiler.Expression)",
      "begin_line": 526,
      "end_line": 534,
      "comment": "\n     * Checks if the path follows the JXPath restrictions on the type\n     * of path that can be passed to create... methods.\n     ",
      "child_ranges": [
        "(line 527,col 9)-(line 533,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.iteratePointers(java.lang.String)",
      "begin_line": 542,
      "end_line": 544,
      "comment": "\n     * Traverses the xpath and returns an Iterator of Pointers.\n     * A Pointer provides easy access to a property.\n     * If the xpath matches no properties\n     * in the graph, the Iterator be empty, but not null.\n     ",
      "child_ranges": [
        "(line 543,col 9)-(line 543,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.iteratePointers(java.lang.String, org.apache.commons.jxpath.ri.compiler.Expression)",
      "begin_line": 546,
      "end_line": 548,
      "comment": "",
      "child_ranges": [
        "(line 547,col 9)-(line 547,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.removePath(java.lang.String)",
      "begin_line": 550,
      "end_line": 552,
      "comment": "",
      "child_ranges": [
        "(line 551,col 9)-(line 551,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.removePath(java.lang.String, org.apache.commons.jxpath.ri.compiler.Expression)",
      "begin_line": 554,
      "end_line": 566,
      "comment": "",
      "child_ranges": [
        "(line 555,col 9)-(line 565,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.removeAll(java.lang.String)",
      "begin_line": 568,
      "end_line": 570,
      "comment": "",
      "child_ranges": [
        "(line 569,col 9)-(line 569,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.removeAll(java.lang.String, org.apache.commons.jxpath.ri.compiler.Expression)",
      "begin_line": 572,
      "end_line": 590,
      "comment": "",
      "child_ranges": [
        "(line 573,col 9)-(line 589,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getRelativeContext(org.apache.commons.jxpath.Pointer)",
      "begin_line": 592,
      "end_line": 600,
      "comment": "",
      "child_ranges": [
        "(line 593,col 9)-(line 593,col 47)",
        "(line 594,col 9)-(line 598,col 9)",
        "(line 599,col 9)-(line 599,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getContextPointer()",
      "begin_line": 602,
      "end_line": 604,
      "comment": "",
      "child_ranges": [
        "(line 603,col 9)-(line 603,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getAbsoluteRootPointer()",
      "begin_line": 606,
      "end_line": 608,
      "comment": "",
      "child_ranges": [
        "(line 607,col 9)-(line 607,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getEvalContext()",
      "begin_line": 610,
      "end_line": 613,
      "comment": "",
      "child_ranges": [
        "(line 611,col 9)-(line 612,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getAbsoluteRootContext()",
      "begin_line": 615,
      "end_line": 618,
      "comment": "",
      "child_ranges": [
        "(line 616,col 9)-(line 617,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getVariablePointer(org.apache.commons.jxpath.ri.QName)",
      "begin_line": 620,
      "end_line": 641,
      "comment": "",
      "child_ranges": [
        "(line 621,col 9)-(line 621,col 41)",
        "(line 622,col 9)-(line 622,col 36)",
        "(line 623,col 9)-(line 623,col 30)",
        "(line 624,col 9)-(line 631,col 9)",
        "(line 632,col 9)-(line 640,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getFunction(org.apache.commons.jxpath.ri.QName, java.lang.Object[])",
      "begin_line": 643,
      "end_line": 661,
      "comment": "",
      "child_ranges": [
        "(line 644,col 9)-(line 644,col 52)",
        "(line 645,col 9)-(line 645,col 45)",
        "(line 646,col 9)-(line 646,col 37)",
        "(line 647,col 9)-(line 647,col 29)",
        "(line 648,col 9)-(line 648,col 24)",
        "(line 649,col 9)-(line 658,col 9)",
        "(line 659,col 9)-(line 660,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.registerNamespace(java.lang.String, java.lang.String)",
      "begin_line": 663,
      "end_line": 668,
      "comment": "",
      "child_ranges": [
        "(line 664,col 9)-(line 666,col 9)",
        "(line 667,col 9)-(line 667,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getNamespaceURI(java.lang.String)",
      "begin_line": 670,
      "end_line": 672,
      "comment": "",
      "child_ranges": [
        "(line 671,col 9)-(line 671,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.setNamespaceContextPointer(org.apache.commons.jxpath.Pointer)",
      "begin_line": 674,
      "end_line": 679,
      "comment": "",
      "child_ranges": [
        "(line 675,col 9)-(line 677,col 9)",
        "(line 678,col 9)-(line 678,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getNamespaceContextPointer()",
      "begin_line": 681,
      "end_line": 683,
      "comment": "",
      "child_ranges": [
        "(line 682,col 9)-(line 682,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getNamespaceResolver()",
      "begin_line": 685,
      "end_line": 689,
      "comment": "",
      "child_ranges": [
        "(line 686,col 9)-(line 686,col 33)",
        "(line 687,col 9)-(line 687,col 80)",
        "(line 688,col 9)-(line 688,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getDefaultNamespaceURI()",
      "begin_line": 691,
      "end_line": 700,
      "comment": "",
      "child_ranges": [
        "(line 692,col 9)-(line 694,col 9)",
        "(line 695,col 9)-(line 697,col 9)",
        "(line 699,col 9)-(line 699,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.registerDefaultNamespace(java.lang.String)",
      "begin_line": 702,
      "end_line": 704,
      "comment": "",
      "child_ranges": [
        "(line 703,col 9)-(line 703,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.allocateConditionally(java.lang.String, java.lang.String)",
      "begin_line": 710,
      "end_line": 728,
      "comment": "\n     * Checks if existenceCheckClass exists on the class path. If so, allocates\n     * an instance of the specified class, otherwise returns null.\n     ",
      "child_ranges": [
        "(line 714,col 9)-(line 727,col 9)"
      ]
    }
  ]
}