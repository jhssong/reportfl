{
  "filepath": "/tmp/JxPath-15b/src/java/org/apache/commons/jxpath/ri/EvalContext.java",
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
      "end_line": 349,
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
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.EvalContext(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 55,
      "end_line": 57,
      "comment": "",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.getContextNodePointer()",
      "begin_line": 59,
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.getJXPathContext()",
      "begin_line": 63,
      "end_line": 65,
      "comment": "",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.getPosition()",
      "begin_line": 67,
      "end_line": 69,
      "comment": "",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.getDocumentOrder()",
      "begin_line": 77,
      "end_line": 79,
      "comment": "\n     * Determines the document order for this context.\n     *\n     * @return 1 ascending order, -1 descending order,\n     *  0 - does not require ordering\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.isChildOrderingRequired()",
      "begin_line": 86,
      "end_line": 90,
      "comment": "\n     * Even if this context has the natural ordering and therefore does\n     * not require collecting and sorting all nodes prior to returning them,\n     * such operation may be required for any child context.\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.hasNext()",
      "begin_line": 95,
      "end_line": 106,
      "comment": "\n     * Returns true if there are mode nodes matching the context\u0027s constraints.\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 98,col 9)",
        "(line 99,col 9)-(line 101,col 9)",
        "(line 102,col 9)-(line 104,col 9)",
        "(line 105,col 9)-(line 105,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.next()",
      "begin_line": 111,
      "end_line": 130,
      "comment": "\n     * Returns the next node pointer in the context\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 114,col 9)",
        "(line 116,col 9)-(line 121,col 9)",
        "(line 122,col 9)-(line 124,col 9)",
        "(line 125,col 9)-(line 127,col 9)",
        "(line 128,col 9)-(line 128,col 41)",
        "(line 129,col 9)-(line 129,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.performIteratorStep()",
      "begin_line": 135,
      "end_line": 149,
      "comment": "\n     * Moves the iterator forward by one position\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 20)",
        "(line 137,col 9)-(line 147,col 9)",
        "(line 148,col 9)-(line 148,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.remove()",
      "begin_line": 154,
      "end_line": 157,
      "comment": "\n     * Operation is not supported\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 156,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.constructIterator()",
      "begin_line": 159,
      "end_line": 179,
      "comment": "",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 36)",
        "(line 161,col 9)-(line 161,col 41)",
        "(line 162,col 9)-(line 170,col 9)",
        "(line 171,col 9)-(line 173,col 9)",
        "(line 175,col 9)-(line 175,col 27)",
        "(line 177,col 9)-(line 177,col 42)",
        "(line 178,col 9)-(line 178,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.sortPointers(java.util.List)",
      "begin_line": 185,
      "end_line": 194,
      "comment": "\n     * Sort a list of pointers based on document order.\n     * @param l the list to sort.\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 193,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.getContextNodeList()",
      "begin_line": 200,
      "end_line": 216,
      "comment": "\n     * Returns the list of all Pointers in this context for the current\n     * position of the parent context.\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 27)",
        "(line 202,col 9)-(line 204,col 9)",
        "(line 205,col 9)-(line 205,col 36)",
        "(line 206,col 9)-(line 208,col 9)",
        "(line 209,col 9)-(line 214,col 9)",
        "(line 215,col 9)-(line 215,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.getNodeSet()",
      "begin_line": 223,
      "end_line": 238,
      "comment": "\n     * Returns the list of all Pointers in this context for all positions\n     * of the parent contexts.  If there was an ongoing iteration over\n     * this context, the method should not be called.\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 229,col 9)",
        "(line 230,col 9)-(line 230,col 46)",
        "(line 231,col 9)-(line 235,col 9)",
        "(line 237,col 9)-(line 237,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.getValue()",
      "begin_line": 245,
      "end_line": 247,
      "comment": "\n     * Typically returns the NodeSet by calling getNodeSet(), \n     * but will be overridden for contexts that more naturally produce\n     * individual values, e.g. VariableContext\n     ",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.toString()",
      "begin_line": 249,
      "end_line": 253,
      "comment": "",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 46)",
        "(line 251,col 9)-(line 252,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.getRootContext()",
      "begin_line": 259,
      "end_line": 264,
      "comment": "\n     * Returns the root context of the path, which provides easy\n     * access to variables and functions.\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 262,col 9)",
        "(line 263,col 9)-(line 263,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.reset()",
      "begin_line": 269,
      "end_line": 271,
      "comment": "\n     * Sets current position \u003d 0, which is the pre-iteration state.\n     ",
      "child_ranges": [
        "(line 270,col 9)-(line 270,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.getCurrentPosition()",
      "begin_line": 273,
      "end_line": 275,
      "comment": "",
      "child_ranges": [
        "(line 274,col 9)-(line 274,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.getSingleNodePointer()",
      "begin_line": 281,
      "end_line": 289,
      "comment": "\n     * Returns the first encountered Pointer that matches the current\n     * context\u0027s criteria.\n     ",
      "child_ranges": [
        "(line 282,col 9)-(line 282,col 16)",
        "(line 283,col 9)-(line 287,col 9)",
        "(line 288,col 9)-(line 288,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.getCurrentNodePointer()",
      "begin_line": 295,
      "end_line": 295,
      "comment": "\n     * Returns the current context node. Undefined before the beginning\n     * of the iteration.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.nextSet()",
      "begin_line": 301,
      "end_line": 331,
      "comment": "\n     * Returns true if there is another sets of objects to interate over.\n     * Resets the current position and node.\n     ",
      "child_ranges": [
        "(line 302,col 9)-(line 302,col 16)",
        "(line 307,col 9)-(line 315,col 9)",
        "(line 319,col 9)-(line 321,col 9)",
        "(line 325,col 9)-(line 329,col 9)",
        "(line 330,col 9)-(line 330,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.nextNode()",
      "begin_line": 337,
      "end_line": 337,
      "comment": "\n     * Returns true if there is another object in the current set.\n     * Switches the current position and node to the next object.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.setPosition(int)",
      "begin_line": 345,
      "end_line": 348,
      "comment": "\n     * Moves the current position to the specified index. Used with integer\n     * predicates to quickly get to the n\u0027th element of the node set.\n     * Returns false if the position is out of the node set range.\n     * You can call it with 0 as the position argument to restart the iteration.\n     ",
      "child_ranges": [
        "(line 346,col 9)-(line 346,col 33)",
        "(line 347,col 9)-(line 347,col 20)"
      ]
    }
  ]
}