{
  "filepath": "/tmp/JxPath-3b/src/java/org/apache/commons/jxpath/ri/Compiler.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Compiler",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 48,
      "end_line": 316,
      "comment": "\n * The Compiler APIs are completely agnostic to the actual types of objects\n * produced and consumed by the APIs.  Arguments and return values are\n * declared as java.lang.Object.\n * \u003cp\u003e\n * Since  objects returned by Compiler methods are passed as arguments to other\n * Compiler methods, the descriptions of these methods use virtual types.  There\n * are four virtual object types: EXPRESSION, QNAME, STEP and NODE_TEST.\n * \u003cp\u003e\n * The following example illustrates this notion.  This sequence compiles\n * the xpath \"foo[round(1 div 2)]/text()\":\n * \u003cblockquote\u003e\u003cpre\u003e\n *      Object qname1 \u003d compiler.qname(null, \"foo\")\n *      Object expr1 \u003d compiler.number(\"1\");\n *      Object expr2 \u003d compiler.number(\"2\");\n *      Object expr3 \u003d compiler.div(expr1, expr2);\n *      Object expr4 \u003d compiler.\n *              coreFunction(Compiler.FUNCTION_ROUND, new Object[]{expr3});\n *      Object test1 \u003d compiler.nodeNameTest(qname1);\n *      Object step1 \u003d compiler.\n *              step(Compiler.AXIS_CHILD, test1, new Object[]{expr4});\n *      Object test2 \u003d compiler.nodeTypeTest(Compiler.NODE_TYPE_TEXT);\n *      Object step2 \u003d compiler.nodeTypeTest(Compiler.AXIS_CHILD, test2, null);\n *      Object expr5 \u003d compiler.locationPath(false, new Object[]{step1, step2});\n * \u003c/pre\u003e\u003c/blockquote\u003e\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "NODE_TYPE_NODE"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NODE_TYPE_TEXT"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NODE_TYPE_COMMENT"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NODE_TYPE_PI"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "AXIS_SELF"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "AXIS_CHILD"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "AXIS_PARENT"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "AXIS_ANCESTOR"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "AXIS_ATTRIBUTE"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "AXIS_NAMESPACE"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "AXIS_PRECEDING"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "AXIS_FOLLOWING"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "AXIS_DESCENDANT"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "AXIS_ANCESTOR_OR_SELF"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "AXIS_FOLLOWING_SIBLING"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "AXIS_PRECEDING_SIBLING"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "AXIS_DESCENDANT_OR_SELF"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FUNCTION_LAST"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FUNCTION_POSITION"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FUNCTION_COUNT"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FUNCTION_ID"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FUNCTION_LOCAL_NAME"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FUNCTION_NAMESPACE_URI"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FUNCTION_NAME"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FUNCTION_STRING"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FUNCTION_CONCAT"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FUNCTION_STARTS_WITH"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FUNCTION_CONTAINS"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FUNCTION_SUBSTRING_BEFORE"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FUNCTION_SUBSTRING_AFTER"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FUNCTION_SUBSTRING"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FUNCTION_STRING_LENGTH"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FUNCTION_NORMALIZE_SPACE"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FUNCTION_TRANSLATE"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FUNCTION_BOOLEAN"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FUNCTION_NOT"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FUNCTION_TRUE"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FUNCTION_FALSE"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FUNCTION_LANG"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FUNCTION_NUMBER"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FUNCTION_SUM"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FUNCTION_FLOOR"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FUNCTION_CEILING"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FUNCTION_ROUND"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FUNCTION_NULL"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FUNCTION_KEY"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FUNCTION_FORMAT_NUMBER"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.Compiler.number(java.lang.String)",
      "begin_line": 103,
      "end_line": 103,
      "comment": "\n     * Produces an EXPRESSION object that represents a numeric constant.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.Compiler.literal(java.lang.String)",
      "begin_line": 108,
      "end_line": 108,
      "comment": "\n     * Produces an EXPRESSION object that represents a string constant.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.Compiler.qname(java.lang.String, java.lang.String)",
      "begin_line": 113,
      "end_line": 113,
      "comment": "\n     * Produces an QNAME that represents a name with an optional prefix.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.Compiler.sum(java.lang.Object[])",
      "begin_line": 120,
      "end_line": 120,
      "comment": "\n     * Produces an EXPRESSION object representing the sum of all argumens\n     *\n     * @param arguments are EXPRESSION objects\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.Compiler.minus(java.lang.Object, java.lang.Object)",
      "begin_line": 128,
      "end_line": 128,
      "comment": "\n     * Produces an EXPRESSION object representing \u003ci\u003eleft\u003c/i\u003e minus \u003ci\u003eright\u003c/i\u003e\n     *\n     * @param left is an EXPRESSION object\n     * @param right is an EXPRESSION object\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.Compiler.multiply(java.lang.Object, java.lang.Object)",
      "begin_line": 137,
      "end_line": 137,
      "comment": "\n     * Produces  an EXPRESSION object representing \u003ci\u003eleft\u003c/i\u003e multiplied by\n     * \u003ci\u003eright\u003c/i\u003e\n     *\n     * @param left is an EXPRESSION object\n     * @param right is an EXPRESSION object\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.Compiler.divide(java.lang.Object, java.lang.Object)",
      "begin_line": 146,
      "end_line": 146,
      "comment": "\n     * Produces  an EXPRESSION object representing \u003ci\u003eleft\u003c/i\u003e divided by\n     * \u003ci\u003eright\u003c/i\u003e\n     *\n     * @param left is an EXPRESSION object\n     * @param right is an EXPRESSION object\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.Compiler.mod(java.lang.Object, java.lang.Object)",
      "begin_line": 155,
      "end_line": 155,
      "comment": "\n     * Produces  an EXPRESSION object representing \u003ci\u003eleft\u003c/i\u003e modulo\n     * \u003ci\u003eright\u003c/i\u003e\n     *\n     * @param left is an EXPRESSION object\n     * @param right is an EXPRESSION object\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.Compiler.lessThan(java.lang.Object, java.lang.Object)",
      "begin_line": 164,
      "end_line": 164,
      "comment": "\n     * Produces an EXPRESSION object representing the comparison:\n     * \u003ci\u003eleft\u003c/i\u003e less than \u003ci\u003eright\u003c/i\u003e\n     *\n     * @param left is an EXPRESSION object\n     * @param right is an EXPRESSION object\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.Compiler.lessThanOrEqual(java.lang.Object, java.lang.Object)",
      "begin_line": 173,
      "end_line": 173,
      "comment": "\n     * Produces an EXPRESSION object representing the comparison:\n     * \u003ci\u003eleft\u003c/i\u003e less than or equal to \u003ci\u003eright\u003c/i\u003e\n     *\n     * @param left is an EXPRESSION object\n     * @param right is an EXPRESSION object\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.Compiler.greaterThan(java.lang.Object, java.lang.Object)",
      "begin_line": 182,
      "end_line": 182,
      "comment": "\n     * Produces an EXPRESSION object representing the comparison:\n     * \u003ci\u003eleft\u003c/i\u003e greater than \u003ci\u003eright\u003c/i\u003e\n     *\n     * @param left is an EXPRESSION object\n     * @param right is an EXPRESSION object\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.Compiler.greaterThanOrEqual(java.lang.Object, java.lang.Object)",
      "begin_line": 191,
      "end_line": 191,
      "comment": "\n     * Produces an EXPRESSION object representing the comparison:\n     * \u003ci\u003eleft\u003c/i\u003e greater than or equal to \u003ci\u003eright\u003c/i\u003e\n     *\n     * @param left is an EXPRESSION object\n     * @param right is an EXPRESSION object\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.Compiler.equal(java.lang.Object, java.lang.Object)",
      "begin_line": 200,
      "end_line": 200,
      "comment": "\n     * Produces an EXPRESSION object representing the comparison:\n     * \u003ci\u003eleft\u003c/i\u003e equals to \u003ci\u003eright\u003c/i\u003e\n     *\n     * @param left is an EXPRESSION object\n     * @param right is an EXPRESSION object\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.Compiler.notEqual(java.lang.Object, java.lang.Object)",
      "begin_line": 209,
      "end_line": 209,
      "comment": "\n     * Produces an EXPRESSION object representing the comparison:\n     * \u003ci\u003eleft\u003c/i\u003e is not equal to \u003ci\u003eright\u003c/i\u003e\n     *\n     * @param left is an EXPRESSION object\n     * @param right is an EXPRESSION object\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.Compiler.minus(java.lang.Object)",
      "begin_line": 216,
      "end_line": 216,
      "comment": "\n     * Produces an EXPRESSION object representing unary negation of the argument\n     *\n     * @param argument is an EXPRESSION object\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.Compiler.variableReference(java.lang.Object)",
      "begin_line": 223,
      "end_line": 223,
      "comment": "\n     * Produces an EXPRESSION object representing variable reference\n     *\n     * @param qname is a QNAME object\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.Compiler.function(int, java.lang.Object[])",
      "begin_line": 232,
      "end_line": 232,
      "comment": "\n     * Produces an EXPRESSION object representing the computation of\n     * a core function with the supplied arguments.\n     *\n     * @param code is one of FUNCTION_... constants\n     * @param args are EXPRESSION objects\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.Compiler.function(java.lang.Object, java.lang.Object[])",
      "begin_line": 241,
      "end_line": 241,
      "comment": "\n     * Produces an EXPRESSION object representing the computation of\n     * a library function with the supplied arguments.\n     *\n     * @param name is a QNAME object (function name)\n     * @param args are EXPRESSION objects\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.Compiler.and(java.lang.Object[])",
      "begin_line": 249,
      "end_line": 249,
      "comment": "\n     * Produces an EXPRESSION object representing logical conjunction of\n     * all arguments\n     *\n     * @param arguments are EXPRESSION objects\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.Compiler.or(java.lang.Object[])",
      "begin_line": 257,
      "end_line": 257,
      "comment": "\n     * Produces an EXPRESSION object representing logical disjunction of\n     * all arguments\n     *\n     * @param arguments are EXPRESSION objects\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.Compiler.union(java.lang.Object[])",
      "begin_line": 264,
      "end_line": 264,
      "comment": "\n     * Produces an EXPRESSION object representing union of all node sets\n     *\n     * @param arguments are EXPRESSION objects\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.Compiler.nodeNameTest(java.lang.Object)",
      "begin_line": 271,
      "end_line": 271,
      "comment": "\n     * Produces a NODE_TEST object that represents a node name test.\n     *\n     * @param qname is a QNAME object\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.Compiler.nodeTypeTest(int)",
      "begin_line": 278,
      "end_line": 278,
      "comment": "\n     * Produces a NODE_TEST object that represents a node type test.\n     *\n     * @param qname is a QNAME object\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.Compiler.processingInstructionTest(java.lang.String)",
      "begin_line": 286,
      "end_line": 286,
      "comment": "\n     * Produces  a NODE_TEST object that represents a processing instruction\n     * test.\n     *\n     * @param qname is a QNAME object\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.Compiler.step(int, java.lang.Object, java.lang.Object[])",
      "begin_line": 295,
      "end_line": 295,
      "comment": "\n     * Produces a STEP object that represents a node test.\n     *\n     * @param axis is one of the AXIS_... constants\n     * @param nodeTest is a NODE_TEST object\n     * @param predicates are EXPRESSION objects\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.Compiler.locationPath(boolean, java.lang.Object[])",
      "begin_line": 303,
      "end_line": 303,
      "comment": "\n     * Produces an EXPRESSION object representing a location path\n     *\n     * @param absolute indicates whether the path is absolute\n     * @param steps are STEP objects\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.Compiler.expressionPath(java.lang.Object, java.lang.Object[], java.lang.Object[])",
      "begin_line": 312,
      "end_line": 315,
      "comment": "\n     * Produces an EXPRESSION object representing a filter expression\n     *\n     * @param expression is an EXPRESSION object\n     * @param predicates are EXPRESSION objects\n     * @param steps are STEP objects\n     ",
      "child_ranges": []
    }
  ]
}