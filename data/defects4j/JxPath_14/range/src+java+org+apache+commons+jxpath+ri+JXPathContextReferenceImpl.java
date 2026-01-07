{
  "filepath": "/tmp/JxPath-14b/src/java/org/apache/commons/jxpath/ri/JXPathContextReferenceImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JXPathContextReferenceImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.JXPathContext"
      ],
      "begin_line": 62,
      "end_line": 702,
      "comment": "\n * The reference implementation of JXPathContext.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "USE_SOFT_CACHE"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": "\n     * Change this to \u003ccode\u003efalse\u003c/code\u003e to disable soft caching of\n     * CompiledExpressions.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "COMPILER"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compiled"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cleanupCount"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nodeFactories"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nodeFactoryArray"
      ],
      "begin_line": 75,
      "end_line": 75,
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
        "CLEANUP_THRESHOLD"
      ],
      "begin_line": 118,
      "end_line": 118,
      "comment": " The frequency of the cache cleanup"
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.JXPathContextReferenceImpl(org.apache.commons.jxpath.JXPathContext, java.lang.Object)",
      "begin_line": 120,
      "end_line": 124,
      "comment": "",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 47)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.JXPathContextReferenceImpl(org.apache.commons.jxpath.JXPathContext, java.lang.Object, org.apache.commons.jxpath.Pointer)",
      "begin_line": 126,
      "end_line": 161,
      "comment": "",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 42)",
        "(line 133,col 9)-(line 135,col 9)",
        "(line 137,col 9)-(line 152,col 9)",
        "(line 154,col 9)-(line 154,col 42)",
        "(line 155,col 9)-(line 157,col 9)",
        "(line 158,col 9)-(line 158,col 60)",
        "(line 159,col 9)-(line 160,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.createNodeFactoryArray()",
      "begin_line": 163,
      "end_line": 176,
      "comment": "",
      "child_ranges": [
        "(line 164,col 9)-(line 175,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.Anonymous-ea0b4e93-b9e0-4925-b6ce-e8b2bde16cb0.compare(java.lang.Object, java.lang.Object)",
      "begin_line": 169,
      "end_line": 173,
      "comment": "",
      "child_ranges": [
        "(line 170,col 21)-(line 170,col 69)",
        "(line 171,col 21)-(line 171,col 69)",
        "(line 172,col 21)-(line 172,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.addNodePointerFactory(org.apache.commons.jxpath.ri.model.NodePointerFactory)",
      "begin_line": 183,
      "end_line": 188,
      "comment": "\n     * Call this with a custom NodePointerFactory to add support for\n     * additional types of objects.  Make sure the factory returns\n     * a name that puts it in the right position on the list of factories.\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 187,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getNodePointerFactories()",
      "begin_line": 190,
      "end_line": 192,
      "comment": "",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getCompiler()",
      "begin_line": 199,
      "end_line": 201,
      "comment": "\n     * Returns a static instance of TreeCompiler.\n     *\n     * Override this to return an aternate compiler.\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.compilePath(java.lang.String)",
      "begin_line": 203,
      "end_line": 205,
      "comment": "",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.compileExpression(java.lang.String)",
      "begin_line": 207,
      "end_line": 249,
      "comment": "",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 24)",
        "(line 210,col 9)-(line 221,col 9)",
        "(line 223,col 9)-(line 225,col 9)",
        "(line 227,col 9)-(line 227,col 73)",
        "(line 229,col 9)-(line 246,col 9)",
        "(line 248,col 9)-(line 248,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getValue(java.lang.String)",
      "begin_line": 255,
      "end_line": 290,
      "comment": "\n     * Traverses the xpath and returns the resulting object. Primitive\n     * types are wrapped into objects.\n     ",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 57)",
        "(line 289,col 9)-(line 289,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getValue(java.lang.String, org.apache.commons.jxpath.ri.compiler.Expression)",
      "begin_line": 322,
      "end_line": 362,
      "comment": "",
      "child_ranges": [
        "(line 323,col 9)-(line 323,col 60)",
        "(line 324,col 9)-(line 332,col 9)",
        "(line 333,col 9)-(line 340,col 9)",
        "(line 341,col 9)-(line 360,col 9)",
        "(line 361,col 9)-(line 361,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getValue(java.lang.String, java.lang.Class)",
      "begin_line": 368,
      "end_line": 371,
      "comment": "\n     * Calls getValue(xpath), converts the result to the required type\n     * and returns the result of the conversion.\n     ",
      "child_ranges": [
        "(line 369,col 9)-(line 369,col 51)",
        "(line 370,col 9)-(line 370,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getValue(java.lang.String, org.apache.commons.jxpath.ri.compiler.Expression, java.lang.Class)",
      "begin_line": 373,
      "end_line": 388,
      "comment": "",
      "child_ranges": [
        "(line 374,col 9)-(line 374,col 45)",
        "(line 375,col 9)-(line 386,col 9)",
        "(line 387,col 9)-(line 387,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.iterate(java.lang.String)",
      "begin_line": 395,
      "end_line": 397,
      "comment": "\n     * Traverses the xpath and returns a Iterator of all results found\n     * for the path. If the xpath matches no properties\n     * in the graph, the Iterator will not be null.\n     ",
      "child_ranges": [
        "(line 396,col 9)-(line 396,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.iterate(java.lang.String, org.apache.commons.jxpath.ri.compiler.Expression)",
      "begin_line": 399,
      "end_line": 401,
      "comment": "",
      "child_ranges": [
        "(line 400,col 9)-(line 400,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getPointer(java.lang.String)",
      "begin_line": 403,
      "end_line": 405,
      "comment": "",
      "child_ranges": [
        "(line 404,col 9)-(line 404,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getPointer(java.lang.String, org.apache.commons.jxpath.ri.compiler.Expression)",
      "begin_line": 407,
      "end_line": 420,
      "comment": "",
      "child_ranges": [
        "(line 408,col 9)-(line 408,col 60)",
        "(line 409,col 9)-(line 411,col 9)",
        "(line 412,col 9)-(line 418,col 9)",
        "(line 419,col 9)-(line 419,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.setValue(java.lang.String, java.lang.Object)",
      "begin_line": 422,
      "end_line": 424,
      "comment": "",
      "child_ranges": [
        "(line 423,col 9)-(line 423,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.setValue(java.lang.String, org.apache.commons.jxpath.ri.compiler.Expression, java.lang.Object)",
      "begin_line": 426,
      "end_line": 434,
      "comment": "",
      "child_ranges": [
        "(line 427,col 9)-(line 433,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.createPath(java.lang.String)",
      "begin_line": 436,
      "end_line": 438,
      "comment": "",
      "child_ranges": [
        "(line 437,col 9)-(line 437,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.createPath(java.lang.String, org.apache.commons.jxpath.ri.compiler.Expression)",
      "begin_line": 440,
      "end_line": 464,
      "comment": "",
      "child_ranges": [
        "(line 441,col 9)-(line 463,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.createPathAndSetValue(java.lang.String, java.lang.Object)",
      "begin_line": 466,
      "end_line": 468,
      "comment": "",
      "child_ranges": [
        "(line 467,col 9)-(line 467,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.createPathAndSetValue(java.lang.String, org.apache.commons.jxpath.ri.compiler.Expression, java.lang.Object)",
      "begin_line": 470,
      "end_line": 483,
      "comment": "",
      "child_ranges": [
        "(line 475,col 9)-(line 482,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.setValue(java.lang.String, org.apache.commons.jxpath.ri.compiler.Expression, java.lang.Object, boolean)",
      "begin_line": 485,
      "end_line": 516,
      "comment": "",
      "child_ranges": [
        "(line 491,col 9)-(line 491,col 60)",
        "(line 492,col 9)-(line 492,col 31)",
        "(line 494,col 9)-(line 508,col 9)",
        "(line 509,col 9)-(line 514,col 9)",
        "(line 515,col 9)-(line 515,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.checkSimplePath(org.apache.commons.jxpath.ri.compiler.Expression)",
      "begin_line": 522,
      "end_line": 530,
      "comment": "\n     * Checks if the path follows the JXPath restrictions on the type\n     * of path that can be passed to create... methods.\n     ",
      "child_ranges": [
        "(line 523,col 9)-(line 529,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.iteratePointers(java.lang.String)",
      "begin_line": 538,
      "end_line": 540,
      "comment": "\n     * Traverses the xpath and returns an Iterator of Pointers.\n     * A Pointer provides easy access to a property.\n     * If the xpath matches no properties\n     * in the graph, the Iterator be empty, but not null.\n     ",
      "child_ranges": [
        "(line 539,col 9)-(line 539,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.iteratePointers(java.lang.String, org.apache.commons.jxpath.ri.compiler.Expression)",
      "begin_line": 542,
      "end_line": 544,
      "comment": "",
      "child_ranges": [
        "(line 543,col 9)-(line 543,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.removePath(java.lang.String)",
      "begin_line": 546,
      "end_line": 548,
      "comment": "",
      "child_ranges": [
        "(line 547,col 9)-(line 547,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.removePath(java.lang.String, org.apache.commons.jxpath.ri.compiler.Expression)",
      "begin_line": 550,
      "end_line": 562,
      "comment": "",
      "child_ranges": [
        "(line 551,col 9)-(line 561,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.removeAll(java.lang.String)",
      "begin_line": 564,
      "end_line": 566,
      "comment": "",
      "child_ranges": [
        "(line 565,col 9)-(line 565,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.removeAll(java.lang.String, org.apache.commons.jxpath.ri.compiler.Expression)",
      "begin_line": 568,
      "end_line": 590,
      "comment": "",
      "child_ranges": [
        "(line 569,col 9)-(line 589,col 9)"
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
      "end_line": 623,
      "comment": "",
      "child_ranges": [
        "(line 621,col 9)-(line 622,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getFunction(org.apache.commons.jxpath.ri.QName, java.lang.Object[])",
      "begin_line": 625,
      "end_line": 643,
      "comment": "",
      "child_ranges": [
        "(line 626,col 9)-(line 626,col 52)",
        "(line 627,col 9)-(line 627,col 45)",
        "(line 628,col 9)-(line 628,col 37)",
        "(line 629,col 9)-(line 629,col 29)",
        "(line 630,col 9)-(line 630,col 24)",
        "(line 631,col 9)-(line 640,col 9)",
        "(line 641,col 9)-(line 642,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.registerNamespace(java.lang.String, java.lang.String)",
      "begin_line": 645,
      "end_line": 650,
      "comment": "",
      "child_ranges": [
        "(line 646,col 9)-(line 648,col 9)",
        "(line 649,col 9)-(line 649,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getNamespaceURI(java.lang.String)",
      "begin_line": 652,
      "end_line": 654,
      "comment": "",
      "child_ranges": [
        "(line 653,col 9)-(line 653,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getPrefix(java.lang.String)",
      "begin_line": 660,
      "end_line": 662,
      "comment": "\n     * {@inheritDoc}\n     * @see org.apache.commons.jxpath.JXPathContext#getPrefix(java.lang.String)\n     ",
      "child_ranges": [
        "(line 661,col 9)-(line 661,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.setNamespaceContextPointer(org.apache.commons.jxpath.Pointer)",
      "begin_line": 664,
      "end_line": 669,
      "comment": "",
      "child_ranges": [
        "(line 665,col 9)-(line 667,col 9)",
        "(line 668,col 9)-(line 668,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getNamespaceContextPointer()",
      "begin_line": 671,
      "end_line": 673,
      "comment": "",
      "child_ranges": [
        "(line 672,col 9)-(line 672,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getNamespaceResolver()",
      "begin_line": 675,
      "end_line": 678,
      "comment": "",
      "child_ranges": [
        "(line 676,col 9)-(line 676,col 33)",
        "(line 677,col 9)-(line 677,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.allocateConditionally(java.lang.String, java.lang.String)",
      "begin_line": 684,
      "end_line": 701,
      "comment": "\n     * Checks if existenceCheckClass exists on the class path. If so, allocates\n     * an instance of the specified class, otherwise returns null.\n     ",
      "child_ranges": [
        "(line 688,col 9)-(line 700,col 9)"
      ]
    }
  ]
}