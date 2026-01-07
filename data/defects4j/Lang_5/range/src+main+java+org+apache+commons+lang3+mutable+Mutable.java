{
  "filepath": "/tmp/Lang-5b/src/main/java/org/apache/commons/lang3/mutable/Mutable.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Mutable",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 33,
      "end_line": 54,
      "comment": "\n * Provides mutable access to a value.\n * \u003cp\u003e\n * \u003ccode\u003eMutable\u003c/code\u003e is used as a generic interface to the implementations in this package.\n * \u003cp\u003e\n * A typical use case would be to enable a primitive or string to be passed to a method and allow that method to\n * effectively change the value of the primitive/string. Another use case is to store a frequently changing primitive in\n * a collection (for example a total in a map) without needing to create new Integer/Long wrapper objects.\n * \n * @since 2.1\n * @param \u003cT\u003e the type to set and get \n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.Mutable.getValue()",
      "begin_line": 40,
      "end_line": 40,
      "comment": "\n     * Gets the value of this mutable.\n     * \n     * @return the stored value\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.Mutable.setValue(T)",
      "begin_line": 52,
      "end_line": 52,
      "comment": "\n     * Sets the value of this mutable.\n     * \n     * @param value\n     *            the value to store\n     * @throws NullPointerException\n     *             if the object is null and null is invalid\n     * @throws ClassCastException\n     *             if the type is invalid\n     ",
      "child_ranges": []
    }
  ]
}