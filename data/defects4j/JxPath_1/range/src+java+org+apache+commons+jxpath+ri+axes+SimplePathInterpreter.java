{
  "filepath": "/tmp/JxPath-1b/src/java/org/apache/commons/jxpath/ri/axes/SimplePathInterpreter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SimplePathInterpreter",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 51,
      "end_line": 843,
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
      "begin_line": 74,
      "end_line": 81,
      "comment": "\n     * Interpret a simple path that starts with the given root and\n     * follows the given steps. All steps must have the axis \"child::\"\n     * and a name test.  They can also optionally have predicates\n     * of type [@name\u003dexpression] or simply [expression] interpreted\n     * as an index.\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 62)",
        "(line 80,col 9)-(line 80,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.SimplePathInterpreter.interpretSimpleExpressionPath(org.apache.commons.jxpath.ri.EvalContext, org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.compiler.Expression[], org.apache.commons.jxpath.ri.compiler.Step[])",
      "begin_line": 92,
      "end_line": 102,
      "comment": "\n     * Interpret the steps of a simple expression path that\n     * starts with the given root, which is the result of evaluation\n     * of the root expression of the expression path, applies the\n     * given predicates to it and then follows the given steps.\n     * All steps must have the axis \"child::\" or \"attribute::\"\n     * and a name test.  They can also optionally have predicates\n     * of type [@name\u003d...] or simply [...] interpreted as an index.\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 99,col 65)",
        "(line 101,col 9)-(line 101,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.SimplePathInterpreter.doStep(org.apache.commons.jxpath.ri.EvalContext, org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.compiler.Step[], int)",
      "begin_line": 111,
      "end_line": 173,
      "comment": "\n     * Recursive evaluation of a path. The general plan is:\n     * Look at the current step,\n     * find nodes that match it,\n     * iterate over those nodes and\n     * for each of them call doStep again for subsequent steps.\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 117,col 9)",
        "(line 119,col 9)-(line 122,col 9)",
        "(line 125,col 9)-(line 125,col 38)",
        "(line 127,col 9)-(line 127,col 39)",
        "(line 128,col 9)-(line 128,col 55)",
        "(line 141,col 9)-(line 172,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.SimplePathInterpreter.doStepNoPredicatesPropertyOwner(org.apache.commons.jxpath.ri.EvalContext, org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer, org.apache.commons.jxpath.ri.compiler.Step[], int)",
      "begin_line": 184,
      "end_line": 235,
      "comment": "\n     * We have a step that starts with a property owner (bean, map, etc) and has\n     * no predicates.  The name test of the step may map to a scalar property\n     * or to a collection.  If it is a collection, we should apply the tail of\n     * the path to each element until we find a match. If we don\u0027t find\n     * a perfect match, we should return the \"best quality\" pointer, which\n     * has the longest chain of steps mapping to existing nodes and the shortes\n     * tail of Null* pointers.\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 39)",
        "(line 189,col 9)-(line 190,col 59)",
        "(line 192,col 9)-(line 234,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.SimplePathInterpreter.doStepNoPredicatesStandard(org.apache.commons.jxpath.ri.EvalContext, org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.compiler.Step[], int)",
      "begin_line": 245,
      "end_line": 284,
      "comment": "\n     * A path that starts with a standard InfoSet node (e.g. DOM Node) and\n     * has no predicates.  Get a child iterator and apply the tail of\n     * the path to each element until we find a match. If we don\u0027t find\n     * a perfect match, we should return the \"best quality\" pointer, which\n     * has the longest chain of steps mapping to existing nodes and the shortes\n     * tail of Null* pointers.\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 39)",
        "(line 251,col 9)-(line 253,col 9)",
        "(line 255,col 9)-(line 255,col 28)",
        "(line 256,col 9)-(line 256,col 37)",
        "(line 257,col 9)-(line 257,col 72)",
        "(line 258,col 9)-(line 276,col 9)",
        "(line 278,col 9)-(line 280,col 9)",
        "(line 282,col 9)-(line 283,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.SimplePathInterpreter.doStepPredicatesPropertyOwner(org.apache.commons.jxpath.ri.EvalContext, org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer, org.apache.commons.jxpath.ri.compiler.Step[], int)",
      "begin_line": 291,
      "end_line": 317,
      "comment": "\n     * A path that starts with a property owner. The method evaluates\n     * the first predicate in a special way and then forwards to\n     * a general predicate processing method.\n     ",
      "child_ranges": [
        "(line 295,col 9)-(line 295,col 39)",
        "(line 296,col 9)-(line 296,col 55)",
        "(line 298,col 9)-(line 299,col 59)",
        "(line 300,col 9)-(line 307,col 9)",
        "(line 310,col 9)-(line 316,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.SimplePathInterpreter.createChildPointerForStep(org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer, org.apache.commons.jxpath.ri.compiler.Step)",
      "begin_line": 319,
      "end_line": 340,
      "comment": "",
      "child_ranges": [
        "(line 322,col 9)-(line 322,col 34)",
        "(line 323,col 9)-(line 339,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.SimplePathInterpreter.doStepPredicatesStandard(org.apache.commons.jxpath.ri.EvalContext, org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.compiler.Step[], int)",
      "begin_line": 347,
      "end_line": 418,
      "comment": "\n     * A path that starts with a standard InfoSet node, e.g. a DOM Node.\n     * The method evaluates the first predicate in a special way and\n     * then forwards to a general predicate processing method.\n     ",
      "child_ranges": [
        "(line 351,col 9)-(line 351,col 39)",
        "(line 352,col 9)-(line 352,col 55)",
        "(line 354,col 9)-(line 354,col 34)",
        "(line 355,col 9)-(line 363,col 9)",
        "(line 365,col 9)-(line 365,col 45)",
        "(line 372,col 9)-(line 416,col 9)",
        "(line 417,col 9)-(line 417,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.SimplePathInterpreter.doPredicate(org.apache.commons.jxpath.ri.EvalContext, org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.compiler.Step[], int, org.apache.commons.jxpath.ri.compiler.Expression[], int)",
      "begin_line": 424,
      "end_line": 452,
      "comment": "\n     * Evaluates predicates and proceeds with the subsequent steps\n     * of the path.\n     ",
      "child_ranges": [
        "(line 429,col 9)-(line 431,col 9)",
        "(line 433,col 9)-(line 433,col 60)",
        "(line 434,col 9)-(line 451,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.SimplePathInterpreter.doPredicateName(org.apache.commons.jxpath.ri.EvalContext, org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.compiler.Step[], int, org.apache.commons.jxpath.ri.compiler.Expression[], int)",
      "begin_line": 454,
      "end_line": 554,
      "comment": "",
      "child_ranges": [
        "(line 459,col 9)-(line 459,col 60)",
        "(line 460,col 9)-(line 460,col 58)",
        "(line 461,col 9)-(line 461,col 49)",
        "(line 462,col 9)-(line 545,col 9)",
        "(line 547,col 9)-(line 553,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.SimplePathInterpreter.doPredicatesStandard(org.apache.commons.jxpath.ri.EvalContext, java.util.List, org.apache.commons.jxpath.ri.compiler.Step[], int, org.apache.commons.jxpath.ri.compiler.Expression[], int)",
      "begin_line": 560,
      "end_line": 615,
      "comment": "\n     * Called exclusively for standard InfoSet nodes, e.g. DOM nodes\n     * to evaluate predicate sequences like [@name\u003d...][@name\u003d...][index].\n     ",
      "child_ranges": [
        "(line 565,col 9)-(line 567,col 9)",
        "(line 572,col 9)-(line 575,col 9)",
        "(line 577,col 9)-(line 577,col 60)",
        "(line 578,col 9)-(line 614,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.SimplePathInterpreter.doPredicateIndex(org.apache.commons.jxpath.ri.EvalContext, org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.compiler.Step[], int, org.apache.commons.jxpath.ri.compiler.Expression[], int)",
      "begin_line": 621,
      "end_line": 647,
      "comment": "\n     * Evaluate a subscript predicate: see if the node is a collection and\n     * if the index is inside the collection\n     ",
      "child_ranges": [
        "(line 626,col 9)-(line 626,col 60)",
        "(line 627,col 9)-(line 627,col 59)",
        "(line 628,col 9)-(line 628,col 37)",
        "(line 629,col 9)-(line 639,col 9)",
        "(line 640,col 9)-(line 646,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.SimplePathInterpreter.indexFromPredicate(org.apache.commons.jxpath.ri.EvalContext, org.apache.commons.jxpath.ri.compiler.Expression)",
      "begin_line": 653,
      "end_line": 676,
      "comment": "\n     * Extract an integer from a subscript predicate. The returned index\n     * starts with 0, even though the subscript starts with 1.\n     ",
      "child_ranges": [
        "(line 657,col 9)-(line 657,col 55)",
        "(line 658,col 9)-(line 660,col 9)",
        "(line 661,col 9)-(line 663,col 9)",
        "(line 664,col 9)-(line 666,col 9)",
        "(line 668,col 9)-(line 673,col 9)",
        "(line 675,col 9)-(line 675,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.SimplePathInterpreter.keyFromPredicate(org.apache.commons.jxpath.ri.EvalContext, org.apache.commons.jxpath.ri.compiler.Expression)",
      "begin_line": 682,
      "end_line": 688,
      "comment": "\n     * Extracts the string value of the expression from a predicate like\n     * [@name\u003dexpression].\n     ",
      "child_ranges": [
        "(line 685,col 9)-(line 686,col 68)",
        "(line 687,col 9)-(line 687,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.SimplePathInterpreter.computeQuality(org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 695,
      "end_line": 702,
      "comment": "\n     * For a pointer that matches an actual node, returns 0.\n     * For a pointer that does not match an actual node, but whose\n     * parent pointer does returns -1, etc.\n     ",
      "child_ranges": [
        "(line 696,col 9)-(line 696,col 36)",
        "(line 697,col 9)-(line 700,col 9)",
        "(line 701,col 9)-(line 701,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.SimplePathInterpreter.isNameAttributeEqual(org.apache.commons.jxpath.ri.model.NodePointer, java.lang.String)",
      "begin_line": 708,
      "end_line": 716,
      "comment": "\n     * Returns true if the pointer has an attribute called \"name\" and\n     * its value is equal to the supplied string.\n     ",
      "child_ranges": [
        "(line 712,col 9)-(line 712,col 64)",
        "(line 713,col 9)-(line 715,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.SimplePathInterpreter.isCollectionElement(org.apache.commons.jxpath.ri.model.NodePointer, int)",
      "begin_line": 722,
      "end_line": 731,
      "comment": "\n     * Returns true if the pointer is a collection and the index is\n     * withing the bounds of the collection.\n     ",
      "child_ranges": [
        "(line 726,col 9)-(line 730,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.SimplePathInterpreter.valuePointer(org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 737,
      "end_line": 739,
      "comment": "\n     * For an intermediate pointer (e.g. PropertyPointer, ContainerPointer)\n     * returns a pointer for the contained value.\n     ",
      "child_ranges": [
        "(line 738,col 9)-(line 738,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.SimplePathInterpreter.createNullPointer(org.apache.commons.jxpath.ri.EvalContext, org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.compiler.Step[], int)",
      "begin_line": 746,
      "end_line": 776,
      "comment": "\n     * Creates a \"null pointer\" that\n     * a) represents the requested path and\n     * b) can be used for creation of missing nodes in the path.\n     ",
      "child_ranges": [
        "(line 750,col 9)-(line 752,col 9)",
        "(line 754,col 9)-(line 754,col 38)",
        "(line 756,col 9)-(line 756,col 39)",
        "(line 758,col 9)-(line 758,col 34)",
        "(line 759,col 9)-(line 765,col 9)",
        "(line 768,col 9)-(line 768,col 55)",
        "(line 769,col 9)-(line 775,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.SimplePathInterpreter.createNullPointerForPredicates(org.apache.commons.jxpath.ri.EvalContext, org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.compiler.Step[], int, org.apache.commons.jxpath.ri.compiler.Expression[], int)",
      "begin_line": 781,
      "end_line": 808,
      "comment": "\n     * Creates a \"null pointer\" that starts with predicates.\n     ",
      "child_ranges": [
        "(line 786,col 9)-(line 804,col 9)",
        "(line 806,col 9)-(line 807,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.SimplePathInterpreter.getNodeIterator(org.apache.commons.jxpath.ri.EvalContext, org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.compiler.Step)",
      "begin_line": 810,
      "end_line": 836,
      "comment": "",
      "child_ranges": [
        "(line 815,col 9)-(line 835,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.SimplePathInterpreter.isLangAttribute(org.apache.commons.jxpath.ri.QName)",
      "begin_line": 838,
      "end_line": 842,
      "comment": "",
      "child_ranges": [
        "(line 839,col 9)-(line 841,col 45)"
      ]
    }
  ]
}