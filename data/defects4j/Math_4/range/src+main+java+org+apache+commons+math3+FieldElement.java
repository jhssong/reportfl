{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/FieldElement.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FieldElement",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 30,
      "end_line": 88,
      "comment": "\n * Interface representing \u003ca href\u003d\"http://mathworld.wolfram.com/Field.html\"\u003efield\u003c/a\u003e elements.\n * @param \u003cT\u003e the type of the field elements\n * @see Field\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.FieldElement.add(T)",
      "begin_line": 37,
      "end_line": 37,
      "comment": " Compute this + a.\n     * @param a element to add\n     * @return a new element representing this + a\n     * @throws NullArgumentException if {@code addend} is {@code null}.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.FieldElement.subtract(T)",
      "begin_line": 44,
      "end_line": 44,
      "comment": " Compute this - a.\n     * @param a element to subtract\n     * @return a new element representing this - a\n     * @throws NullArgumentException if {@code a} is {@code null}.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.FieldElement.negate()",
      "begin_line": 50,
      "end_line": 50,
      "comment": "\n     * Returns the additive inverse of {@code this} element.\n     * @return the opposite of {@code this}.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.FieldElement.multiply(int)",
      "begin_line": 60,
      "end_line": 60,
      "comment": " Compute n \u0026times; this. Multiplication by an integer number is defined\n     * as the following sum\n     * \u003ccenter\u003e\n     * n \u0026times; this \u003d \u0026sum;\u003csub\u003ei\u003d1\u003c/sub\u003e\u003csup\u003en\u003c/sup\u003e this.\n     * \u003c/center\u003e\n     * @param n Number of times {@code this} must be added to itself.\n     * @return A new element representing n \u0026times; this.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.FieldElement.multiply(T)",
      "begin_line": 67,
      "end_line": 67,
      "comment": " Compute this \u0026times; a.\n     * @param a element to multiply\n     * @return a new element representing this \u0026times; a\n     * @throws NullArgumentException if {@code a} is {@code null}.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.FieldElement.divide(T)",
      "begin_line": 75,
      "end_line": 75,
      "comment": " Compute this \u0026divide; a.\n     * @param a element to add\n     * @return a new element representing this \u0026divide; a\n     * @throws NullArgumentException if {@code a} is {@code null}.\n     * @throws MathArithmeticException if {@code a} is zero\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.FieldElement.reciprocal()",
      "begin_line": 82,
      "end_line": 82,
      "comment": "\n     * Returns the multiplicative inverse of {@code this} element.\n     * @return the inverse of {@code this}.\n     * @throws MathArithmeticException if {@code this} is zero\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.FieldElement.getField()",
      "begin_line": 87,
      "end_line": 87,
      "comment": " Get the {@link Field} to which the instance belongs.\n     * @return {@link Field} to which the instance belongs\n     ",
      "child_ranges": []
    }
  ]
}