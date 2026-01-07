{
  "filepath": "/tmp/Collections-25b/src/main/java/org/apache/commons/collections4/Bag.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Bag",
      "is_interface": true,
      "parent_types": [
        "java.util.Collection\u003cE\u003e"
      ],
      "begin_line": 45,
      "end_line": 221,
      "comment": "\n * Defines a collection that counts the number of times an object appears in\n * the collection.\n * \u003cp\u003e\n * Suppose you have a Bag that contains \u003ccode\u003e{a, a, b, c}\u003c/code\u003e.\n * Calling {@link #getCount(Object)} on \u003ccode\u003ea\u003c/code\u003e would return 2, while\n * calling {@link #uniqueSet()} would return \u003ccode\u003e{a, b, c}\u003c/code\u003e.\n * \u003cp\u003e\n * \u003ci\u003eNOTE: This interface violates the {@link Collection} contract.\u003c/i\u003e\n * The behavior specified in many of these methods is \u003ci\u003enot\u003c/i\u003e the same\n * as the behavior specified by \u003ccode\u003eCollection\u003c/code\u003e.\n * The noncompliant methods are clearly marked with \"(Violation)\".\n * Exercise caution when using a bag as a \u003ccode\u003eCollection\u003c/code\u003e.\n * \u003cp\u003e\n * This violation resulted from the original specification of this interface.\n * In an ideal world, the interface would be changed to fix the problems, however\n * it has been decided to maintain backwards compatibility instead.\n *\n * @param \u003cE\u003e the type held in the bag\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.Bag.getCount(java.lang.Object)",
      "begin_line": 55,
      "end_line": 55,
      "comment": "\n     * Returns the number of occurrences (cardinality) of the given\n     * object currently in the bag. If the object does not exist in the\n     * bag, return 0.\n     *\n     * @param object  the object to search for\n     * @return the number of occurrences of the object, zero if not found\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.Bag.add(E)",
      "begin_line": 73,
      "end_line": 73,
      "comment": "\n     * \u003ci\u003e(Violation)\u003c/i\u003e\n     * Adds one copy of the specified object to the Bag.\n     * \u003cp\u003e\n     * If the object is already in the {@link #uniqueSet()} then increment its\n     * count as reported by {@link #getCount(Object)}. Otherwise add it to the\n     * {@link #uniqueSet()} and report its count as 1.\n     * \u003cp\u003e\n     * Since this method always increases the size of the bag,\n     * according to the {@link Collection#add(Object)} contract, it\n     * should always return \u003ccode\u003etrue\u003c/code\u003e.  Since it sometimes returns\n     * \u003ccode\u003efalse\u003c/code\u003e, this method violates the contract.\n     *\n     * @param object  the object to add\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the object was not already in the \u003ccode\u003euniqueSet\u003c/code\u003e\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.Bag.add(E, int)",
      "begin_line": 86,
      "end_line": 86,
      "comment": "\n     * Adds \u003ccode\u003enCopies\u003c/code\u003e copies of the specified object to the Bag.\n     * \u003cp\u003e\n     * If the object is already in the {@link #uniqueSet()} then increment its\n     * count as reported by {@link #getCount(Object)}. Otherwise add it to the\n     * {@link #uniqueSet()} and report its count as \u003ccode\u003enCopies\u003c/code\u003e.\n     *\n     * @param object  the object to add\n     * @param nCopies  the number of copies to add\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the object was not already in the \u003ccode\u003euniqueSet\u003c/code\u003e\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.Bag.remove(java.lang.Object)",
      "begin_line": 101,
      "end_line": 101,
      "comment": "\n     * \u003ci\u003e(Violation)\u003c/i\u003e\n     * Removes all occurrences of the given object from the bag.\n     * \u003cp\u003e\n     * This will also remove the object from the {@link #uniqueSet()}.\n     * \u003cp\u003e\n     * According to the {@link Collection#remove(Object)} method,\n     * this method should only remove the \u003ci\u003efirst\u003c/i\u003e occurrence of the\n     * given object, not \u003ci\u003eall\u003c/i\u003e occurrences.\n     *\n     * @param object  the object to remove\n     * @return \u003ccode\u003etrue\u003c/code\u003e if this call changed the collection\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.Bag.remove(java.lang.Object, int)",
      "begin_line": 113,
      "end_line": 113,
      "comment": "\n     * Removes \u003ccode\u003enCopies\u003c/code\u003e copies of the specified object from the Bag.\n     * \u003cp\u003e\n     * If the number of copies to remove is greater than the actual number of\n     * copies in the Bag, no error is thrown.\n     *\n     * @param object  the object to remove\n     * @param nCopies  the number of copies to remove\n     * @return \u003ccode\u003etrue\u003c/code\u003e if this call changed the collection\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.Bag.uniqueSet()",
      "begin_line": 122,
      "end_line": 122,
      "comment": "\n     * Returns a {@link Set} of unique elements in the Bag.\n     * \u003cp\u003e\n     * Uniqueness constraints are the same as those in {@link java.util.Set}.\n     *\n     * @return the Set of unique Bag elements\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.Bag.size()",
      "begin_line": 129,
      "end_line": 129,
      "comment": "\n     * Returns the total number of items in the bag across all types.\n     *\n     * @return the total size of the Bag\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.Bag.containsAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 147,
      "end_line": 147,
      "comment": "\n     * \u003ci\u003e(Violation)\u003c/i\u003e\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the bag contains all elements in\n     * the given collection, respecting cardinality.  That is, if the\n     * given collection \u003ccode\u003ecoll\u003c/code\u003e contains \u003ccode\u003en\u003c/code\u003e copies\n     * of a given object, calling {@link #getCount(Object)} on that object must\n     * be \u003ccode\u003e\u0026gt;\u003d n\u003c/code\u003e for all \u003ccode\u003en\u003c/code\u003e in \u003ccode\u003ecoll\u003c/code\u003e.\n     * \u003cp\u003e\n     * The {@link Collection#containsAll(Collection)} method specifies\n     * that cardinality should \u003ci\u003enot\u003c/i\u003e be respected; this method should\n     * return true if the bag contains at least one of every object contained\n     * in the given collection.\n     *\n     * @param coll  the collection to check against\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the Bag contains all the collection\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.Bag.removeAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 165,
      "end_line": 165,
      "comment": "\n     * \u003ci\u003e(Violation)\u003c/i\u003e\n     * Remove all elements represented in the given collection,\n     * respecting cardinality.  That is, if the given collection\n     * \u003ccode\u003ecoll\u003c/code\u003e contains \u003ccode\u003en\u003c/code\u003e copies of a given object,\n     * the bag will have \u003ccode\u003en\u003c/code\u003e fewer copies, assuming the bag\n     * had at least \u003ccode\u003en\u003c/code\u003e copies to begin with.\n     *\n     * \u003cp\u003eThe {@link Collection#removeAll(Collection)} method specifies\n     * that cardinality should \u003ci\u003enot\u003c/i\u003e be respected; this method should\n     * remove \u003ci\u003eall\u003c/i\u003e occurrences of every object contained in the\n     * given collection.\n     *\n     * @param coll  the collection to remove\n     * @return \u003ccode\u003etrue\u003c/code\u003e if this call changed the collection\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.Bag.retainAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 186,
      "end_line": 186,
      "comment": "\n     * \u003ci\u003e(Violation)\u003c/i\u003e\n     * Remove any members of the bag that are not in the given\n     * collection, respecting cardinality.  That is, if the given\n     * collection \u003ccode\u003ecoll\u003c/code\u003e contains \u003ccode\u003en\u003c/code\u003e copies of a\n     * given object and the bag has \u003ccode\u003em \u0026gt; n\u003c/code\u003e copies, then\n     * delete \u003ccode\u003em - n\u003c/code\u003e copies from the bag.  In addition, if\n     * \u003ccode\u003ee\u003c/code\u003e is an object in the bag but\n     * \u003ccode\u003e!coll.contains(e)\u003c/code\u003e, then remove \u003ccode\u003ee\u003c/code\u003e and any\n     * of its copies.\n     *\n     * \u003cp\u003eThe {@link Collection#retainAll(Collection)} method specifies\n     * that cardinality should \u003ci\u003enot\u003c/i\u003e be respected; this method should\n     * keep \u003ci\u003eall\u003c/i\u003e occurrences of every object contained in the\n     * given collection.\n     *\n     * @param coll  the collection to retain\n     * @return \u003ccode\u003etrue\u003c/code\u003e if this call changed the collection\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.Bag.iterator()",
      "begin_line": 195,
      "end_line": 195,
      "comment": "\n     * Returns an {@link Iterator} over the entire set of members,\n     * including copies due to cardinality. This iterator is fail-fast\n     * and will not tolerate concurrent modifications.\n     *\n     * @return iterator over all elements in the Bag\n     ",
      "child_ranges": []
    }
  ]
}