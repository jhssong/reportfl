{
  "filepath": "/tmp/Lang-33b/src/main/java/org/apache/commons/lang3/mutable/Mutable.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Mutable",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 34,
      "end_line": 55,
      "comment": "\n * Provides mutable access to a value.\n * \u003cp\u003e\n * \u003ccode\u003eMutable\u003c/code\u003e is used as a generic interface to the implementations in this package.\n * \u003cp\u003e\n * A typical use case would be to enable a primitive or string to be passed to a method and allow that method to\n * effectively change the value of the primitive/string. Another use case is to store a frequently changing primitive in\n * a collection (for example a total in a map) without needing to create new Integer/Long wrapper objects.\n * \n * @author Apache Software Foundation\n * @author Matthew Hawthorne\n * @since 2.1\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.Mutable.getValue()",
      "begin_line": 41,
      "end_line": 41,
      "comment": "\n     * Gets the value of this mutable.\n     * \n     * @return the stored value\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.Mutable.setValue(T)",
      "begin_line": 53,
      "end_line": 53,
      "comment": "\n     * Sets the value of this mutable.\n     * \n     * @param value\n     *            the value to store\n     * @throws NullPointerException\n     *             if the object is null and null is invalid\n     * @throws ClassCastException\n     *             if the type is invalid\n     ",
      "child_ranges": []
    }
  ]
}