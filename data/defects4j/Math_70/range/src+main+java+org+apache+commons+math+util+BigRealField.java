{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/util/BigRealField.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BigRealField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.Field\u003corg.apache.commons.math.util.BigReal\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 33,
      "end_line": 78,
      "comment": "\n * Representation of real numbers with arbitrary precision field.\n * \u003cp\u003e\n * This class is a singleton.\n * \u003c/p\u003e\n * @see BigReal\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " Serializable version identifier "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.BigRealField.BigRealField()",
      "begin_line": 40,
      "end_line": 41,
      "comment": " Private constructor for the singleton.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.BigRealField.getInstance()",
      "begin_line": 46,
      "end_line": 48,
      "comment": " Get the unique instance.\n     * @return the unique instance\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.BigRealField.getOne()",
      "begin_line": 51,
      "end_line": 53,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.BigRealField.getZero()",
      "begin_line": 56,
      "end_line": 58,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 28)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LazyHolder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 64,
      "end_line": 67,
      "comment": " Holder for the instance.\n     * \u003cp\u003eWe use here the Initialization On Demand Holder Idiom.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "INSTANCE"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " Cached field instance. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.BigRealField.readResolve()",
      "begin_line": 73,
      "end_line": 76,
      "comment": " Handle deserialization of the singleton.\n     * @return the singleton instance\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 35)"
      ]
    }
  ]
}