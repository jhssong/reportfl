{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/Field.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Field",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 29,
      "end_line": 59,
      "comment": "\n * Interface representing a \u003ca href\u003d\"http://mathworld.wolfram.com/Field.html\"\u003efield\u003c/a\u003e.\n * \u003cp\u003e\n * Classes implementing this interface will often be singletons.\n * \u003c/p\u003e\n * @param \u003cT\u003e the type of the field elements\n * @see FieldElement\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.Field.getZero()",
      "begin_line": 39,
      "end_line": 39,
      "comment": " Get the additive identity of the field.\n     * \u003cp\u003e\n     * The additive identity is the element e\u003csub\u003e0\u003c/sub\u003e of the field such that\n     * for all elements a of the field, the equalities a + e\u003csub\u003e0\u003c/sub\u003e \u003d\n     * e\u003csub\u003e0\u003c/sub\u003e + a \u003d a hold.\n     * \u003c/p\u003e\n     * @return additive identity of the field\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.Field.getOne()",
      "begin_line": 49,
      "end_line": 49,
      "comment": " Get the multiplicative identity of the field.\n     * \u003cp\u003e\n     * The multiplicative identity is the element e\u003csub\u003e1\u003c/sub\u003e of the field such that\n     * for all elements a of the field, the equalities a \u0026times; e\u003csub\u003e1\u003c/sub\u003e \u003d\n     * e\u003csub\u003e1\u003c/sub\u003e \u0026times; a \u003d a hold.\n     * \u003c/p\u003e\n     * @return multiplicative identity of the field\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.Field.getRuntimeClass()",
      "begin_line": 57,
      "end_line": 57,
      "comment": "\n     * Returns the runtime class of the FieldElement.\n     *\n     * @return The {@code Class} object that represents the runtime\n     *         class of this object.\n     ",
      "child_ranges": []
    }
  ]
}