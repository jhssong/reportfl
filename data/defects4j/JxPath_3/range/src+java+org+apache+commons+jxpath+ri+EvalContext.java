{
  "filepath": "/tmp/JxPath-3b/src/java/org/apache/commons/jxpath/ri/EvalContext.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EvalContext",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ExpressionContext",
        "java.util.Iterator"
      ],
      "begin_line": 47,
      "end_line": 355,
      "comment": "\n * An XPath evaluation context.\n *\n * When  evaluating a path, a chain of EvalContexts is created, each context in\n * the chain representing a step of the path. Subclasses of EvalContext\n * implement behavior of various XPath axes: \"child::\", \"parent::\" etc.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "parentContext"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "rootContext"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "position"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "startedSetIteration"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "done"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hasPerformedIteratorStep"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "pointerIterator"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.EvalContext(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 56,
      "end_line": 58,
      "comment": "",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.getContextNodePointer()",
      "begin_line": 60,
      "end_line": 62,
      "comment": "",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.getJXPathContext()",
      "begin_line": 64,
      "end_line": 66,
      "comment": "",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.getPosition()",
      "begin_line": 68,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.getDocumentOrder()",
      "begin_line": 78,
      "end_line": 83,
      "comment": "\n     * Determines the document order for this context.\n     *\n     * @return 1 ascending order, -1 descending order,\n     *  0 - does not require ordering\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 81,col 9)",
        "(line 82,col 9)-(line 82,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.isChildOrderingRequired()",
      "begin_line": 90,
      "end_line": 97,
      "comment": "\n     * Even if this context has the natural ordering and therefore does\n     * not require collecting and sorting all nodes prior to returning them,\n     * such operation may be required for any child context.\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 95,col 9)",
        "(line 96,col 9)-(line 96,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.hasNext()",
      "begin_line": 102,
      "end_line": 116,
      "comment": "\n     * Returns true if there are mode nodes matching the context\u0027s constraints.\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 105,col 9)",
        "(line 107,col 9)-(line 115,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.next()",
      "begin_line": 121,
      "end_line": 142,
      "comment": "\n     * Returns the next node pointer in the context\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 124,col 9)",
        "(line 126,col 9)-(line 141,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.performIteratorStep()",
      "begin_line": 147,
      "end_line": 161,
      "comment": "\n     * Moves the iterator forward by one position\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 20)",
        "(line 149,col 9)-(line 159,col 9)",
        "(line 160,col 9)-(line 160,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.remove()",
      "begin_line": 166,
      "end_line": 169,
      "comment": "\n     * Operation is not supported\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 168,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.constructIterator()",
      "begin_line": 171,
      "end_line": 196,
      "comment": "",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 36)",
        "(line 173,col 9)-(line 173,col 41)",
        "(line 174,col 9)-(line 183,col 9)",
        "(line 184,col 9)-(line 186,col 9)",
        "(line 188,col 9)-(line 193,col 9)",
        "(line 194,col 9)-(line 194,col 42)",
        "(line 195,col 9)-(line 195,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.getContextNodeList()",
      "begin_line": 202,
      "end_line": 218,
      "comment": "\n     * Returns the list of all Pointers in this context for the current\n     * position of the parent context.\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 27)",
        "(line 204,col 9)-(line 206,col 9)",
        "(line 207,col 9)-(line 207,col 36)",
        "(line 208,col 9)-(line 210,col 9)",
        "(line 211,col 9)-(line 216,col 9)",
        "(line 217,col 9)-(line 217,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.getNodeSet()",
      "begin_line": 225,
      "end_line": 240,
      "comment": "\n     * Returns the list of all Pointers in this context for all positions\n     * of the parent contexts.  If there was an ongoing iteration over\n     * this context, the method should not be called.\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 231,col 9)",
        "(line 232,col 9)-(line 232,col 46)",
        "(line 233,col 9)-(line 237,col 9)",
        "(line 239,col 9)-(line 239,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.getValue()",
      "begin_line": 247,
      "end_line": 249,
      "comment": "\n     * Typically returns the NodeSet by calling getNodeSet(), \n     * but will be overridden for contexts that more naturally produce\n     * individual values, e.g. VariableContext\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.toString()",
      "begin_line": 251,
      "end_line": 259,
      "comment": "",
      "child_ranges": [
        "(line 252,col 9)-(line 252,col 46)",
        "(line 253,col 9)-(line 258,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.getRootContext()",
      "begin_line": 265,
      "end_line": 270,
      "comment": "\n     * Returns the root context of the path, which provides easy\n     * access to variables and functions.\n     ",
      "child_ranges": [
        "(line 266,col 9)-(line 268,col 9)",
        "(line 269,col 9)-(line 269,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.reset()",
      "begin_line": 275,
      "end_line": 277,
      "comment": "\n     * Sets current position \u003d 0, which is the pre-iteration state.\n     ",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.getCurrentPosition()",
      "begin_line": 279,
      "end_line": 281,
      "comment": "",
      "child_ranges": [
        "(line 280,col 9)-(line 280,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.getSingleNodePointer()",
      "begin_line": 287,
      "end_line": 295,
      "comment": "\n     * Returns the first encountered Pointer that matches the current\n     * context\u0027s criteria.\n     ",
      "child_ranges": [
        "(line 288,col 9)-(line 288,col 16)",
        "(line 289,col 9)-(line 293,col 9)",
        "(line 294,col 9)-(line 294,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.getCurrentNodePointer()",
      "begin_line": 301,
      "end_line": 301,
      "comment": "\n     * Returns the current context node. Undefined before the beginning\n     * of the iteration.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.nextSet()",
      "begin_line": 307,
      "end_line": 337,
      "comment": "\n     * Returns true if there is another sets of objects to interate over.\n     * Resets the current position and node.\n     ",
      "child_ranges": [
        "(line 308,col 9)-(line 308,col 16)",
        "(line 313,col 9)-(line 321,col 9)",
        "(line 325,col 9)-(line 327,col 9)",
        "(line 331,col 9)-(line 335,col 9)",
        "(line 336,col 9)-(line 336,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.nextNode()",
      "begin_line": 343,
      "end_line": 343,
      "comment": "\n     * Returns true if there is another object in the current set.\n     * Switches the current position and node to the next object.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.setPosition(int)",
      "begin_line": 351,
      "end_line": 354,
      "comment": "\n     * Moves the current position to the specified index. Used with integer\n     * predicates to quickly get to the n\u0027th element of the node set.\n     * Returns false if the position is out of the node set range.\n     * You can call it with 0 as the position argument to restart the iteration.\n     ",
      "child_ranges": [
        "(line 352,col 9)-(line 352,col 33)",
        "(line 353,col 9)-(line 353,col 20)"
      ]
    }
  ]
}