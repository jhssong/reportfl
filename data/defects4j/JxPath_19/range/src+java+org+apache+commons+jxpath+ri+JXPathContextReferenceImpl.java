{
  "filepath": "/tmp/JxPath-19b/src/java/org/apache/commons/jxpath/ri/JXPathContextReferenceImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JXPathContextReferenceImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.JXPathContext"
      ],
      "begin_line": 63,
      "end_line": 827,
      "comment": "\n * The reference implementation of JXPathContext.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "USE_SOFT_CACHE"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": "\n     * Change this to \u003ccode\u003efalse\u003c/code\u003e to disable soft caching of\n     * CompiledExpressions.\n     "
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
        "nodeFactoryArray"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CLEANUP_THRESHOLD"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " The frequency of the cache cleanup"
    },
    {
      "type": "field",
      "varNames": [
        "nodeFactories"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.createNodeFactoryArray()",
      "begin_line": 119,
      "end_line": 132,
      "comment": "\n     * Create the default node factory array.\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 131,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.Anonymous-cb04d544-49ef-4a47-81c1-314d32464acf.compare(java.lang.Object, java.lang.Object)",
      "begin_line": 125,
      "end_line": 129,
      "comment": "",
      "child_ranges": [
        "(line 126,col 21)-(line 126,col 69)",
        "(line 127,col 21)-(line 127,col 69)",
        "(line 128,col 21)-(line 128,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.addNodePointerFactory(org.apache.commons.jxpath.ri.model.NodePointerFactory)",
      "begin_line": 140,
      "end_line": 145,
      "comment": "\n     * Call this with a custom NodePointerFactory to add support for\n     * additional types of objects.  Make sure the factory returns\n     * a name that puts it in the right position on the list of factories.\n     * @param factory NodePointerFactory to add\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 144,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getNodePointerFactories()",
      "begin_line": 151,
      "end_line": 153,
      "comment": "\n     * Get the registered NodePointerFactories.\n     * @return NodePointerFactory[]\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 32)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "namespaceResolver"
      ],
      "begin_line": 156,
      "end_line": 156,
      "comment": " Namespace resolver "
    },
    {
      "type": "field",
      "varNames": [
        "rootPointer"
      ],
      "begin_line": 158,
      "end_line": 158,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "contextPointer"
      ],
      "begin_line": 159,
      "end_line": 159,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.JXPathContextReferenceImpl(org.apache.commons.jxpath.JXPathContext, java.lang.Object)",
      "begin_line": 166,
      "end_line": 169,
      "comment": "\n     * Create a new JXPathContextReferenceImpl.\n     * @param parentContext parent context\n     * @param contextBean Object\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 47)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.JXPathContextReferenceImpl(org.apache.commons.jxpath.JXPathContext, java.lang.Object, org.apache.commons.jxpath.Pointer)",
      "begin_line": 177,
      "end_line": 209,
      "comment": "\n     * Create a new JXPathContextReferenceImpl.\n     * @param parentContext parent context\n     * @param contextBean Object\n     * @param contextPointer context pointer\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 42)",
        "(line 181,col 9)-(line 183,col 9)",
        "(line 185,col 9)-(line 200,col 9)",
        "(line 202,col 9)-(line 202,col 42)",
        "(line 203,col 9)-(line 205,col 9)",
        "(line 206,col 9)-(line 206,col 60)",
        "(line 207,col 9)-(line 208,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getCompiler()",
      "begin_line": 217,
      "end_line": 219,
      "comment": "\n     * Returns a static instance of TreeCompiler.\n     *\n     * Override this to return an alternate compiler.\n     * @return Compiler\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.compilePath(java.lang.String)",
      "begin_line": 221,
      "end_line": 223,
      "comment": "",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.compileExpression(java.lang.String)",
      "begin_line": 230,
      "end_line": 272,
      "comment": "\n     * Compile the given expression.\n     * @param xpath to compile\n     * @return Expression\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 24)",
        "(line 233,col 9)-(line 244,col 9)",
        "(line 246,col 9)-(line 248,col 9)",
        "(line 250,col 9)-(line 250,col 73)",
        "(line 252,col 9)-(line 269,col 9)",
        "(line 271,col 9)-(line 271,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getValue(java.lang.String)",
      "begin_line": 280,
      "end_line": 315,
      "comment": "\n     * Traverses the xpath and returns the resulting object. Primitive\n     * types are wrapped into objects.\n     * @param xpath expression\n     * @return Object found\n     ",
      "child_ranges": [
        "(line 281,col 9)-(line 281,col 57)",
        "(line 314,col 9)-(line 314,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getValue(java.lang.String, org.apache.commons.jxpath.ri.compiler.Expression)",
      "begin_line": 353,
      "end_line": 391,
      "comment": "\n     * Get the value indicated.\n     * @param xpath String\n     * @param expr Expression\n     * @return Object\n     ",
      "child_ranges": [
        "(line 354,col 9)-(line 354,col 60)",
        "(line 355,col 9)-(line 361,col 9)",
        "(line 362,col 9)-(line 369,col 9)",
        "(line 370,col 9)-(line 389,col 9)",
        "(line 390,col 9)-(line 390,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getValue(java.lang.String, java.lang.Class)",
      "begin_line": 400,
      "end_line": 403,
      "comment": "\n     * Calls getValue(xpath), converts the result to the required type\n     * and returns the result of the conversion.\n     * @param xpath expression\n     * @param requiredType Class\n     * @return Object\n     ",
      "child_ranges": [
        "(line 401,col 9)-(line 401,col 51)",
        "(line 402,col 9)-(line 402,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getValue(java.lang.String, org.apache.commons.jxpath.ri.compiler.Expression, java.lang.Class)",
      "begin_line": 412,
      "end_line": 427,
      "comment": "\n     * Get the value indicated.\n     * @param xpath expression\n     * @param expr compiled Expression\n     * @param requiredType Class\n     * @return Object\n     ",
      "child_ranges": [
        "(line 413,col 9)-(line 413,col 45)",
        "(line 414,col 9)-(line 425,col 9)",
        "(line 426,col 9)-(line 426,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.iterate(java.lang.String)",
      "begin_line": 436,
      "end_line": 438,
      "comment": "\n     * Traverses the xpath and returns a Iterator of all results found\n     * for the path. If the xpath matches no properties\n     * in the graph, the Iterator will not be null.\n     * @param xpath expression\n     * @return Iterator\n     ",
      "child_ranges": [
        "(line 437,col 9)-(line 437,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.iterate(java.lang.String, org.apache.commons.jxpath.ri.compiler.Expression)",
      "begin_line": 448,
      "end_line": 450,
      "comment": "\n     * Traverses the xpath and returns a Iterator of all results found\n     * for the path. If the xpath matches no properties\n     * in the graph, the Iterator will not be null.\n     * @param xpath expression\n     * @param expr compiled Expression\n     * @return Iterator\n     ",
      "child_ranges": [
        "(line 449,col 9)-(line 449,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getPointer(java.lang.String)",
      "begin_line": 452,
      "end_line": 454,
      "comment": "",
      "child_ranges": [
        "(line 453,col 9)-(line 453,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getPointer(java.lang.String, org.apache.commons.jxpath.ri.compiler.Expression)",
      "begin_line": 462,
      "end_line": 475,
      "comment": "\n     * Get a pointer to the specified path/expression.\n     * @param xpath String\n     * @param expr compiled Expression\n     * @return Pointer\n     ",
      "child_ranges": [
        "(line 463,col 9)-(line 463,col 60)",
        "(line 464,col 9)-(line 466,col 9)",
        "(line 467,col 9)-(line 473,col 9)",
        "(line 474,col 9)-(line 474,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.setValue(java.lang.String, java.lang.Object)",
      "begin_line": 477,
      "end_line": 479,
      "comment": "",
      "child_ranges": [
        "(line 478,col 9)-(line 478,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.setValue(java.lang.String, org.apache.commons.jxpath.ri.compiler.Expression, java.lang.Object)",
      "begin_line": 487,
      "end_line": 495,
      "comment": "\n     * Set the value of xpath to value.\n     * @param xpath path\n     * @param expr compiled Expression\n     * @param value Object\n     ",
      "child_ranges": [
        "(line 488,col 9)-(line 494,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.createPath(java.lang.String)",
      "begin_line": 497,
      "end_line": 499,
      "comment": "",
      "child_ranges": [
        "(line 498,col 9)-(line 498,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.createPath(java.lang.String, org.apache.commons.jxpath.ri.compiler.Expression)",
      "begin_line": 507,
      "end_line": 531,
      "comment": "\n     * Create the given path.\n     * @param xpath String\n     * @param expr compiled Expression\n     * @return resulting Pointer\n     ",
      "child_ranges": [
        "(line 508,col 9)-(line 530,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.createPathAndSetValue(java.lang.String, java.lang.Object)",
      "begin_line": 533,
      "end_line": 535,
      "comment": "",
      "child_ranges": [
        "(line 534,col 9)-(line 534,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.createPathAndSetValue(java.lang.String, org.apache.commons.jxpath.ri.compiler.Expression, java.lang.Object)",
      "begin_line": 544,
      "end_line": 554,
      "comment": "\n     * Create the given path setting its value to value.\n     * @param xpath String\n     * @param expr compiled Expression\n     * @param value Object\n     * @return resulting Pointer\n     ",
      "child_ranges": [
        "(line 546,col 9)-(line 553,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.setValue(java.lang.String, org.apache.commons.jxpath.ri.compiler.Expression, java.lang.Object, boolean)",
      "begin_line": 564,
      "end_line": 591,
      "comment": "\n     * Set the specified value.\n     * @param xpath path\n     * @param expr compiled Expression\n     * @param value destination value\n     * @param create whether to create missing node(s)\n     * @return Pointer created\n     ",
      "child_ranges": [
        "(line 566,col 9)-(line 566,col 60)",
        "(line 567,col 9)-(line 567,col 31)",
        "(line 569,col 9)-(line 583,col 9)",
        "(line 584,col 9)-(line 589,col 9)",
        "(line 590,col 9)-(line 590,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.checkSimplePath(org.apache.commons.jxpath.ri.compiler.Expression)",
      "begin_line": 598,
      "end_line": 606,
      "comment": "\n     * Checks if the path follows the JXPath restrictions on the type\n     * of path that can be passed to create... methods.\n     * @param expr Expression to check\n     ",
      "child_ranges": [
        "(line 599,col 9)-(line 605,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.iteratePointers(java.lang.String)",
      "begin_line": 616,
      "end_line": 618,
      "comment": "\n     * Traverses the xpath and returns an Iterator of Pointers.\n     * A Pointer provides easy access to a property.\n     * If the xpath matches no properties\n     * in the graph, the Iterator be empty, but not null.\n     * @param xpath expression\n     * @return Iterator\n     ",
      "child_ranges": [
        "(line 617,col 9)-(line 617,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.iteratePointers(java.lang.String, org.apache.commons.jxpath.ri.compiler.Expression)",
      "begin_line": 629,
      "end_line": 631,
      "comment": "\n     * Traverses the xpath and returns an Iterator of Pointers.\n     * A Pointer provides easy access to a property.\n     * If the xpath matches no properties\n     * in the graph, the Iterator be empty, but not null.\n     * @param xpath expression\n     * @param expr compiled Expression\n     * @return Iterator\n     ",
      "child_ranges": [
        "(line 630,col 9)-(line 630,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.removePath(java.lang.String)",
      "begin_line": 633,
      "end_line": 635,
      "comment": "",
      "child_ranges": [
        "(line 634,col 9)-(line 634,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.removePath(java.lang.String, org.apache.commons.jxpath.ri.compiler.Expression)",
      "begin_line": 642,
      "end_line": 654,
      "comment": "\n     * Remove the specified path.\n     * @param xpath expression\n     * @param expr compiled Expression\n     ",
      "child_ranges": [
        "(line 643,col 9)-(line 653,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.removeAll(java.lang.String)",
      "begin_line": 656,
      "end_line": 658,
      "comment": "",
      "child_ranges": [
        "(line 657,col 9)-(line 657,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.removeAll(java.lang.String, org.apache.commons.jxpath.ri.compiler.Expression)",
      "begin_line": 665,
      "end_line": 687,
      "comment": "\n     * Remove all matching nodes.\n     * @param xpath expression\n     * @param expr compiled Expression\n     ",
      "child_ranges": [
        "(line 666,col 9)-(line 686,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getRelativeContext(org.apache.commons.jxpath.Pointer)",
      "begin_line": 689,
      "end_line": 697,
      "comment": "",
      "child_ranges": [
        "(line 690,col 9)-(line 690,col 47)",
        "(line 691,col 9)-(line 695,col 9)",
        "(line 696,col 9)-(line 696,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getContextPointer()",
      "begin_line": 699,
      "end_line": 701,
      "comment": "",
      "child_ranges": [
        "(line 700,col 9)-(line 700,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getAbsoluteRootPointer()",
      "begin_line": 707,
      "end_line": 709,
      "comment": "\n     * Get absolute root pointer.\n     * @return NodePointer\n     ",
      "child_ranges": [
        "(line 708,col 9)-(line 708,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getEvalContext()",
      "begin_line": 715,
      "end_line": 718,
      "comment": "\n     * Get the evaluation context.\n     * @return EvalContext\n     ",
      "child_ranges": [
        "(line 716,col 9)-(line 717,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getAbsoluteRootContext()",
      "begin_line": 724,
      "end_line": 727,
      "comment": "\n     * Get the absolute root context.\n     * @return EvalContext\n     ",
      "child_ranges": [
        "(line 725,col 9)-(line 726,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getVariablePointer(org.apache.commons.jxpath.ri.QName)",
      "begin_line": 734,
      "end_line": 737,
      "comment": "\n     * Get a VariablePointer for the given variable name.\n     * @param name variable name\n     * @return NodePointer\n     ",
      "child_ranges": [
        "(line 735,col 9)-(line 736,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getFunction(org.apache.commons.jxpath.ri.QName, java.lang.Object[])",
      "begin_line": 745,
      "end_line": 763,
      "comment": "\n     * Get the named Function.\n     * @param functionName name\n     * @param parameters function args\n     * @return Function\n     ",
      "child_ranges": [
        "(line 746,col 9)-(line 746,col 52)",
        "(line 747,col 9)-(line 747,col 45)",
        "(line 748,col 9)-(line 748,col 37)",
        "(line 749,col 9)-(line 749,col 29)",
        "(line 750,col 9)-(line 750,col 24)",
        "(line 751,col 9)-(line 760,col 9)",
        "(line 761,col 9)-(line 762,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.registerNamespace(java.lang.String, java.lang.String)",
      "begin_line": 765,
      "end_line": 770,
      "comment": "",
      "child_ranges": [
        "(line 766,col 9)-(line 768,col 9)",
        "(line 769,col 9)-(line 769,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getNamespaceURI(java.lang.String)",
      "begin_line": 772,
      "end_line": 774,
      "comment": "",
      "child_ranges": [
        "(line 773,col 9)-(line 773,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getPrefix(java.lang.String)",
      "begin_line": 780,
      "end_line": 782,
      "comment": "\n     * {@inheritDoc}\n     * @see org.apache.commons.jxpath.JXPathContext#getPrefix(java.lang.String)\n     ",
      "child_ranges": [
        "(line 781,col 9)-(line 781,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.setNamespaceContextPointer(org.apache.commons.jxpath.Pointer)",
      "begin_line": 784,
      "end_line": 789,
      "comment": "",
      "child_ranges": [
        "(line 785,col 9)-(line 787,col 9)",
        "(line 788,col 9)-(line 788,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getNamespaceContextPointer()",
      "begin_line": 791,
      "end_line": 793,
      "comment": "",
      "child_ranges": [
        "(line 792,col 9)-(line 792,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getNamespaceResolver()",
      "begin_line": 799,
      "end_line": 802,
      "comment": "\n     * Get the namespace resolver.\n     * @return NamespaceResolver\n     ",
      "child_ranges": [
        "(line 800,col 9)-(line 800,col 33)",
        "(line 801,col 9)-(line 801,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.allocateConditionally(java.lang.String, java.lang.String)",
      "begin_line": 811,
      "end_line": 826,
      "comment": "\n     * Checks if existenceCheckClass exists on the class path. If so, allocates\n     * an instance of the specified class, otherwise returns null.\n     * @param className to instantiate\n     * @param existenceCheckClassName guard class\n     * @return className instance\n     ",
      "child_ranges": [
        "(line 813,col 9)-(line 825,col 9)"
      ]
    }
  ]
}