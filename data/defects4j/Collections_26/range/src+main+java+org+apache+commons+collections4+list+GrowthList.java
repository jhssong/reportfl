{
  "filepath": "/tmp/Collections-26b/src/main/java/org/apache/commons/collections4/list/GrowthList.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GrowthList",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.list.AbstractSerializableListDecorator\u003cE\u003e"
      ],
      "begin_line": 55,
      "end_line": 189,
      "comment": "\n * Decorates another \u003ccode\u003eList\u003c/code\u003e to make it seamlessly grow when\n * indices larger than the list size are used on add and set,\n * avoiding most IndexOutOfBoundsExceptions.\n * \u003cp\u003e\n * This class avoids errors by growing when a set or add method would\n * normally throw an IndexOutOfBoundsException.\n * Note that IndexOutOfBoundsException IS returned for invalid negative indices.\n * \u003cp\u003e\n * Trying to set or add to an index larger than the size will cause the list\n * to grow (using \u003ccode\u003enull\u003c/code\u003e elements). Clearly, care must be taken\n * not to use excessively large indices, as the internal list will grow to\n * match.\n * \u003cp\u003e\n * Trying to use any method other than add or set with an invalid index will\n * call the underlying list and probably result in an IndexOutOfBoundsException.\n * \u003cp\u003e\n * Take care when using this list with \u003ccode\u003enull\u003c/code\u003e values, as\n * \u003ccode\u003enull\u003c/code\u003e is the value added when growing the list.\n * \u003cp\u003e\n * All sub-lists will access the underlying list directly, and will throw\n * IndexOutOfBoundsExceptions.\n * \u003cp\u003e\n * This class differs from {@link LazyList} because here growth occurs on\n * set and add, where \u003ccode\u003eLazyList\u003c/code\u003e grows on get. However, they\n * can be used together by decorating twice.\n *\n * @see LazyList\n * @since 3.2\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " Serialization version "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.GrowthList.growthList(java.util.List\u003cE\u003e)",
      "begin_line": 69,
      "end_line": 71,
      "comment": "\n     * Factory method to create a growth list.\n     *\n     * @param \u003cE\u003e the type of the elements in the list\n     * @param list  the list to decorate, must not be null\n     * @return a new growth list\n     * @throws NullPointerException if list is null\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 39)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.list.GrowthList.GrowthList()",
      "begin_line": 77,
      "end_line": 79,
      "comment": "\n     * Constructor that uses an ArrayList internally.\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.list.GrowthList.GrowthList(int)",
      "begin_line": 87,
      "end_line": 89,
      "comment": "\n     * Constructor that uses an ArrayList internally.\n     *\n     * @param initialSize  the initial size of the ArrayList\n     * @throws IllegalArgumentException if initial size is invalid\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.list.GrowthList.GrowthList(java.util.List\u003cE\u003e)",
      "begin_line": 97,
      "end_line": 99,
      "comment": "\n     * Constructor that wraps (not copies).\n     *\n     * @param list  the list to decorate, must not be null\n     * @throws NullPointerException if list is null\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.GrowthList.add(int, E)",
      "begin_line": 120,
      "end_line": 127,
      "comment": "\n     * Decorate the add method to perform the growth behaviour.\n     * \u003cp\u003e\n     * If the requested index is greater than the current size, the list will\n     * grow to the new size. Indices between the old size and the requested\n     * size will be filled with \u003ccode\u003enull\u003c/code\u003e.\n     * \u003cp\u003e\n     * If the index is less than the current size, the value will be added to\n     * the underlying list directly.\n     * If the index is less than zero, the underlying list is called, which\n     * will probably throw an IndexOutOfBoundsException.\n     *\n     * @param index  the index to add at\n     * @param element  the object to add at the specified index\n     * @throws UnsupportedOperationException if the underlying list doesn\u0027t implement set\n     * @throws ClassCastException if the underlying list rejects the element\n     * @throws IllegalArgumentException if the underlying list rejects the element\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 44)",
        "(line 123,col 9)-(line 125,col 9)",
        "(line 126,col 9)-(line 126,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.GrowthList.addAll(int, java.util.Collection\u003c? extends E\u003e)",
      "begin_line": 149,
      "end_line": 158,
      "comment": "\n     * Decorate the addAll method to perform the growth behaviour.\n     * \u003cp\u003e\n     * If the requested index is greater than the current size, the list will\n     * grow to the new size. Indices between the old size and the requested\n     * size will be filled with \u003ccode\u003enull\u003c/code\u003e.\n     * \u003cp\u003e\n     * If the index is less than the current size, the values will be added to\n     * the underlying list directly.\n     * If the index is less than zero, the underlying list is called, which\n     * will probably throw an IndexOutOfBoundsException.\n     *\n     * @param index  the index to add at\n     * @param coll  the collection to add at the specified index\n     * @return true if the list changed\n     * @throws UnsupportedOperationException if the underlying list doesn\u0027t implement set\n     * @throws ClassCastException if the underlying list rejects the element\n     * @throws IllegalArgumentException if the underlying list rejects the element\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 44)",
        "(line 152,col 9)-(line 152,col 31)",
        "(line 153,col 9)-(line 156,col 9)",
        "(line 157,col 9)-(line 157,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.GrowthList.set(int, E)",
      "begin_line": 180,
      "end_line": 187,
      "comment": "\n     * Decorate the set method to perform the growth behaviour.\n     * \u003cp\u003e\n     * If the requested index is greater than the current size, the list will\n     * grow to the new size. Indices between the old size and the requested\n     * size will be filled with \u003ccode\u003enull\u003c/code\u003e.\n     * \u003cp\u003e\n     * If the index is less than the current size, the value will be set onto\n     * the underlying list directly.\n     * If the index is less than zero, the underlying list is called, which\n     * will probably throw an IndexOutOfBoundsException.\n     *\n     * @param index  the index to set\n     * @param element  the object to set at the specified index\n     * @return the object previously at that index\n     * @throws UnsupportedOperationException if the underlying list doesn\u0027t implement set\n     * @throws ClassCastException if the underlying list rejects the element\n     * @throws IllegalArgumentException if the underlying list rejects the element\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 44)",
        "(line 183,col 9)-(line 185,col 9)",
        "(line 186,col 9)-(line 186,col 47)"
      ]
    }
  ]
}