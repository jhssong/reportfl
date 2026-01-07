{
  "filepath": "/tmp/JxPath-20b/src/java/org/apache/commons/jxpath/ri/axes/SimplePathInterpreter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SimplePathInterpreter",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 51,
      "end_line": 918,
      "comment": "\n * An evaluation mechanism for simple XPaths, which\n * is much faster than the usual process. It is only used for\n * xpaths which have no context-dependent parts, consist entirely of\n * \u003ccode\u003echild::name\u003c/code\u003e and \u003ccode\u003eself::node()\u003c/code\u003e steps with\n * predicates that either integer or have the form \u003ccode\u003e[@name \u003d ...]\u003c/code\u003e.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "QNAME_NAME"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "PERFECT_MATCH"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.SimplePathInterpreter.interpretSimpleLocationPath(org.apache.commons.jxpath.ri.EvalContext, org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.compiler.Step[])",
      "begin_line": 78,
      "end_line": 84,
      "comment": "\n     * Interpret a simple path that starts with the given root and\n     * follows the given steps. All steps must have the axis \"child::\"\n     * and a name test.  They can also optionally have predicates\n     * of type [@name\u003dexpression] or simply [expression] interpreted\n     * as an index.\n     * @param context evaluation context\n     * @param root root pointer\n     * @param steps path steps\n     * @return NodePointer\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 62)",
        "(line 83,col 9)-(line 83,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.SimplePathInterpreter.interpretSimpleExpressionPath(org.apache.commons.jxpath.ri.EvalContext, org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.compiler.Expression[], org.apache.commons.jxpath.ri.compiler.Step[])",
      "begin_line": 100,
      "end_line": 109,
      "comment": "\n     * Interpret the steps of a simple expression path that\n     * starts with the given root, which is the result of evaluation\n     * of the root expression of the expression path, applies the\n     * given predicates to it and then follows the given steps.\n     * All steps must have the axis \"child::\" or \"attribute::\"\n     * and a name test.  They can also optionally have predicates\n     * of type [@name\u003d...] or simply [...] interpreted as an index.\n     * @param context evaluation context\n     * @param root root pointer\n     * @param predicates predicates corresponding to \u003ccode\u003esteps\u003c/code\u003e\n     * @param steps path steps\n     * @return NodePointer\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 106,col 65)",
        "(line 108,col 9)-(line 108,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.SimplePathInterpreter.doStep(org.apache.commons.jxpath.ri.EvalContext, org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.compiler.Step[], int)",
      "begin_line": 123,
      "end_line": 178,
      "comment": "\n     * Recursive evaluation of a path. The general plan is:\n     * Look at the current step,\n     * find nodes that match it,\n     * iterate over those nodes and\n     * for each of them call doStep again for subsequent steps.\n     * @param context evaluation context\n     * @param parent parent pointer\n     * @param steps path steps\n     * @param currentStep step number\n     * @return NodePointer\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 128,col 9)",
        "(line 130,col 9)-(line 133,col 9)",
        "(line 136,col 9)-(line 136,col 38)",
        "(line 138,col 9)-(line 138,col 39)",
        "(line 139,col 9)-(line 139,col 55)",
        "(line 152,col 9)-(line 165,col 9)",
        "(line 166,col 9)-(line 172,col 9)",
        "(line 173,col 9)-(line 177,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.SimplePathInterpreter.doStepNoPredicatesPropertyOwner(org.apache.commons.jxpath.ri.EvalContext, org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer, org.apache.commons.jxpath.ri.compiler.Step[], int)",
      "begin_line": 194,
      "end_line": 245,
      "comment": "\n     * We have a step that starts with a property owner (bean, map, etc) and has\n     * no predicates.  The name test of the step may map to a scalar property\n     * or to a collection.  If it is a collection, we should apply the tail of\n     * the path to each element until we find a match. If we don\u0027t find\n     * a perfect match, we should return the \"best quality\" pointer, which\n     * has the longest chain of steps mapping to existing nodes and the shortes\n     * tail of Null* pointers.\n     * @param context evaluation context\n     * @param parentPointer property owner pointer\n     * @param steps path steps\n     * @param currentStep step number\n     * @return NodePointer\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 39)",
        "(line 198,col 9)-(line 199,col 59)",
        "(line 201,col 9)-(line 203,col 9)",
        "(line 204,col 9)-(line 211,col 9)",
        "(line 212,col 9)-(line 215,col 9)",
        "(line 216,col 9)-(line 242,col 9)",
        "(line 244,col 9)-(line 244,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.SimplePathInterpreter.doStepNoPredicatesStandard(org.apache.commons.jxpath.ri.EvalContext, org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.compiler.Step[], int)",
      "begin_line": 260,
      "end_line": 293,
      "comment": "\n     * A path that starts with a standard InfoSet node (e.g. DOM Node) and\n     * has no predicates.  Get a child iterator and apply the tail of\n     * the path to each element until we find a match. If we don\u0027t find\n     * a perfect match, we should return the \"best quality\" pointer, which\n     * has the longest chain of steps mapping to existing nodes and the shortes\n     * tail of Null* pointers.\n     * @param context evaluation context\n     * @param parentPointer parent pointer\n     * @param steps path steps\n     * @param currentStep step number\n     * @return NodePointer\n     ",
      "child_ranges": [
        "(line 263,col 9)-(line 263,col 39)",
        "(line 265,col 9)-(line 267,col 9)",
        "(line 269,col 9)-(line 269,col 28)",
        "(line 270,col 9)-(line 270,col 37)",
        "(line 271,col 9)-(line 271,col 72)",
        "(line 272,col 9)-(line 290,col 9)",
        "(line 291,col 9)-(line 292,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.SimplePathInterpreter.doStepPredicatesPropertyOwner(org.apache.commons.jxpath.ri.EvalContext, org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer, org.apache.commons.jxpath.ri.compiler.Step[], int)",
      "begin_line": 305,
      "end_line": 330,
      "comment": "\n     * A path that starts with a property owner. The method evaluates\n     * the first predicate in a special way and then forwards to\n     * a general predicate processing method.\n     * @param context evaluation context\n     * @param parentPointer parent pointer\n     * @param steps path steps\n     * @param currentStep step number\n     * @return NodePointer\n     ",
      "child_ranges": [
        "(line 308,col 9)-(line 308,col 39)",
        "(line 309,col 9)-(line 309,col 55)",
        "(line 311,col 9)-(line 312,col 59)",
        "(line 313,col 9)-(line 320,col 9)",
        "(line 323,col 9)-(line 329,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.SimplePathInterpreter.createChildPointerForStep(org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer, org.apache.commons.jxpath.ri.compiler.Step)",
      "begin_line": 338,
      "end_line": 357,
      "comment": "\n     * Create the child pointer for a given step.\n     * @param parentPointer parent pointer\n     * @param step associated step\n     * @return NodePointer\n     ",
      "child_ranges": [
        "(line 340,col 9)-(line 340,col 34)",
        "(line 341,col 9)-(line 355,col 9)",
        "(line 356,col 9)-(line 356,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.SimplePathInterpreter.doStepPredicatesStandard(org.apache.commons.jxpath.ri.EvalContext, org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.compiler.Step[], int)",
      "begin_line": 369,
      "end_line": 439,
      "comment": "\n     * A path that starts with a standard InfoSet node, e.g. a DOM Node.\n     * The method evaluates the first predicate in a special way and\n     * then forwards to a general predicate processing method.\n     * @param context evaluation context\n     * @param parent parent pointer\n     * @param steps path steps\n     * @param currentStep step number\n     * @return NodePointer\n     ",
      "child_ranges": [
        "(line 372,col 9)-(line 372,col 39)",
        "(line 373,col 9)-(line 373,col 55)",
        "(line 375,col 9)-(line 375,col 34)",
        "(line 376,col 9)-(line 384,col 9)",
        "(line 386,col 9)-(line 386,col 45)",
        "(line 393,col 9)-(line 437,col 9)",
        "(line 438,col 9)-(line 438,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.SimplePathInterpreter.doPredicate(org.apache.commons.jxpath.ri.EvalContext, org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.compiler.Step[], int, org.apache.commons.jxpath.ri.compiler.Expression[], int)",
      "begin_line": 452,
      "end_line": 478,
      "comment": "\n     * Evaluates predicates and proceeds with the subsequent steps\n     * of the path.\n     * @param context evaluation context\n     * @param parent parent pointer\n     * @param steps path steps\n     * @param currentStep step number\n     * @param predicates predicate expressions\n     * @param currentPredicate int predicate number\n     * @return NodePointer\n     ",
      "child_ranges": [
        "(line 456,col 9)-(line 458,col 9)",
        "(line 460,col 9)-(line 460,col 60)",
        "(line 461,col 9)-(line 469,col 9)",
        "(line 471,col 9)-(line 477,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.SimplePathInterpreter.doPredicateName(org.apache.commons.jxpath.ri.EvalContext, org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.compiler.Step[], int, org.apache.commons.jxpath.ri.compiler.Expression[], int)",
      "begin_line": 490,
      "end_line": 589,
      "comment": "\n     * Execute a NameAttributeTest predicate\n     * @param context evaluation context\n     * @param parent parent pointer\n     * @param steps path steps\n     * @param currentStep int step number\n     * @param predicates predicates\n     * @param currentPredicate int predicate number\n     * @return NodePointer\n     ",
      "child_ranges": [
        "(line 494,col 9)-(line 494,col 60)",
        "(line 495,col 9)-(line 495,col 58)",
        "(line 496,col 9)-(line 496,col 49)",
        "(line 497,col 9)-(line 580,col 9)",
        "(line 582,col 9)-(line 588,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.SimplePathInterpreter.doPredicatesStandard(org.apache.commons.jxpath.ri.EvalContext, java.util.List, org.apache.commons.jxpath.ri.compiler.Step[], int, org.apache.commons.jxpath.ri.compiler.Expression[], int)",
      "begin_line": 602,
      "end_line": 656,
      "comment": "\n     * Called exclusively for standard InfoSet nodes, e.g. DOM nodes\n     * to evaluate predicate sequences like [@name\u003d...][@name\u003d...][index].\n     * @param context evaluation context\n     * @param parents List of parent pointers\n     * @param steps path steps\n     * @param currentStep step number\n     * @param predicates predicates\n     * @param currentPredicate int predicate number\n     * @return NodePointer\n     ",
      "child_ranges": [
        "(line 606,col 9)-(line 608,col 9)",
        "(line 613,col 9)-(line 616,col 9)",
        "(line 618,col 9)-(line 618,col 60)",
        "(line 619,col 9)-(line 655,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.SimplePathInterpreter.doPredicateIndex(org.apache.commons.jxpath.ri.EvalContext, org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.compiler.Step[], int, org.apache.commons.jxpath.ri.compiler.Expression[], int)",
      "begin_line": 669,
      "end_line": 694,
      "comment": "\n     * Evaluate a subscript predicate: see if the node is a collection and\n     * if the index is inside the collection.\n     * @param context evaluation context\n     * @param parent parent pointer\n     * @param steps path steps\n     * @param currentStep step number\n     * @param predicates predicates\n     * @param currentPredicate int predicate number\n     * @return NodePointer\n     ",
      "child_ranges": [
        "(line 673,col 9)-(line 673,col 60)",
        "(line 674,col 9)-(line 674,col 59)",
        "(line 675,col 9)-(line 675,col 37)",
        "(line 676,col 9)-(line 686,col 9)",
        "(line 687,col 9)-(line 693,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.SimplePathInterpreter.indexFromPredicate(org.apache.commons.jxpath.ri.EvalContext, org.apache.commons.jxpath.ri.compiler.Expression)",
      "begin_line": 703,
      "end_line": 722,
      "comment": "\n     * Extract an integer from a subscript predicate. The returned index\n     * starts with 0, even though the subscript starts with 1.\n     * @param context evaluation context\n     * @param predicate to evaluate\n     * @return calculated index\n     ",
      "child_ranges": [
        "(line 706,col 9)-(line 706,col 55)",
        "(line 707,col 9)-(line 709,col 9)",
        "(line 710,col 9)-(line 712,col 9)",
        "(line 713,col 9)-(line 715,col 9)",
        "(line 717,col 9)-(line 720,col 9)",
        "(line 721,col 9)-(line 721,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.SimplePathInterpreter.keyFromPredicate(org.apache.commons.jxpath.ri.EvalContext, org.apache.commons.jxpath.ri.compiler.Expression)",
      "begin_line": 731,
      "end_line": 736,
      "comment": "\n     * Extracts the string value of the expression from a predicate like\n     * [@name\u003dexpression].\n     * @param context evaluation context\n     * @param predicate predicate to evaluate\n     * @return String key extracted\n     ",
      "child_ranges": [
        "(line 733,col 9)-(line 734,col 68)",
        "(line 735,col 9)-(line 735,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.SimplePathInterpreter.computeQuality(org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 745,
      "end_line": 752,
      "comment": "\n     * For a pointer that matches an actual node, returns 0.\n     * For a pointer that does not match an actual node, but whose\n     * parent pointer does returns -1, etc.\n     * @param pointer input pointer\n     * @return int match quality code\n     ",
      "child_ranges": [
        "(line 746,col 9)-(line 746,col 36)",
        "(line 747,col 9)-(line 750,col 9)",
        "(line 751,col 9)-(line 751,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.SimplePathInterpreter.isNameAttributeEqual(org.apache.commons.jxpath.ri.model.NodePointer, java.lang.String)",
      "begin_line": 761,
      "end_line": 768,
      "comment": "\n     * Returns true if the pointer has an attribute called \"name\" and\n     * its value is equal to the supplied string.\n     * @param pointer input pointer\n     * @param name name to check\n     * @return boolean\n     ",
      "child_ranges": [
        "(line 764,col 9)-(line 764,col 64)",
        "(line 765,col 9)-(line 767,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.SimplePathInterpreter.isCollectionElement(org.apache.commons.jxpath.ri.model.NodePointer, int)",
      "begin_line": 777,
      "end_line": 785,
      "comment": "\n     * Returns true if the pointer is a collection and the index is\n     * withing the bounds of the collection.\n     * @param pointer input pointer\n     * @param index to check\n     * @return boolean\n     ",
      "child_ranges": [
        "(line 780,col 9)-(line 784,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.SimplePathInterpreter.valuePointer(org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 793,
      "end_line": 795,
      "comment": "\n     * For an intermediate pointer (e.g. PropertyPointer, ContainerPointer)\n     * returns a pointer for the contained value.\n     * @param pointer input pointer\n     * @return NodePointer\n     ",
      "child_ranges": [
        "(line 794,col 9)-(line 794,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.SimplePathInterpreter.createNullPointer(org.apache.commons.jxpath.ri.EvalContext, org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.compiler.Step[], int)",
      "begin_line": 807,
      "end_line": 836,
      "comment": "\n     * Creates a \"null pointer\" that\n     * a) represents the requested path and\n     * b) can be used for creation of missing nodes in the path.\n     * @param context evaluation context\n     * @param parent parent pointer\n     * @param steps path steps\n     * @param currentStep step number\n     * @return NodePointer\n     ",
      "child_ranges": [
        "(line 810,col 9)-(line 812,col 9)",
        "(line 814,col 9)-(line 814,col 38)",
        "(line 816,col 9)-(line 816,col 39)",
        "(line 818,col 9)-(line 818,col 34)",
        "(line 819,col 9)-(line 825,col 9)",
        "(line 828,col 9)-(line 828,col 55)",
        "(line 829,col 9)-(line 835,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.SimplePathInterpreter.createNullPointerForPredicates(org.apache.commons.jxpath.ri.EvalContext, org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.compiler.Step[], int, org.apache.commons.jxpath.ri.compiler.Expression[], int)",
      "begin_line": 848,
      "end_line": 874,
      "comment": "\n     * Creates a \"null pointer\" that starts with predicates.\n     * @param context evaluation context\n     * @param parent parent pointer\n     * @param steps path steps\n     * @param currentStep step number\n     * @param predicates predicates\n     * @param currentPredicate int predicate number\n     * @return NodePointer\n     ",
      "child_ranges": [
        "(line 852,col 9)-(line 870,col 9)",
        "(line 872,col 9)-(line 873,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.SimplePathInterpreter.getNodeIterator(org.apache.commons.jxpath.ri.EvalContext, org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.compiler.Step)",
      "begin_line": 883,
      "end_line": 906,
      "comment": "\n     * Get a NodeIterator.\n     * @param context evaluation context\n     * @param pointer owning pointer\n     * @param step triggering step\n     * @return NodeIterator\n     ",
      "child_ranges": [
        "(line 887,col 9)-(line 897,col 9)",
        "(line 899,col 9)-(line 903,col 9)",
        "(line 904,col 9)-(line 905,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.SimplePathInterpreter.isLangAttribute(org.apache.commons.jxpath.ri.QName)",
      "begin_line": 913,
      "end_line": 917,
      "comment": "\n     * Learn whether \u003ccode\u003ename\u003c/code\u003e is a lang attribute.\n     * @param name to compare\n     * @return boolean\n     ",
      "child_ranges": [
        "(line 914,col 9)-(line 916,col 45)"
      ]
    }
  ]
}