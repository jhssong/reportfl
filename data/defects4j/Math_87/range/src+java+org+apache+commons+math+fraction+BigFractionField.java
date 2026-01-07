{
  "filepath": "/tmp/Math-87b/src/java/org/apache/commons/math/fraction/BigFractionField.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BigFractionField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.Field\u003corg.apache.commons.math.fraction.BigFraction\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 33,
      "end_line": 70,
      "comment": "\n * Representation of the fractional numbers  without any overflow field.\n * \u003cp\u003e\n * This class is a singleton.\n * \u003c/p\u003e\n * @see Fraction\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Serializable version identifier "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.BigFractionField.BigFractionField()",
      "begin_line": 42,
      "end_line": 43,
      "comment": " Private constructor for the singleton.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFractionField.getInstance()",
      "begin_line": 48,
      "end_line": 50,
      "comment": " Get the unique instance.\n     * @return the unique instance\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFractionField.getOne()",
      "begin_line": 53,
      "end_line": 55,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFractionField.getZero()",
      "begin_line": 58,
      "end_line": 60,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 32)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LazyHolder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 65,
      "end_line": 68,
      "comment": " Holder for the instance.\n     * \u003cp\u003eWe use here the Initialization On Demand Holder Idiom.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "INSTANCE"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " Cached field instance. "
    }
  ]
}