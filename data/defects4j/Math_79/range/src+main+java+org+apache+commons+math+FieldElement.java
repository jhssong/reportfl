{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/FieldElement.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FieldElement",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 27,
      "end_line": 60,
      "comment": "\n * Interface representing \u003ca href\u003d\"http://mathworld.wolfram.com/Field.html\"\u003efield\u003c/a\u003e elements.\n * @param \u003cT\u003e the type of the field elements\n * @see Field\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.FieldElement.add(T)",
      "begin_line": 33,
      "end_line": 33,
      "comment": " Compute this + a.\n     * @param a element to add\n     * @return a new element representing this + a\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.FieldElement.subtract(T)",
      "begin_line": 39,
      "end_line": 39,
      "comment": " Compute this - a.\n     * @param a element to subtract\n     * @return a new element representing this - a\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.FieldElement.multiply(T)",
      "begin_line": 45,
      "end_line": 45,
      "comment": " Compute this \u0026times; a.\n     * @param a element to multiply\n     * @return a new element representing this \u0026times; a\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.FieldElement.divide(T)",
      "begin_line": 53,
      "end_line": 53,
      "comment": " Compute this \u0026divide; a.\n     * @param a element to add\n     * @return a new element representing this \u0026divide; a\n     * @exception ArithmeticException if a is the zero of the\n     * additive operation (i.e. additive identity)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.FieldElement.getField()",
      "begin_line": 58,
      "end_line": 58,
      "comment": " Get the {@link Field} to which the instance belongs.\n     * @return {@link Field} to which the instance belongs\n     ",
      "child_ranges": []
    }
  ]
}