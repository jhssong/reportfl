{
  "filepath": "/tmp/Lang-64b/src/java/org/apache/commons/lang/IllegalClassException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "IllegalClassException",
      "is_interface": false,
      "parent_types": [
        "java.lang.IllegalArgumentException"
      ],
      "begin_line": 44,
      "end_line": 102,
      "comment": "\n * \u003cp\u003eThrown when an object is an instance of an unexpected type (a class or interface).\n * This exception supplements the standard \u003ccode\u003eIllegalArgumentException\u003c/code\u003e\n * by providing a more semantically rich description of the problem.\u003c/p\u003e\n * \n * \u003cp\u003e\u003ccode\u003eIllegalClassException\u003c/code\u003e represents the case where a method takes\n * in a genericly typed parameter like Object (typically because it has to due to some\n * other interface it implements), but this implementation only actually accepts a specific\n * type, for example String. This exception would be used in place of\n * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e, yet it still extends it.\u003c/p\u003e\n * \n * \u003cpre\u003e\n * public void foo(Object obj) {\n *   if (obj instanceof String \u003d\u003d false) {\n *     throw new IllegalClassException(String.class, obj);\n *   }\n *   // do something with the string\n * }\n * \u003c/pre\u003e\n * \n * @author Matthew Hawthorne\n * @author Gary Gregory\n * @author Stephen Colebourne\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": "\n     * Required for serialization support.\n     * \n     * @see java.io.Serializable\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.IllegalClassException.IllegalClassException(java.lang.Class, java.lang.Object)",
      "begin_line": 60,
      "end_line": 66,
      "comment": "\n     * \u003cp\u003eInstantiates with the expected type, and actual object.\u003c/p\u003e\n     * \n     * @param expected  the expected type\n     * @param actual  the actual object\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 65,col 75)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.IllegalClassException.IllegalClassException(java.lang.Class, java.lang.Class)",
      "begin_line": 74,
      "end_line": 80,
      "comment": "\n     * \u003cp\u003eInstantiates with the expected and actual types.\u003c/p\u003e\n     * \n     * @param expected  the expected type\n     * @param actual  the actual type\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 79,col 44)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.IllegalClassException.IllegalClassException(java.lang.String)",
      "begin_line": 87,
      "end_line": 89,
      "comment": "\n     * \u003cp\u003eInstantiates with the specified message.\u003c/p\u003e\n     * \n     * @param message  the exception message\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.IllegalClassException.safeGetClassName(java.lang.Class)",
      "begin_line": 98,
      "end_line": 100,
      "comment": "\n     * \u003cp\u003eReturns the class name or \u003ccode\u003enull\u003c/code\u003e if the class is\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param cls  a \u003ccode\u003eClass\u003c/code\u003e\n     * @return the name of \u003ccode\u003ecls\u003c/code\u003e, or \u003ccode\u003enull\u003c/code\u003e if if \u003ccode\u003ecls\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 50)"
      ]
    }
  ]
}