{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/list/LazyList.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LazyList",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.list.AbstractSerializableListDecorator\u003cE\u003e"
      ],
      "begin_line": 60,
      "end_line": 141,
      "comment": "\n * Decorates another \u003ccode\u003eList\u003c/code\u003e to create objects in the list on demand.\n * \u003cp\u003e\n * When the {@link #get(int)} method is called with an index greater than\n * the size of the list, the list will automatically grow in size and return\n * a new object from the specified factory. The gaps will be filled by null.\n * If a get method call encounters a null, it will be replaced with a new\n * object from the factory. Thus this list is unsuitable for storing null\n * objects.\n * \u003cp\u003e\n * For instance:\n *\n * \u003cpre\u003e\n * Factory\u0026lt;Date\u0026gt; factory \u003d new Factory\u0026lt;Date\u0026gt;() {\n *     public Date create() {\n *         return new Date();\n *     }\n * }\n * List\u0026lt;Date\u0026gt; lazy \u003d LazyList.decorate(new ArrayList\u0026lt;Date\u0026gt;(), factory);\n * Date date \u003d lazy.get(3);\n * \u003c/pre\u003e\n *\n * After the above code is executed, \u003ccode\u003edate\u003c/code\u003e will contain\n * a new \u003ccode\u003eDate\u003c/code\u003e instance.  Furthermore, that \u003ccode\u003eDate\u003c/code\u003e\n * instance is the fourth element in the list.  The first, second,\n * and third element are all set to \u003ccode\u003enull\u003c/code\u003e.\n * \u003cp\u003e\n * This class differs from {@link GrowthList} because here growth occurs on\n * get, where \u003ccode\u003eGrowthList\u003c/code\u003e grows on set and add. However, they\n * could easily be used together by decorating twice.\n * \u003cp\u003e\n * This class is Serializable from Commons Collections 3.1.\n *\n * @see GrowthList\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " Serialization version "
    },
    {
      "type": "field",
      "varNames": [
        "factory"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " The factory to use to lazily instantiate the objects "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.LazyList.lazyList(java.util.List\u003cE\u003e, org.apache.commons.collections4.Factory\u003c? extends E\u003e)",
      "begin_line": 78,
      "end_line": 80,
      "comment": "\n     * Factory method to create a lazily instantiating list.\n     *\n     * @param \u003cE\u003e the type of the elements in the list\n     * @param list  the list to decorate, must not be null\n     * @param factory  the factory to use for creation, must not be null\n     * @return a new lazy list\n     * @throws NullPointerException if list or factory is null\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.list.LazyList.LazyList(java.util.List\u003cE\u003e, org.apache.commons.collections4.Factory\u003c? extends E\u003e)",
      "begin_line": 90,
      "end_line": 96,
      "comment": "\n     * Constructor that wraps (not copies).\n     *\n     * @param list  the list to decorate, must not be null\n     * @param factory  the factory to use for creation, must not be null\n     * @throws NullPointerException if list or factory is null\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 20)",
        "(line 92,col 9)-(line 94,col 9)",
        "(line 95,col 9)-(line 95,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.LazyList.get(int)",
      "begin_line": 110,
      "end_line": 133,
      "comment": "\n     * Decorate the get method to perform the lazy behaviour.\n     * \u003cp\u003e\n     * If the requested index is greater than the current size, the list will\n     * grow to the new size and a new object will be returned from the factory.\n     * Indexes in-between the old size and the requested size are left with a\n     * placeholder that is replaced with a factory object when requested.\n     *\n     * @param index  the index to retrieve\n     * @return the element at the given index\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 44)",
        "(line 113,col 9)-(line 124,col 9)",
        "(line 126,col 9)-(line 128,col 9)",
        "(line 130,col 9)-(line 130,col 42)",
        "(line 131,col 9)-(line 131,col 32)",
        "(line 132,col 9)-(line 132,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.LazyList.subList(int, int)",
      "begin_line": 135,
      "end_line": 139,
      "comment": "",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 68)",
        "(line 138,col 9)-(line 138,col 45)"
      ]
    }
  ]
}