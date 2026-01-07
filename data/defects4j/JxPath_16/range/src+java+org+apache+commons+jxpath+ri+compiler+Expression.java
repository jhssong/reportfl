{
  "filepath": "/tmp/JxPath-16b/src/java/org/apache/commons/jxpath/ri/compiler/Expression.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Expression",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 40,
      "end_line": 209,
      "comment": "\n * Common superclass for several types of nodes in the parse tree. Provides\n * APIs for optimization of evaluation of expressions.  Specifically, an\n * expression only needs to executed once during the evaluation of an xpath\n * if that expression is context-independent.  Expression.isContextDependent()\n * provides that hint.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "ZERO"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " zero "
    },
    {
      "type": "field",
      "varNames": [
        "ONE"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " one "
    },
    {
      "type": "field",
      "varNames": [
        "NOT_A_NUMBER"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " NaN "
    },
    {
      "type": "field",
      "varNames": [
        "contextDependencyKnown"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "contextDependent"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.Expression.isContextDependent()",
      "begin_line": 59,
      "end_line": 65,
      "comment": "\n     * Returns true if this expression should be re-evaluated\n     * each time the current position in the context changes.\n     * @return boolean\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 63,col 9)",
        "(line 64,col 9)-(line 64,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.Expression.computeContextDependent()",
      "begin_line": 71,
      "end_line": 71,
      "comment": "\n     * Implemented by subclasses and result is cached by isContextDependent()\n     * @return calculated context-dependentness as boolean\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.Expression.computeValue(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 79,
      "end_line": 79,
      "comment": "\n     * Evaluates the expression. If the result is a node set, returns\n     * the first element of the node set.\n     * @param context evaluation context\n     * @return Object\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.Expression.compute(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 87,
      "end_line": 87,
      "comment": "\n     * Evaluates the expression. If the result is a node set, returns\n     * the first element of the node set.\n     * @param context evaluation context\n     * @return Object\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.Expression.iterate(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 94,
      "end_line": 103,
      "comment": "\n     * Iterate over the values from the specified context.\n     * @param context evaluation context\n     * @return value Iterator\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 41)",
        "(line 96,col 9)-(line 98,col 9)",
        "(line 99,col 9)-(line 101,col 9)",
        "(line 102,col 9)-(line 102,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.Expression.iteratePointers(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 110,
      "end_line": 126,
      "comment": "\n     * Iterate over the pointers from the specified context.\n     * @param context evaluation context\n     * @return pointer Iterator\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 41)",
        "(line 112,col 9)-(line 114,col 9)",
        "(line 115,col 9)-(line 117,col 9)",
        "(line 118,col 9)-(line 122,col 9)",
        "(line 123,col 9)-(line 125,col 78)"
      ]
    },
    {
      "type": "class_interface",
      "name": "PointerIterator",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator"
      ],
      "begin_line": 131,
      "end_line": 171,
      "comment": "\n     * Pointer iterator\n     "
    },
    {
      "type": "field",
      "varNames": [
        "iterator"
      ],
      "begin_line": 132,
      "end_line": 132,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "qname"
      ],
      "begin_line": 133,
      "end_line": 133,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "locale"
      ],
      "begin_line": 134,
      "end_line": 134,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator.PointerIterator(java.util.Iterator, org.apache.commons.jxpath.ri.QName, java.util.Locale)",
      "begin_line": 144,
      "end_line": 148,
      "comment": "\n         * Create a new PointerIterator\n         * @param it underlying Iterator\n         * @param qname name\n         * @param locale Locale\n         * @deprecated Use the method that takes a NamespaceManager\n         ",
      "child_ranges": [
        "(line 145,col 13)-(line 145,col 31)",
        "(line 146,col 13)-(line 146,col 31)",
        "(line 147,col 13)-(line 147,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator.hasNext()",
      "begin_line": 153,
      "end_line": 155,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 154,col 13)-(line 154,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator.next()",
      "begin_line": 160,
      "end_line": 163,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 161,col 13)-(line 161,col 39)",
        "(line 162,col 13)-(line 162,col 91)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator.remove()",
      "begin_line": 168,
      "end_line": 170,
      "comment": "\n         * Unsupported.\n         ",
      "child_ranges": [
        "(line 169,col 13)-(line 169,col 54)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ValueIterator",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator"
      ],
      "begin_line": 176,
      "end_line": 208,
      "comment": "\n     * Value Iterator\n     "
    },
    {
      "type": "field",
      "varNames": [
        "iterator"
      ],
      "begin_line": 177,
      "end_line": 177,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator.ValueIterator(java.util.Iterator)",
      "begin_line": 183,
      "end_line": 185,
      "comment": "\n         * Create a new ValueIterator.\n         * @param it underlying Iterator, may contain pointers\n         ",
      "child_ranges": [
        "(line 184,col 13)-(line 184,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator.hasNext()",
      "begin_line": 190,
      "end_line": 192,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 191,col 13)-(line 191,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator.next()",
      "begin_line": 197,
      "end_line": 200,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 198,col 13)-(line 198,col 39)",
        "(line 199,col 13)-(line 199,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator.remove()",
      "begin_line": 205,
      "end_line": 207,
      "comment": "\n         * Unsupported.\n         ",
      "child_ranges": [
        "(line 206,col 13)-(line 206,col 54)"
      ]
    }
  ]
}