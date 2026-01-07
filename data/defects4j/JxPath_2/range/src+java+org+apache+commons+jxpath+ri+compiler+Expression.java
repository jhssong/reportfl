{
  "filepath": "/tmp/JxPath-2b/src/java/org/apache/commons/jxpath/ri/compiler/Expression.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Expression",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 39,
      "end_line": 145,
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
      "end_line": 120,
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
      "begin_line": 102,
      "end_line": 106,
      "comment": "\n         * @deprecated Use the method that takes a NamespaceManager\n         ",
      "child_ranges": [
        "(line 103,col 13)-(line 103,col 31)",
        "(line 104,col 13)-(line 104,col 31)",
        "(line 105,col 13)-(line 105,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator.hasNext()",
      "begin_line": 108,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 109,col 13)-(line 109,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator.next()",
      "begin_line": 112,
      "end_line": 115,
      "comment": "",
      "child_ranges": [
        "(line 113,col 13)-(line 113,col 39)",
        "(line 114,col 13)-(line 114,col 91)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator.remove()",
      "begin_line": 117,
      "end_line": 119,
      "comment": "",
      "child_ranges": [
        "(line 118,col 13)-(line 118,col 54)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ValueIterator",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator"
      ],
      "begin_line": 122,
      "end_line": 144,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "iterator"
      ],
      "begin_line": 123,
      "end_line": 123,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator.ValueIterator(java.util.Iterator)",
      "begin_line": 125,
      "end_line": 127,
      "comment": "",
      "child_ranges": [
        "(line 126,col 13)-(line 126,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator.hasNext()",
      "begin_line": 129,
      "end_line": 131,
      "comment": "",
      "child_ranges": [
        "(line 130,col 13)-(line 130,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator.next()",
      "begin_line": 133,
      "end_line": 139,
      "comment": "",
      "child_ranges": [
        "(line 134,col 13)-(line 134,col 39)",
        "(line 135,col 13)-(line 137,col 13)",
        "(line 138,col 13)-(line 138,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator.remove()",
      "begin_line": 141,
      "end_line": 143,
      "comment": "",
      "child_ranges": [
        "(line 142,col 13)-(line 142,col 54)"
      ]
    }
  ]
}