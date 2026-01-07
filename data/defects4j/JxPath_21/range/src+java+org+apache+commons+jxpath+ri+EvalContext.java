{
  "filepath": "/tmp/JxPath-21b/src/java/org/apache/commons/jxpath/ri/EvalContext.java",
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
      "end_line": 382,
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
      "begin_line": 69,
      "end_line": 71,
      "comment": "",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.getJXPathContext()",
      "begin_line": 73,
      "end_line": 75,
      "comment": "",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.getPosition()",
      "begin_line": 77,
      "end_line": 79,
      "comment": "",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.getDocumentOrder()",
      "begin_line": 87,
      "end_line": 89,
      "comment": "\n     * Determines the document order for this context.\n     *\n     * @return 1 ascending order, -1 descending order,\n     *  0 - does not require ordering\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.isChildOrderingRequired()",
      "begin_line": 97,
      "end_line": 101,
      "comment": "\n     * Even if this context has the natural ordering and therefore does\n     * not require collecting and sorting all nodes prior to returning them,\n     * such operation may be required for any child context.\n     * @return boolean\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.hasNext()",
      "begin_line": 107,
      "end_line": 118,
      "comment": "\n     * Returns true if there are mode nodes matching the context\u0027s constraints.\n     * @return boolean\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 110,col 9)",
        "(line 111,col 9)-(line 113,col 9)",
        "(line 114,col 9)-(line 116,col 9)",
        "(line 117,col 9)-(line 117,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.next()",
      "begin_line": 124,
      "end_line": 143,
      "comment": "\n     * Returns the next node pointer in the context\n     * @return Object\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 127,col 9)",
        "(line 129,col 9)-(line 134,col 9)",
        "(line 135,col 9)-(line 137,col 9)",
        "(line 138,col 9)-(line 140,col 9)",
        "(line 141,col 9)-(line 141,col 41)",
        "(line 142,col 9)-(line 142,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.performIteratorStep()",
      "begin_line": 148,
      "end_line": 162,
      "comment": "\n     * Moves the iterator forward by one position\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 20)",
        "(line 150,col 9)-(line 160,col 9)",
        "(line 161,col 9)-(line 161,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.remove()",
      "begin_line": 168,
      "end_line": 171,
      "comment": "\n     * Operation is not supported\n     * @throws UnsupportedOperationException\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 170,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.constructIterator()",
      "begin_line": 177,
      "end_line": 197,
      "comment": "\n     * Construct an iterator.\n     * @return whether the Iterator was constructed\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 36)",
        "(line 179,col 9)-(line 179,col 41)",
        "(line 180,col 9)-(line 188,col 9)",
        "(line 189,col 9)-(line 191,col 9)",
        "(line 193,col 9)-(line 193,col 27)",
        "(line 195,col 9)-(line 195,col 42)",
        "(line 196,col 9)-(line 196,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.sortPointers(java.util.List)",
      "begin_line": 203,
      "end_line": 213,
      "comment": "\n     * Sort a list of pointers based on document order.\n     * @param l the list to sort.\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 212,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.getContextNodeList()",
      "begin_line": 220,
      "end_line": 236,
      "comment": "\n     * Returns the list of all Pointers in this context for the current\n     * position of the parent context.\n     * @return List\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 27)",
        "(line 222,col 9)-(line 224,col 9)",
        "(line 225,col 9)-(line 225,col 36)",
        "(line 226,col 9)-(line 228,col 9)",
        "(line 229,col 9)-(line 234,col 9)",
        "(line 235,col 9)-(line 235,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.getNodeSet()",
      "begin_line": 244,
      "end_line": 259,
      "comment": "\n     * Returns the list of all Pointers in this context for all positions\n     * of the parent contexts.  If there was an ongoing iteration over\n     * this context, the method should not be called.\n     * @return NodeSet\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 250,col 9)",
        "(line 251,col 9)-(line 251,col 46)",
        "(line 252,col 9)-(line 256,col 9)",
        "(line 258,col 9)-(line 258,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.getValue()",
      "begin_line": 267,
      "end_line": 269,
      "comment": "\n     * Typically returns the NodeSet by calling getNodeSet(),\n     * but will be overridden for contexts that more naturally produce\n     * individual values, e.g. VariableContext\n     * @return Object\n     ",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.toString()",
      "begin_line": 271,
      "end_line": 275,
      "comment": "",
      "child_ranges": [
        "(line 272,col 9)-(line 272,col 46)",
        "(line 273,col 9)-(line 274,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.getRootContext()",
      "begin_line": 282,
      "end_line": 287,
      "comment": "\n     * Returns the root context of the path, which provides easy\n     * access to variables and functions.\n     * @return RootContext\n     ",
      "child_ranges": [
        "(line 283,col 9)-(line 285,col 9)",
        "(line 286,col 9)-(line 286,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.reset()",
      "begin_line": 292,
      "end_line": 294,
      "comment": "\n     * Sets current position \u003d 0, which is the pre-iteration state.\n     ",
      "child_ranges": [
        "(line 293,col 9)-(line 293,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.getCurrentPosition()",
      "begin_line": 300,
      "end_line": 302,
      "comment": "\n     * Get the current position.\n     * @return int position.\n     ",
      "child_ranges": [
        "(line 301,col 9)-(line 301,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.getSingleNodePointer()",
      "begin_line": 309,
      "end_line": 317,
      "comment": "\n     * Returns the first encountered Pointer that matches the current\n     * context\u0027s criteria.\n     * @return Pointer\n     ",
      "child_ranges": [
        "(line 310,col 9)-(line 310,col 16)",
        "(line 311,col 9)-(line 315,col 9)",
        "(line 316,col 9)-(line 316,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.getCurrentNodePointer()",
      "begin_line": 324,
      "end_line": 324,
      "comment": "\n     * Returns the current context node. Undefined before the beginning\n     * of the iteration.\n     * @return NodePoiner\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.nextSet()",
      "begin_line": 331,
      "end_line": 361,
      "comment": "\n     * Returns true if there is another sets of objects to interate over.\n     * Resets the current position and node.\n     * @return boolean\n     ",
      "child_ranges": [
        "(line 332,col 9)-(line 332,col 16)",
        "(line 337,col 9)-(line 345,col 9)",
        "(line 349,col 9)-(line 351,col 9)",
        "(line 355,col 9)-(line 359,col 9)",
        "(line 360,col 9)-(line 360,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.nextNode()",
      "begin_line": 368,
      "end_line": 368,
      "comment": "\n     * Returns true if there is another object in the current set.\n     * Switches the current position and node to the next object.\n     * @return boolean\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.EvalContext.setPosition(int)",
      "begin_line": 378,
      "end_line": 381,
      "comment": "\n     * Moves the current position to the specified index. Used with integer\n     * predicates to quickly get to the n\u0027th element of the node set.\n     * Returns false if the position is out of the node set range.\n     * You can call it with 0 as the position argument to restart the iteration.\n     * @param position to set\n     * @return boolean\n     ",
      "child_ranges": [
        "(line 379,col 9)-(line 379,col 33)",
        "(line 380,col 9)-(line 380,col 20)"
      ]
    }
  ]
}