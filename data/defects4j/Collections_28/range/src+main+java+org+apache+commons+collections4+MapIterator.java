{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/MapIterator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MapIterator",
      "is_interface": true,
      "parent_types": [
        "java.util.Iterator\u003cK\u003e"
      ],
      "begin_line": 48,
      "end_line": 112,
      "comment": "\n * Defines an iterator that operates over a \u003ccode\u003eMap\u003c/code\u003e.\n * \u003cp\u003e\n * This iterator is a special version designed for maps. It can be more\n * efficient to use this rather than an entry set iterator where the option\n * is available, and it is certainly more convenient.\n * \u003cp\u003e\n * A map that provides this interface may not hold the data internally using\n * Map Entry objects, thus this interface can avoid lots of object creation.\n * \u003cp\u003e\n * In use, this iterator iterates through the keys in the map. After each call\n * to \u003ccode\u003enext()\u003c/code\u003e, the \u003ccode\u003egetValue()\u003c/code\u003e method provides direct\n * access to the value. The value can also be set using \u003ccode\u003esetValue()\u003c/code\u003e.\n * \u003cpre\u003e\n * MapIterator\u003cString,Integer\u003e it \u003d map.mapIterator();\n * while (it.hasNext()) {\n *   String key \u003d it.next();\n *   Integer value \u003d it.getValue();\n *   it.setValue(value + 1);\n * }\n * \u003c/pre\u003e\n *\n * @param \u003cK\u003e the type of the keys in the map\n * @param \u003cV\u003e the type of the values in the map\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapIterator.hasNext()",
      "begin_line": 55,
      "end_line": 56,
      "comment": "\n     * Checks to see if there are more entries still to be iterated.\n     *\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the iterator has more elements\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapIterator.next()",
      "begin_line": 64,
      "end_line": 65,
      "comment": "\n     * Gets the next \u003cem\u003ekey\u003c/em\u003e from the \u003ccode\u003eMap\u003c/code\u003e.\n     *\n     * @return the next key in the iteration\n     * @throws java.util.NoSuchElementException if the iteration is finished\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapIterator.getKey()",
      "begin_line": 75,
      "end_line": 75,
      "comment": "\n     * Gets the current key, which is the key returned by the last call\n     * to \u003ccode\u003enext()\u003c/code\u003e.\n     *\n     * @return the current key\n     * @throws IllegalStateException if \u003ccode\u003enext()\u003c/code\u003e has not yet been called\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapIterator.getValue()",
      "begin_line": 84,
      "end_line": 84,
      "comment": "\n     * Gets the current value, which is the value associated with the last key\n     * returned by \u003ccode\u003enext()\u003c/code\u003e.\n     *\n     * @return the current value\n     * @throws IllegalStateException if \u003ccode\u003enext()\u003c/code\u003e has not yet been called\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapIterator.remove()",
      "begin_line": 97,
      "end_line": 98,
      "comment": "\n     * Removes the last returned key from the underlying \u003ccode\u003eMap\u003c/code\u003e (optional operation).\n     * \u003cp\u003e\n     * This method can be called once per call to \u003ccode\u003enext()\u003c/code\u003e.\n     *\n     * @throws UnsupportedOperationException if remove is not supported by the map\n     * @throws IllegalStateException if \u003ccode\u003enext()\u003c/code\u003e has not yet been called\n     * @throws IllegalStateException if \u003ccode\u003eremove()\u003c/code\u003e has already been called\n     *  since the last call to \u003ccode\u003enext()\u003c/code\u003e\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapIterator.setValue(V)",
      "begin_line": 110,
      "end_line": 110,
      "comment": "\n     * Sets the value associated with the current key (optional operation).\n     *\n     * @param value  the new value\n     * @return the previous value\n     * @throws UnsupportedOperationException if setValue is not supported by the map\n     * @throws IllegalStateException if \u003ccode\u003enext()\u003c/code\u003e has not yet been called\n     * @throws IllegalStateException if \u003ccode\u003eremove()\u003c/code\u003e has been called since the\n     *  last call to \u003ccode\u003enext()\u003c/code\u003e\n     ",
      "child_ranges": []
    }
  ]
}