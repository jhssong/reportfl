{
  "filepath": "/tmp/JxPath-1b/src/java/org/apache/commons/jxpath/ri/compiler/Expression.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Expression",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 39,
      "end_line": 144,
      "comment": "\n * Common superclass for several types of nodes in the parse tree. Provides\n * APIs for optimization of evaluation of expressions.  Specifically, an\n * expression only needs to executed once during the evaluation of an xpath\n * if that expression is context-independent.  Expression.isContextDependent()\n * provides that hint.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "ZERO"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ONE"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NOT_A_NUMBER"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "contextDependencyKnown"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "contextDependent"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.Expression.isContextDependent()",
      "begin_line": 52,
      "end_line": 58,
      "comment": "\n     * Returns true if this expression should be re-evaluated\n     * each time the current position in the context changes.\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 56,col 9)",
        "(line 57,col 9)-(line 57,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.Expression.computeContextDependent()",
      "begin_line": 63,
      "end_line": 63,
      "comment": "\n     * Implemented by subclasses and result is cached by isContextDependent()\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.Expression.computeValue(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 69,
      "end_line": 69,
      "comment": "\n     * Evaluates the expression. If the result is a node set, returns\n     * the first element of the node set.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.Expression.compute(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 70,
      "end_line": 70,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.Expression.iterate(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 72,
      "end_line": 78,
      "comment": "",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 41)",
        "(line 74,col 9)-(line 76,col 9)",
        "(line 77,col 9)-(line 77,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.Expression.iteratePointers(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 80,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 41)",
        "(line 82,col 9)-(line 84,col 9)",
        "(line 85,col 9)-(line 87,col 9)",
        "(line 88,col 9)-(line 90,col 78)"
      ]
    },
    {
      "type": "class_interface",
      "name": "PointerIterator",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator"
      ],
      "begin_line": 93,
      "end_line": 119,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "iterator"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "qname"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "locale"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator.PointerIterator(java.util.Iterator, org.apache.commons.jxpath.ri.QName, java.util.Locale)",
      "begin_line": 101,
      "end_line": 105,
      "comment": "\n         * @deprecated Use the method that takes a NamespaceManager\n         ",
      "child_ranges": [
        "(line 102,col 13)-(line 102,col 31)",
        "(line 103,col 13)-(line 103,col 31)",
        "(line 104,col 13)-(line 104,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator.hasNext()",
      "begin_line": 107,
      "end_line": 109,
      "comment": "",
      "child_ranges": [
        "(line 108,col 13)-(line 108,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator.next()",
      "begin_line": 111,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 112,col 13)-(line 112,col 39)",
        "(line 113,col 13)-(line 113,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator.remove()",
      "begin_line": 116,
      "end_line": 118,
      "comment": "",
      "child_ranges": [
        "(line 117,col 13)-(line 117,col 54)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ValueIterator",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator"
      ],
      "begin_line": 121,
      "end_line": 143,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "iterator"
      ],
      "begin_line": 122,
      "end_line": 122,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator.ValueIterator(java.util.Iterator)",
      "begin_line": 124,
      "end_line": 126,
      "comment": "",
      "child_ranges": [
        "(line 125,col 13)-(line 125,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator.hasNext()",
      "begin_line": 128,
      "end_line": 130,
      "comment": "",
      "child_ranges": [
        "(line 129,col 13)-(line 129,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator.next()",
      "begin_line": 132,
      "end_line": 138,
      "comment": "",
      "child_ranges": [
        "(line 133,col 13)-(line 133,col 39)",
        "(line 134,col 13)-(line 136,col 13)",
        "(line 137,col 13)-(line 137,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator.remove()",
      "begin_line": 140,
      "end_line": 142,
      "comment": "",
      "child_ranges": [
        "(line 141,col 13)-(line 141,col 54)"
      ]
    }
  ]
}