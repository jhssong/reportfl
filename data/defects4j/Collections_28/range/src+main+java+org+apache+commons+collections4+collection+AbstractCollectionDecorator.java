{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/collection/AbstractCollectionDecorator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractCollectionDecorator",
      "is_interface": false,
      "parent_types": [
        "java.util.Collection\u003cE\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 55,
      "end_line": 178,
      "comment": "\n * Decorates another \u003ccode\u003eCollection\u003c/code\u003e to provide additional behaviour.\n * \u003cp\u003e\n * Each method call made on this \u003ccode\u003eCollection\u003c/code\u003e is forwarded to the\n * decorated \u003ccode\u003eCollection\u003c/code\u003e. This class is used as a framework on which\n * to build to extensions such as synchronized and unmodifiable behaviour. The\n * main advantage of decoration is that one decorator can wrap any implementation\n * of \u003ccode\u003eCollection\u003c/code\u003e, whereas sub-classing requires a new class to be\n * written for each implementation.\n * \u003cp\u003e\n * This implementation does not perform any special processing with\n * {@link #iterator()}. Instead it simply returns the value from the\n * wrapped collection. This may be undesirable, for example if you are trying\n * to write an unmodifiable implementation it might provide a loophole.\n * \u003cp\u003e\n * This implementation does not forward the hashCode and equals methods through\n * to the backing object, but relies on Object\u0027s implementation. This is necessary\n * to preserve the symmetry of equals. Custom definitions of equality are usually\n * based on an interface, such as Set or List, so that the implementation of equals\n * can cast the object being tested for equality to the custom interface.\n * AbstractCollectionDecorator does not implement such custom interfaces directly;\n * they are implemented only in subclasses. Therefore, forwarding equals would break\n * symmetry, as the forwarding object might consider itself equal to the object being\n * tested, but the reverse could not be true. This behavior is consistent with the\n * JDK\u0027s collection wrappers, such as {@link java.util.Collections#unmodifiableCollection(Collection)}.\n * Use an interface-specific subclass of AbstractCollectionDecorator, such as\n * AbstractListDecorator, to preserve equality behavior, or override equals directly.\n *\n * @param \u003cE\u003e the type of the elements in the collection\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Serialization version "
    },
    {
      "type": "field",
      "varNames": [
        "collection"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " The collection being decorated "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.collection.AbstractCollectionDecorator.AbstractCollectionDecorator()",
      "begin_line": 68,
      "end_line": 70,
      "comment": "\n     * Constructor only used in deserialization, do not use otherwise.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.collection.AbstractCollectionDecorator.AbstractCollectionDecorator(java.util.Collection\u003cE\u003e)",
      "begin_line": 78,
      "end_line": 83,
      "comment": "\n     * Constructor that wraps (not copies).\n     *\n     * @param coll  the collection to decorate, must not be null\n     * @throws NullPointerException if the collection is null\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 81,col 9)",
        "(line 82,col 9)-(line 82,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.AbstractCollectionDecorator.decorated()",
      "begin_line": 91,
      "end_line": 93,
      "comment": "\n     * Gets the collection being decorated.\n     * All access to the decorated collection goes via this method.\n     *\n     * @return the decorated collection\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.AbstractCollectionDecorator.setCollection(java.util.Collection\u003cE\u003e)",
      "begin_line": 102,
      "end_line": 104,
      "comment": "\n     * Sets the collection being decorated.\n     * \u003cp\u003e\n     * \u003cb\u003eNOTE:\u003c/b\u003e this method should only be used during deserialization\n     *\n     * @param coll  the decorated collection\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.AbstractCollectionDecorator.add(E)",
      "begin_line": 108,
      "end_line": 111,
      "comment": "",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.AbstractCollectionDecorator.addAll(java.util.Collection\u003c? extends E\u003e)",
      "begin_line": 113,
      "end_line": 116,
      "comment": "",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.AbstractCollectionDecorator.clear()",
      "begin_line": 118,
      "end_line": 121,
      "comment": "",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.AbstractCollectionDecorator.contains(java.lang.Object)",
      "begin_line": 123,
      "end_line": 126,
      "comment": "",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.AbstractCollectionDecorator.isEmpty()",
      "begin_line": 128,
      "end_line": 131,
      "comment": "",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.AbstractCollectionDecorator.iterator()",
      "begin_line": 133,
      "end_line": 136,
      "comment": "",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.AbstractCollectionDecorator.remove(java.lang.Object)",
      "begin_line": 138,
      "end_line": 141,
      "comment": "",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.AbstractCollectionDecorator.size()",
      "begin_line": 143,
      "end_line": 146,
      "comment": "",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.AbstractCollectionDecorator.toArray()",
      "begin_line": 148,
      "end_line": 151,
      "comment": "",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.AbstractCollectionDecorator.toArray(T[])",
      "begin_line": 153,
      "end_line": 156,
      "comment": "",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.AbstractCollectionDecorator.containsAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 158,
      "end_line": 161,
      "comment": "",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.AbstractCollectionDecorator.removeAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 163,
      "end_line": 166,
      "comment": "",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.AbstractCollectionDecorator.retainAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 168,
      "end_line": 171,
      "comment": "",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.AbstractCollectionDecorator.toString()",
      "begin_line": 173,
      "end_line": 176,
      "comment": "",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 38)"
      ]
    }
  ]
}