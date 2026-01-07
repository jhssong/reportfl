{
  "filepath": "/tmp/JxPath-4b/src/java/org/apache/commons/jxpath/ri/compiler/Expression.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Expression",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 40,
      "end_line": 151,
      "comment": "\n * Common superclass for several types of nodes in the parse tree. Provides\n * APIs for optimization of evaluation of expressions.  Specifically, an\n * expression only needs to executed once during the evaluation of an xpath\n * if that expression is context-independent.  Expression.isContextDependent()\n * provides that hint.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "ZERO"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ONE"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NOT_A_NUMBER"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "contextDependencyKnown"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "contextDependent"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.Expression.isContextDependent()",
      "begin_line": 53,
      "end_line": 59,
      "comment": "\n     * Returns true if this expression should be re-evaluated\n     * each time the current position in the context changes.\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 57,col 9)",
        "(line 58,col 9)-(line 58,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.Expression.computeContextDependent()",
      "begin_line": 64,
      "end_line": 64,
      "comment": "\n     * Implemented by subclasses and result is cached by isContextDependent()\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.Expression.computeValue(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 70,
      "end_line": 70,
      "comment": "\n     * Evaluates the expression. If the result is a node set, returns\n     * the first element of the node set.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.Expression.compute(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 71,
      "end_line": 71,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.Expression.iterate(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 73,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 41)",
        "(line 75,col 9)-(line 77,col 9)",
        "(line 78,col 9)-(line 80,col 9)",
        "(line 81,col 9)-(line 81,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.Expression.iteratePointers(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 84,
      "end_line": 100,
      "comment": "",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 41)",
        "(line 86,col 9)-(line 88,col 9)",
        "(line 89,col 9)-(line 91,col 9)",
        "(line 92,col 9)-(line 96,col 9)",
        "(line 97,col 9)-(line 99,col 78)"
      ]
    },
    {
      "type": "class_interface",
      "name": "PointerIterator",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator"
      ],
      "begin_line": 102,
      "end_line": 129,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "iterator"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "qname"
      ],
      "begin_line": 104,
      "end_line": 104,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "locale"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator.PointerIterator(java.util.Iterator, org.apache.commons.jxpath.ri.QName, java.util.Locale)",
      "begin_line": 111,
      "end_line": 115,
      "comment": "\n         * @deprecated Use the method that takes a NamespaceManager\n         ",
      "child_ranges": [
        "(line 112,col 13)-(line 112,col 31)",
        "(line 113,col 13)-(line 113,col 31)",
        "(line 114,col 13)-(line 114,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator.hasNext()",
      "begin_line": 117,
      "end_line": 119,
      "comment": "",
      "child_ranges": [
        "(line 118,col 13)-(line 118,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator.next()",
      "begin_line": 121,
      "end_line": 124,
      "comment": "",
      "child_ranges": [
        "(line 122,col 13)-(line 122,col 39)",
        "(line 123,col 13)-(line 123,col 91)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator.remove()",
      "begin_line": 126,
      "end_line": 128,
      "comment": "",
      "child_ranges": [
        "(line 127,col 13)-(line 127,col 54)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ValueIterator",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator"
      ],
      "begin_line": 131,
      "end_line": 150,
      "comment": ""
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
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator.ValueIterator(java.util.Iterator)",
      "begin_line": 134,
      "end_line": 136,
      "comment": "",
      "child_ranges": [
        "(line 135,col 13)-(line 135,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator.hasNext()",
      "begin_line": 138,
      "end_line": 140,
      "comment": "",
      "child_ranges": [
        "(line 139,col 13)-(line 139,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator.next()",
      "begin_line": 142,
      "end_line": 145,
      "comment": "",
      "child_ranges": [
        "(line 143,col 13)-(line 143,col 39)",
        "(line 144,col 13)-(line 144,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator.remove()",
      "begin_line": 147,
      "end_line": 149,
      "comment": "",
      "child_ranges": [
        "(line 148,col 13)-(line 148,col 54)"
      ]
    }
  ]
}