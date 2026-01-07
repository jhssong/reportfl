{
  "filepath": "/tmp/Collections-27b/src/main/java/org/apache/commons/collections4/Equator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Equator",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 23,
      "end_line": 43,
      "comment": "\n * An equation function, which determines equality between objects of type T.\n * \u003cp\u003e\n * It is the functional sibling of {@link java.util.Comparator}; {@link Equator} is to\n * {@link Object} as {@link java.util.Comparator} is to {@link java.lang.Comparable}.\n *\n * @param \u003cT\u003e the types of object this {@link Equator} can evaluate.\n * @since 4.0\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.Equator.equate(T, T)",
      "begin_line": 31,
      "end_line": 31,
      "comment": "\n     * Evaluates the two arguments for their equality.\n     *\n     * @param o1 the first object to be equated.\n     * @param o2 the second object to be equated.\n     * @return whether the two objects are equal.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.Equator.hash(T)",
      "begin_line": 42,
      "end_line": 42,
      "comment": "\n     * Calculates the hash for the object, based on the method of equality used in the equate\n     * method. This is used for classes that delegate their {@link Object#equals(Object) equals(Object)} method to an\n     * Equator (and so must also delegate their {@link Object#hashCode() hashCode()} method), or for implementations\n     * of {@link org.apache.commons.collections4.map.HashedMap} that use an Equator for the key objects.\n     *\n     * @param o the object to calculate the hash for.\n     * @return the hash of the object.\n     ",
      "child_ranges": []
    }
  ]
}