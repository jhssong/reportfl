{
  "filepath": "/tmp/JxPath-14b/src/java/org/apache/commons/jxpath/ri/axes/SimplePathInterpreter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SimplePathInterpreter",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 51,
      "end_line": 821,
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
      "end_line": 167,
      "comment": "\n     * Recursive evaluation of a path. The general plan is:\n     * Look at the current step,\n     * find nodes that match it,\n     * iterate over those nodes and\n     * for each of them call doStep again for subsequent steps.\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 117,col 9)",
        "(line 119,col 9)-(line 122,col 9)",
        "(line 125,col 9)-(line 125,col 38)",
        "(line 127,col 9)-(line 127,col 39)",
        "(line 128,col 9)-(line 128,col 55)",
        "(line 141,col 9)-(line 154,col 9)",
        "(line 155,col 9)-(line 161,col 9)",
        "(line 162,col 9)-(line 166,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.SimplePathInterpreter.doStepNoPredicatesPropertyOwner(org.apache.commons.jxpath.ri.EvalContext, org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer, org.apache.commons.jxpath.ri.compiler.Step[], int)",
      "begin_line": 178,
      "end_line": 227,
      "comment": "\n     * We have a step that starts with a property owner (bean, map, etc) and has\n     * no predicates.  The name test of the step may map to a scalar property\n     * or to a collection.  If it is a collection, we should apply the tail of\n     * the path to each element until we find a match. If we don\u0027t find\n     * a perfect match, we should return the \"best quality\" pointer, which\n     * has the longest chain of steps mapping to existing nodes and the shortes\n     * tail of Null* pointers.\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 39)",
        "(line 183,col 9)-(line 184,col 59)",
        "(line 186,col 9)-(line 193,col 9)",
        "(line 194,col 9)-(line 197,col 9)",
        "(line 198,col 9)-(line 224,col 9)",
        "(line 226,col 9)-(line 226,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.SimplePathInterpreter.doStepNoPredicatesStandard(org.apache.commons.jxpath.ri.EvalContext, org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.compiler.Step[], int)",
      "begin_line": 237,
      "end_line": 271,
      "comment": "\n     * A path that starts with a standard InfoSet node (e.g. DOM Node) and\n     * has no predicates.  Get a child iterator and apply the tail of\n     * the path to each element until we find a match. If we don\u0027t find\n     * a perfect match, we should return the \"best quality\" pointer, which\n     * has the longest chain of steps mapping to existing nodes and the shortes\n     * tail of Null* pointers.\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 39)",
        "(line 243,col 9)-(line 245,col 9)",
        "(line 247,col 9)-(line 247,col 28)",
        "(line 248,col 9)-(line 248,col 37)",
        "(line 249,col 9)-(line 249,col 72)",
        "(line 250,col 9)-(line 268,col 9)",
        "(line 269,col 9)-(line 270,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.SimplePathInterpreter.doStepPredicatesPropertyOwner(org.apache.commons.jxpath.ri.EvalContext, org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer, org.apache.commons.jxpath.ri.compiler.Step[], int)",
      "begin_line": 278,
      "end_line": 304,
      "comment": "\n     * A path that starts with a property owner. The method evaluates\n     * the first predicate in a special way and then forwards to\n     * a general predicate processing method.\n     ",
      "child_ranges": [
        "(line 282,col 9)-(line 282,col 39)",
        "(line 283,col 9)-(line 283,col 55)",
        "(line 285,col 9)-(line 286,col 59)",
        "(line 287,col 9)-(line 294,col 9)",
        "(line 297,col 9)-(line 303,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.SimplePathInterpreter.createChildPointerForStep(org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer, org.apache.commons.jxpath.ri.compiler.Step)",
      "begin_line": 306,
      "end_line": 325,
      "comment": "",
      "child_ranges": [
        "(line 309,col 9)-(line 309,col 34)",
        "(line 310,col 9)-(line 323,col 9)",
        "(line 324,col 9)-(line 324,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.SimplePathInterpreter.doStepPredicatesStandard(org.apache.commons.jxpath.ri.EvalContext, org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.compiler.Step[], int)",
      "begin_line": 332,
      "end_line": 403,
      "comment": "\n     * A path that starts with a standard InfoSet node, e.g. a DOM Node.\n     * The method evaluates the first predicate in a special way and\n     * then forwards to a general predicate processing method.\n     ",
      "child_ranges": [
        "(line 336,col 9)-(line 336,col 39)",
        "(line 337,col 9)-(line 337,col 55)",
        "(line 339,col 9)-(line 339,col 34)",
        "(line 340,col 9)-(line 348,col 9)",
        "(line 350,col 9)-(line 350,col 45)",
        "(line 357,col 9)-(line 401,col 9)",
        "(line 402,col 9)-(line 402,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.SimplePathInterpreter.doPredicate(org.apache.commons.jxpath.ri.EvalContext, org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.compiler.Step[], int, org.apache.commons.jxpath.ri.compiler.Expression[], int)",
      "begin_line": 409,
      "end_line": 436,
      "comment": "\n     * Evaluates predicates and proceeds with the subsequent steps\n     * of the path.\n     ",
      "child_ranges": [
        "(line 414,col 9)-(line 416,col 9)",
        "(line 418,col 9)-(line 418,col 60)",
        "(line 419,col 9)-(line 427,col 9)",
        "(line 429,col 9)-(line 435,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.SimplePathInterpreter.doPredicateName(org.apache.commons.jxpath.ri.EvalContext, org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.compiler.Step[], int, org.apache.commons.jxpath.ri.compiler.Expression[], int)",
      "begin_line": 438,
      "end_line": 538,
      "comment": "",
      "child_ranges": [
        "(line 443,col 9)-(line 443,col 60)",
        "(line 444,col 9)-(line 444,col 58)",
        "(line 445,col 9)-(line 445,col 49)",
        "(line 446,col 9)-(line 529,col 9)",
        "(line 531,col 9)-(line 537,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.SimplePathInterpreter.doPredicatesStandard(org.apache.commons.jxpath.ri.EvalContext, java.util.List, org.apache.commons.jxpath.ri.compiler.Step[], int, org.apache.commons.jxpath.ri.compiler.Expression[], int)",
      "begin_line": 544,
      "end_line": 599,
      "comment": "\n     * Called exclusively for standard InfoSet nodes, e.g. DOM nodes\n     * to evaluate predicate sequences like [@name\u003d...][@name\u003d...][index].\n     ",
      "child_ranges": [
        "(line 549,col 9)-(line 551,col 9)",
        "(line 556,col 9)-(line 559,col 9)",
        "(line 561,col 9)-(line 561,col 60)",
        "(line 562,col 9)-(line 598,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.SimplePathInterpreter.doPredicateIndex(org.apache.commons.jxpath.ri.EvalContext, org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.compiler.Step[], int, org.apache.commons.jxpath.ri.compiler.Expression[], int)",
      "begin_line": 605,
      "end_line": 631,
      "comment": "\n     * Evaluate a subscript predicate: see if the node is a collection and\n     * if the index is inside the collection\n     ",
      "child_ranges": [
        "(line 610,col 9)-(line 610,col 60)",
        "(line 611,col 9)-(line 611,col 59)",
        "(line 612,col 9)-(line 612,col 37)",
        "(line 613,col 9)-(line 623,col 9)",
        "(line 624,col 9)-(line 630,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.SimplePathInterpreter.indexFromPredicate(org.apache.commons.jxpath.ri.EvalContext, org.apache.commons.jxpath.ri.compiler.Expression)",
      "begin_line": 637,
      "end_line": 656,
      "comment": "\n     * Extract an integer from a subscript predicate. The returned index\n     * starts with 0, even though the subscript starts with 1.\n     ",
      "child_ranges": [
        "(line 641,col 9)-(line 641,col 55)",
        "(line 642,col 9)-(line 644,col 9)",
        "(line 645,col 9)-(line 647,col 9)",
        "(line 648,col 9)-(line 650,col 9)",
        "(line 652,col 9)-(line 654,col 9)",
        "(line 655,col 9)-(line 655,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.SimplePathInterpreter.keyFromPredicate(org.apache.commons.jxpath.ri.EvalContext, org.apache.commons.jxpath.ri.compiler.Expression)",
      "begin_line": 662,
      "end_line": 668,
      "comment": "\n     * Extracts the string value of the expression from a predicate like\n     * [@name\u003dexpression].\n     ",
      "child_ranges": [
        "(line 665,col 9)-(line 666,col 68)",
        "(line 667,col 9)-(line 667,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.SimplePathInterpreter.computeQuality(org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 675,
      "end_line": 682,
      "comment": "\n     * For a pointer that matches an actual node, returns 0.\n     * For a pointer that does not match an actual node, but whose\n     * parent pointer does returns -1, etc.\n     ",
      "child_ranges": [
        "(line 676,col 9)-(line 676,col 36)",
        "(line 677,col 9)-(line 680,col 9)",
        "(line 681,col 9)-(line 681,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.SimplePathInterpreter.isNameAttributeEqual(org.apache.commons.jxpath.ri.model.NodePointer, java.lang.String)",
      "begin_line": 688,
      "end_line": 696,
      "comment": "\n     * Returns true if the pointer has an attribute called \"name\" and\n     * its value is equal to the supplied string.\n     ",
      "child_ranges": [
        "(line 692,col 9)-(line 692,col 64)",
        "(line 693,col 9)-(line 695,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.SimplePathInterpreter.isCollectionElement(org.apache.commons.jxpath.ri.model.NodePointer, int)",
      "begin_line": 702,
      "end_line": 711,
      "comment": "\n     * Returns true if the pointer is a collection and the index is\n     * withing the bounds of the collection.\n     ",
      "child_ranges": [
        "(line 706,col 9)-(line 710,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.SimplePathInterpreter.valuePointer(org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 717,
      "end_line": 719,
      "comment": "\n     * For an intermediate pointer (e.g. PropertyPointer, ContainerPointer)\n     * returns a pointer for the contained value.\n     ",
      "child_ranges": [
        "(line 718,col 9)-(line 718,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.SimplePathInterpreter.createNullPointer(org.apache.commons.jxpath.ri.EvalContext, org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.compiler.Step[], int)",
      "begin_line": 726,
      "end_line": 756,
      "comment": "\n     * Creates a \"null pointer\" that\n     * a) represents the requested path and\n     * b) can be used for creation of missing nodes in the path.\n     ",
      "child_ranges": [
        "(line 730,col 9)-(line 732,col 9)",
        "(line 734,col 9)-(line 734,col 38)",
        "(line 736,col 9)-(line 736,col 39)",
        "(line 738,col 9)-(line 738,col 34)",
        "(line 739,col 9)-(line 745,col 9)",
        "(line 748,col 9)-(line 748,col 55)",
        "(line 749,col 9)-(line 755,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.SimplePathInterpreter.createNullPointerForPredicates(org.apache.commons.jxpath.ri.EvalContext, org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.compiler.Step[], int, org.apache.commons.jxpath.ri.compiler.Expression[], int)",
      "begin_line": 761,
      "end_line": 788,
      "comment": "\n     * Creates a \"null pointer\" that starts with predicates.\n     ",
      "child_ranges": [
        "(line 766,col 9)-(line 784,col 9)",
        "(line 786,col 9)-(line 787,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.SimplePathInterpreter.getNodeIterator(org.apache.commons.jxpath.ri.EvalContext, org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.compiler.Step)",
      "begin_line": 790,
      "end_line": 814,
      "comment": "",
      "child_ranges": [
        "(line 795,col 9)-(line 805,col 9)",
        "(line 807,col 9)-(line 811,col 9)",
        "(line 812,col 9)-(line 813,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.SimplePathInterpreter.isLangAttribute(org.apache.commons.jxpath.ri.QName)",
      "begin_line": 816,
      "end_line": 820,
      "comment": "",
      "child_ranges": [
        "(line 817,col 9)-(line 819,col 45)"
      ]
    }
  ]
}