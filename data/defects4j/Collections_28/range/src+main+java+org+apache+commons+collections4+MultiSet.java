{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/MultiSet.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultiSet",
      "is_interface": true,
      "parent_types": [
        "java.util.Collection\u003cE\u003e"
      ],
      "begin_line": 35,
      "end_line": 272,
      "comment": "\n * Defines a collection that counts the number of times an object appears in\n * the collection.\n * \u003cp\u003e\n * Suppose you have a MultiSet that contains \u003ccode\u003e{a, a, b, c}\u003c/code\u003e.\n * Calling {@link #getCount(Object)} on \u003ccode\u003ea\u003c/code\u003e would return 2, while\n * calling {@link #uniqueSet()} would return \u003ccode\u003e{a, b, c}\u003c/code\u003e.\n *\n * @param \u003cE\u003e the type held in the multiset\n * @since 4.1\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MultiSet.getCount(java.lang.Object)",
      "begin_line": 45,
      "end_line": 45,
      "comment": "\n     * Returns the number of occurrences of the given object currently\n     * in the MultiSet. If the object does not exist in the multiset,\n     * return 0.\n     *\n     * @param object  the object to search for\n     * @return the number of occurrences of the object, zero if not found\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MultiSet.setCount(E, int)",
      "begin_line": 60,
      "end_line": 60,
      "comment": "\n     * Sets the number of occurrences of the specified object in the MultiSet\n     * to the given count.\n     * \u003cp\u003e\n     * If the provided count is zero, the object will be removed from the\n     * {@link #uniqueSet()}.\n     *\n     * @param object  the object to update\n     * @param count  the number of occurrences of the object\n     * @return the number of occurrences of the object before this operation, zero\n     *   if the object was not contained in the multiset\n     * @throws IllegalArgumentException if count is negative\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MultiSet.add(E)",
      "begin_line": 73,
      "end_line": 74,
      "comment": "\n     * Adds one copy of the specified object to the MultiSet.\n     * \u003cp\u003e\n     * If the object is already in the {@link #uniqueSet()} then increment its\n     * count as reported by {@link #getCount(Object)}. Otherwise add it to the\n     * {@link #uniqueSet()} and report its count as 1.\n     *\n     * @param object  the object to add\n     * @return \u003ccode\u003etrue\u003c/code\u003e always, as the size of the MultiSet is increased\n     *   in any case\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MultiSet.add(E, int)",
      "begin_line": 90,
      "end_line": 90,
      "comment": "\n     * Adds a number of occurrences of the specified object to the MultiSet.\n     * \u003cp\u003e\n     * If the object is already in the {@link #uniqueSet()} then increment its\n     * count as reported by {@link #getCount(Object)}. Otherwise add it to the\n     * {@link #uniqueSet()} and report its count as \u003ccode\u003eoccurrences\u003c/code\u003e.\n     *\n     * @param object  the object to add\n     * @param occurrences  the number of occurrences to add, may be zero,\n     *   in which case no change is made to the multiset\n     * @return the number of occurrences of the object in the multiset before\n     *   this operation; possibly zero\n     * @throws IllegalArgumentException if occurrences is negative\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MultiSet.remove(java.lang.Object)",
      "begin_line": 101,
      "end_line": 102,
      "comment": "\n     * Removes one occurrence of the given object from the MultiSet.\n     * \u003cp\u003e\n     * If the number of occurrences after this operations is reduced\n     * to zero, the object will be removed from the {@link #uniqueSet()}.\n     *\n     * @param object  the object to remove\n     * @return \u003ccode\u003etrue\u003c/code\u003e if this call changed the collection\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MultiSet.remove(java.lang.Object, int)",
      "begin_line": 117,
      "end_line": 117,
      "comment": "\n     * Removes a number of occurrences of the specified object from the MultiSet.\n     * \u003cp\u003e\n     * If the number of occurrences to remove is greater than the actual number of\n     * occurrences in the multiset, the object will be removed from the multiset.\n     *\n     * @param object  the object to remove\n     * @param occurrences  the number of occurrences to remove, may be zero,\n     *   in which case no change is made to the multiset\n     * @return the number of occurrences of the object in the multiset\n     *   before the operation; possibly zero\n     * @throws IllegalArgumentException if occurrences is negative\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MultiSet.uniqueSet()",
      "begin_line": 131,
      "end_line": 131,
      "comment": "\n     * Returns a {@link Set} of unique elements in the MultiSet.\n     * \u003cp\u003e\n     * Uniqueness constraints are the same as those in {@link java.util.Set}.\n     * \u003cp\u003e\n     * The returned set is backed by this multiset, so any change to either\n     * is immediately reflected in the other. Only removal operations are\n     * supported, in which case all occurrences of the element are removed\n     * from the backing multiset.\n     *\n     * @return the Set of unique MultiSet elements\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MultiSet.entrySet()",
      "begin_line": 141,
      "end_line": 141,
      "comment": "\n     * Returns a {@link Set} of all entries contained in the MultiSet.\n     * \u003cp\u003e\n     * The returned set is backed by this multiset, so any change to either\n     * is immediately reflected in the other.\n     *\n     * @return the Set of MultiSet entries\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MultiSet.iterator()",
      "begin_line": 150,
      "end_line": 151,
      "comment": "\n     * Returns an {@link Iterator} over the entire set of members,\n     * including copies due to cardinality. This iterator is fail-fast\n     * and will not tolerate concurrent modifications.\n     *\n     * @return iterator over all elements in the MultiSet\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MultiSet.size()",
      "begin_line": 158,
      "end_line": 159,
      "comment": "\n     * Returns the total number of items in the MultiSet.\n     *\n     * @return the total size of the multiset\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MultiSet.containsAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 168,
      "end_line": 169,
      "comment": "\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the MultiSet contains at least one\n     * occurrence for each element contained in the given collection.\n     *\n     * @param coll  the collection to check against\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the MultiSet contains all the collection\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MultiSet.removeAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 178,
      "end_line": 179,
      "comment": "\n     * Remove all occurrences of all elements from this MultiSet represented\n     * in the given collection.\n     *\n     * @param coll  the collection of elements to remove\n     * @return \u003ccode\u003etrue\u003c/code\u003e if this call changed the multiset\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MultiSet.retainAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 188,
      "end_line": 189,
      "comment": "\n     * Remove any elements of this MultiSet that are not contained in the\n     * given collection.\n     *\n     * @param coll  the collection of elements to retain\n     * @return \u003ccode\u003etrue\u003c/code\u003e if this call changed the multiset\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MultiSet.equals(java.lang.Object)",
      "begin_line": 200,
      "end_line": 201,
      "comment": "\n     * Compares this MultiSet to another object.\n     * \u003cp\u003e\n     * This MultiSet equals another object if it is also a MultiSet\n     * that contains the same number of occurrences of the same elements.\n     *\n     * @param obj  the object to compare to\n     * @return true if equal\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MultiSet.hashCode()",
      "begin_line": 211,
      "end_line": 212,
      "comment": "\n     * Gets a hash code for the MultiSet compatible with the definition of equals.\n     * The hash code is defined as the sum total of a hash code for each element.\n     * The per element hash code is defined as\n     * \u003ccode\u003e(e\u003d\u003dnull ? 0 : e.hashCode()) ^ noOccurances)\u003c/code\u003e.\n     *\n     * @return the hash code of the MultiSet\n     ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "Entry",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 222,
      "end_line": 270,
      "comment": "\n     * An unmodifiable entry for an element and its occurrence as contained in a MultiSet.\n     * \u003cp\u003e\n     * The {@link MultiSet#entrySet()} method returns a view of the multiset whose elements\n     * implements this interface.\n     *\n     * @param \u003cE\u003e  the element type\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MultiSet.Entry.getElement()",
      "begin_line": 229,
      "end_line": 229,
      "comment": "\n         * Returns the element corresponding to this entry.\n         *\n         * @return the element corresponding to this entry\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MultiSet.Entry.getCount()",
      "begin_line": 236,
      "end_line": 236,
      "comment": "\n         * Returns the number of occurrences for the element of this entry.\n         *\n         * @return the number of occurrences of the element\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MultiSet.Entry.equals(java.lang.Object)",
      "begin_line": 255,
      "end_line": 256,
      "comment": "\n         * Compares the specified object with this entry for equality.\n         * Returns true if the given object is also a multiset entry\n         * and the two entries represent the same element with the same\n         * number of occurrences.\n         * \u003cp\u003e\n         * More formally, two entries \u003ctt\u003ee1\u003c/tt\u003e and \u003ctt\u003ee2\u003c/tt\u003e represent\n         * the same mapping if\n         * \u003cpre\u003e\n         *     (e1.getElement()\u003d\u003dnull ? e2.getElement()\u003d\u003dnull\n         *                            : e1.getElement().equals(e2.getElement())) \u0026amp;\u0026amp;\n         *     (e1.getCount()\u003d\u003de2.getCount())\n         * \u003c/pre\u003e\n         *\n         * @param o object to be compared for equality with this multiset entry\n         * @return true if the specified object is equal to this multiset entry\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MultiSet.Entry.hashCode()",
      "begin_line": 268,
      "end_line": 269,
      "comment": "\n         * Returns the hash code value for this multiset entry.\n         * \u003cp\u003e\n         * The hash code of a multiset entry \u003ctt\u003ee\u003c/tt\u003e is defined to be:\n         * \u003cpre\u003e\n         *      (e\u003d\u003dnull ? 0 : e.hashCode()) ^ noOccurances)\n         * \u003c/pre\u003e\n         *\n         * @return the hash code value for this multiset entry\n         ",
      "child_ranges": []
    }
  ]
}