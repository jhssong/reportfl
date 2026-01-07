{
  "filepath": "/tmp/JxPath-1b/src/java/org/apache/commons/jxpath/ri/EvalContext.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EvalContext",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ExpressionContext",
        "java.util.Iterator"
      ],
      "begin_line": 46,
      "end_line": 362,
      "comment": "\n * An XPath evaluation context.\n *\n * When  evaluating a path, a chain of EvalContexts is created, each context in\n * the chain representing a step of the path. Subclasses of EvalContext\n * implement behavior of various XPath axes: \"child::\", \"parent::\" etc.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "parentContext"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "rootContext"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "position"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "startedSetIteration"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "done"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hasPerformedIteratorStep"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "pointerIterator"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "REVERSE_COMPARATOR"
      ],
      "begin_line": 57,
      "end_line": 61,
      "comment": " interface."
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.Anonymous-d369a59b-703e-4878-a9b5-0a136650defa.compare(java.lang.Object, java.lang.Object)",
      "begin_line": 58,
      "end_line": 60,
      "comment": "",
      "child_ranges": [
        "(line 59,col 13)-(line 59,col 51)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.EvalContext(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 63,
      "end_line": 65,
      "comment": "",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.getContextNodePointer()",
      "begin_line": 67,
      "end_line": 69,
      "comment": "",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.getJXPathContext()",
      "begin_line": 71,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.getPosition()",
      "begin_line": 75,
      "end_line": 77,
      "comment": "",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.getDocumentOrder()",
      "begin_line": 85,
      "end_line": 90,
      "comment": "\n     * Determines the document order for this context.\n     *\n     * @return 1 ascending order, -1 descending order,\n     *  0 - does not require ordering\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 88,col 9)",
        "(line 89,col 9)-(line 89,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.isChildOrderingRequired()",
      "begin_line": 97,
      "end_line": 104,
      "comment": "\n     * Even if this context has the natural ordering and therefore does\n     * not require collecting and sorting all nodes prior to returning them,\n     * such operation may be required for any child context.\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 102,col 9)",
        "(line 103,col 9)-(line 103,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.hasNext()",
      "begin_line": 109,
      "end_line": 123,
      "comment": "\n     * Returns true if there are mode nodes matching the context\u0027s constraints.\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 112,col 9)",
        "(line 114,col 9)-(line 122,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.next()",
      "begin_line": 128,
      "end_line": 149,
      "comment": "\n     * Returns the next node pointer in the context\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 131,col 9)",
        "(line 133,col 9)-(line 148,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.performIteratorStep()",
      "begin_line": 154,
      "end_line": 168,
      "comment": "\n     * Moves the iterator forward by one position\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 20)",
        "(line 156,col 9)-(line 166,col 9)",
        "(line 167,col 9)-(line 167,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.remove()",
      "begin_line": 173,
      "end_line": 176,
      "comment": "\n     * Operation is not supported\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 175,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.constructIterator()",
      "begin_line": 178,
      "end_line": 203,
      "comment": "",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 36)",
        "(line 180,col 9)-(line 180,col 41)",
        "(line 181,col 9)-(line 190,col 9)",
        "(line 191,col 9)-(line 193,col 9)",
        "(line 195,col 9)-(line 200,col 9)",
        "(line 201,col 9)-(line 201,col 42)",
        "(line 202,col 9)-(line 202,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.getContextNodeList()",
      "begin_line": 209,
      "end_line": 225,
      "comment": "\n     * Returns the list of all Pointers in this context for the current\n     * position of the parent context.\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 27)",
        "(line 211,col 9)-(line 213,col 9)",
        "(line 214,col 9)-(line 214,col 36)",
        "(line 215,col 9)-(line 217,col 9)",
        "(line 218,col 9)-(line 223,col 9)",
        "(line 224,col 9)-(line 224,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.getNodeSet()",
      "begin_line": 232,
      "end_line": 247,
      "comment": "\n     * Returns the list of all Pointers in this context for all positions\n     * of the parent contexts.  If there was an ongoing iteration over\n     * this context, the method should not be called.\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 238,col 9)",
        "(line 239,col 9)-(line 239,col 46)",
        "(line 240,col 9)-(line 244,col 9)",
        "(line 246,col 9)-(line 246,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.getValue()",
      "begin_line": 254,
      "end_line": 256,
      "comment": "\n     * Typically returns the NodeSet by calling getNodeSet(), \n     * but will be overridden for contexts that more naturally produce\n     * individual values, e.g. VariableContext\n     ",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.toString()",
      "begin_line": 258,
      "end_line": 266,
      "comment": "",
      "child_ranges": [
        "(line 259,col 9)-(line 259,col 46)",
        "(line 260,col 9)-(line 265,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.getRootContext()",
      "begin_line": 272,
      "end_line": 277,
      "comment": "\n     * Returns the root context of the path, which provides easy\n     * access to variables and functions.\n     ",
      "child_ranges": [
        "(line 273,col 9)-(line 275,col 9)",
        "(line 276,col 9)-(line 276,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.reset()",
      "begin_line": 282,
      "end_line": 284,
      "comment": "\n     * Sets current position \u003d 0, which is the pre-iteration state.\n     ",
      "child_ranges": [
        "(line 283,col 9)-(line 283,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.getCurrentPosition()",
      "begin_line": 286,
      "end_line": 288,
      "comment": "",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.getSingleNodePointer()",
      "begin_line": 294,
      "end_line": 302,
      "comment": "\n     * Returns the first encountered Pointer that matches the current\n     * context\u0027s criteria.\n     ",
      "child_ranges": [
        "(line 295,col 9)-(line 295,col 16)",
        "(line 296,col 9)-(line 300,col 9)",
        "(line 301,col 9)-(line 301,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.getCurrentNodePointer()",
      "begin_line": 308,
      "end_line": 308,
      "comment": "\n     * Returns the current context node. Undefined before the beginning\n     * of the iteration.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.nextSet()",
      "begin_line": 314,
      "end_line": 344,
      "comment": "\n     * Returns true if there is another sets of objects to interate over.\n     * Resets the current position and node.\n     ",
      "child_ranges": [
        "(line 315,col 9)-(line 315,col 16)",
        "(line 320,col 9)-(line 328,col 9)",
        "(line 332,col 9)-(line 334,col 9)",
        "(line 338,col 9)-(line 342,col 9)",
        "(line 343,col 9)-(line 343,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.nextNode()",
      "begin_line": 350,
      "end_line": 350,
      "comment": "\n     * Returns true if there is another object in the current set.\n     * Switches the current position and node to the next object.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.setPosition(int)",
      "begin_line": 358,
      "end_line": 361,
      "comment": "\n     * Moves the current position to the specified index. Used with integer\n     * predicates to quickly get to the n\u0027th element of the node set.\n     * Returns false if the position is out of the node set range.\n     * You can call it with 0 as the position argument to restart the iteration.\n     ",
      "child_ranges": [
        "(line 359,col 9)-(line 359,col 33)",
        "(line 360,col 9)-(line 360,col 20)"
      ]
    }
  ]
}