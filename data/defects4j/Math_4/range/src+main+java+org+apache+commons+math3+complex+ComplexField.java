{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/complex/ComplexField.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ComplexField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.Field\u003corg.apache.commons.math3.complex.Complex\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 34,
      "end_line": 84,
      "comment": "\n * Representation of the complex numbers field.\n * \u003cp\u003e\n * This class is a singleton.\n * \u003c/p\u003e\n * @see Complex\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.complex.ComplexField.ComplexField()",
      "begin_line": 41,
      "end_line": 42,
      "comment": " Private constructor for the singleton.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.complex.ComplexField.getInstance()",
      "begin_line": 47,
      "end_line": 49,
      "comment": " Get the unique instance.\n     * @return the unique instance\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.complex.ComplexField.getOne()",
      "begin_line": 52,
      "end_line": 54,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.complex.ComplexField.getZero()",
      "begin_line": 57,
      "end_line": 59,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.complex.ComplexField.getRuntimeClass()",
      "begin_line": 62,
      "end_line": 64,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 29)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LazyHolder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 70,
      "end_line": 73,
      "comment": " Holder for the instance.\n     * \u003cp\u003eWe use here the Initialization On Demand Holder Idiom.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "INSTANCE"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " Cached field instance. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.complex.ComplexField.readResolve()",
      "begin_line": 79,
      "end_line": 82,
      "comment": " Handle deserialization of the singleton.\n     * @return the singleton instance\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 35)"
      ]
    }
  ]
}