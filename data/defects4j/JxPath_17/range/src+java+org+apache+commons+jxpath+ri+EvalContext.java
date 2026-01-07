{
  "filepath": "/tmp/JxPath-17b/src/java/org/apache/commons/jxpath/ri/EvalContext.java",
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
      "end_line": 394,
      "comment": "\n * An XPath evaluation context.\n *\n * When  evaluating a path, a chain of EvalContexts is created, each context in\n * the chain representing a step of the path. Subclasses of EvalContext\n * implement behavior of various XPath axes: \"child::\", \"parent::\" etc.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "parentContext"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " parent context "
    },
    {
      "type": "field",
      "varNames": [
        "rootContext"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " root context "
    },
    {
      "type": "field",
      "varNames": [
        "position"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " position "
    },
    {
      "type": "field",
      "varNames": [
        "startedSetIteration"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "done"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hasPerformedIteratorStep"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "pointerIterator"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.EvalContext(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 65,
      "end_line": 67,
      "comment": "\n     * Create a new EvalContext.\n     * @param parentContext parent context\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.getContextNodePointer()",
      "begin_line": 72,
      "end_line": 74,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.getJXPathContext()",
      "begin_line": 79,
      "end_line": 81,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.getPosition()",
      "begin_line": 86,
      "end_line": 88,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.getDocumentOrder()",
      "begin_line": 96,
      "end_line": 98,
      "comment": "\n     * Determines the document order for this context.\n     *\n     * @return 1 ascending order, -1 descending order,\n     *  0 - does not require ordering\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.isChildOrderingRequired()",
      "begin_line": 106,
      "end_line": 110,
      "comment": "\n     * Even if this context has the natural ordering and therefore does\n     * not require collecting and sorting all nodes prior to returning them,\n     * such operation may be required for any child context.\n     * @return boolean\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.hasNext()",
      "begin_line": 116,
      "end_line": 127,
      "comment": "\n     * Returns true if there are mode nodes matching the context\u0027s constraints.\n     * @return boolean\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 119,col 9)",
        "(line 120,col 9)-(line 122,col 9)",
        "(line 123,col 9)-(line 125,col 9)",
        "(line 126,col 9)-(line 126,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.next()",
      "begin_line": 133,
      "end_line": 152,
      "comment": "\n     * Returns the next node pointer in the context\n     * @return Object\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 136,col 9)",
        "(line 138,col 9)-(line 143,col 9)",
        "(line 144,col 9)-(line 146,col 9)",
        "(line 147,col 9)-(line 149,col 9)",
        "(line 150,col 9)-(line 150,col 41)",
        "(line 151,col 9)-(line 151,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.performIteratorStep()",
      "begin_line": 157,
      "end_line": 171,
      "comment": "\n     * Moves the iterator forward by one position\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 20)",
        "(line 159,col 9)-(line 169,col 9)",
        "(line 170,col 9)-(line 170,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.remove()",
      "begin_line": 177,
      "end_line": 180,
      "comment": "\n     * Operation is not supported\n     * @throws UnsupportedOperationException\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 179,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.constructIterator()",
      "begin_line": 186,
      "end_line": 206,
      "comment": "\n     * Construct an iterator.\n     * @return whether the Iterator was constructed\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 36)",
        "(line 188,col 9)-(line 188,col 41)",
        "(line 189,col 9)-(line 197,col 9)",
        "(line 198,col 9)-(line 200,col 9)",
        "(line 202,col 9)-(line 202,col 27)",
        "(line 204,col 9)-(line 204,col 42)",
        "(line 205,col 9)-(line 205,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.sortPointers(java.util.List)",
      "begin_line": 212,
      "end_line": 222,
      "comment": "\n     * Sort a list of pointers based on document order.\n     * @param l the list to sort.\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 221,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.getContextNodeList()",
      "begin_line": 229,
      "end_line": 245,
      "comment": "\n     * Returns the list of all Pointers in this context for the current\n     * position of the parent context.\n     * @return List\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 27)",
        "(line 231,col 9)-(line 233,col 9)",
        "(line 234,col 9)-(line 234,col 36)",
        "(line 235,col 9)-(line 237,col 9)",
        "(line 238,col 9)-(line 243,col 9)",
        "(line 244,col 9)-(line 244,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.getNodeSet()",
      "begin_line": 253,
      "end_line": 268,
      "comment": "\n     * Returns the list of all Pointers in this context for all positions\n     * of the parent contexts.  If there was an ongoing iteration over\n     * this context, the method should not be called.\n     * @return NodeSet\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 259,col 9)",
        "(line 260,col 9)-(line 260,col 46)",
        "(line 261,col 9)-(line 265,col 9)",
        "(line 267,col 9)-(line 267,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.getValue()",
      "begin_line": 276,
      "end_line": 278,
      "comment": "\n     * Typically returns the NodeSet by calling getNodeSet(),\n     * but will be overridden for contexts that more naturally produce\n     * individual values, e.g. VariableContext\n     * @return Object\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.toString()",
      "begin_line": 283,
      "end_line": 287,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 284,col 9)-(line 284,col 46)",
        "(line 285,col 9)-(line 286,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.getRootContext()",
      "begin_line": 294,
      "end_line": 299,
      "comment": "\n     * Returns the root context of the path, which provides easy\n     * access to variables and functions.\n     * @return RootContext\n     ",
      "child_ranges": [
        "(line 295,col 9)-(line 297,col 9)",
        "(line 298,col 9)-(line 298,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.reset()",
      "begin_line": 304,
      "end_line": 306,
      "comment": "\n     * Sets current position \u003d 0, which is the pre-iteration state.\n     ",
      "child_ranges": [
        "(line 305,col 9)-(line 305,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.getCurrentPosition()",
      "begin_line": 312,
      "end_line": 314,
      "comment": "\n     * Get the current position.\n     * @return int position.\n     ",
      "child_ranges": [
        "(line 313,col 9)-(line 313,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.getSingleNodePointer()",
      "begin_line": 321,
      "end_line": 329,
      "comment": "\n     * Returns the first encountered Pointer that matches the current\n     * context\u0027s criteria.\n     * @return Pointer\n     ",
      "child_ranges": [
        "(line 322,col 9)-(line 322,col 16)",
        "(line 323,col 9)-(line 327,col 9)",
        "(line 328,col 9)-(line 328,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.getCurrentNodePointer()",
      "begin_line": 336,
      "end_line": 336,
      "comment": "\n     * Returns the current context node. Undefined before the beginning\n     * of the iteration.\n     * @return NodePoiner\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.nextSet()",
      "begin_line": 343,
      "end_line": 373,
      "comment": "\n     * Returns true if there is another sets of objects to interate over.\n     * Resets the current position and node.\n     * @return boolean\n     ",
      "child_ranges": [
        "(line 344,col 9)-(line 344,col 16)",
        "(line 349,col 9)-(line 357,col 9)",
        "(line 361,col 9)-(line 363,col 9)",
        "(line 367,col 9)-(line 371,col 9)",
        "(line 372,col 9)-(line 372,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.nextNode()",
      "begin_line": 380,
      "end_line": 380,
      "comment": "\n     * Returns true if there is another object in the current set.\n     * Switches the current position and node to the next object.\n     * @return boolean\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.setPosition(int)",
      "begin_line": 390,
      "end_line": 393,
      "comment": "\n     * Moves the current position to the specified index. Used with integer\n     * predicates to quickly get to the n\u0027th element of the node set.\n     * Returns false if the position is out of the node set range.\n     * You can call it with 0 as the position argument to restart the iteration.\n     * @param position to set\n     * @return boolean\n     ",
      "child_ranges": [
        "(line 391,col 9)-(line 391,col 33)",
        "(line 392,col 9)-(line 392,col 20)"
      ]
    }
  ]
}