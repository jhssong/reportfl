{
  "filepath": "/tmp/Collections-27b/src/main/java/org/apache/commons/collections4/collection/TransformedCollection.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TransformedCollection",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.collection.AbstractCollectionDecorator\u003cE\u003e"
      ],
      "begin_line": 39,
      "end_line": 155,
      "comment": "\n * Decorates another {@link Collection} to transform objects that are added.\n * \u003cp\u003e\n * The add methods are affected by this class.\n * Thus objects must be removed or searched for using their transformed form.\n * For example, if the transformation converts Strings to Integers, you must\n * use the Integer form to remove objects.\n * \u003cp\u003e\n * This class is Serializable from Commons Collections 3.1.\n *\n * @param \u003cE\u003e the type of the elements in the collection\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Serialization version "
    },
    {
      "type": "field",
      "varNames": [
        "transformer"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " The transformer to use "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.TransformedCollection.transformingCollection(java.util.Collection\u003cE\u003e, org.apache.commons.collections4.Transformer\u003c? super E, ? extends E\u003e)",
      "begin_line": 61,
      "end_line": 64,
      "comment": "\n     * Factory method to create a transforming collection.\n     * \u003cp\u003e\n     * If there are any elements already in the collection being decorated, they\n     * are NOT transformed.\n     * Contrast this with {@link #transformedCollection(Collection, Transformer)}.\n     *\n     * @param \u003cE\u003e the type of the elements in the collection\n     * @param coll  the collection to decorate, must not be null\n     * @param transformer  the transformer to use for conversion, must not be null\n     * @return a new transformed collection\n     * @throws NullPointerException if collection or transformer is null\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.TransformedCollection.transformedCollection(java.util.Collection\u003cE\u003e, org.apache.commons.collections4.Transformer\u003c? super E, ? extends E\u003e)",
      "begin_line": 81,
      "end_line": 95,
      "comment": "\n     * Factory method to create a transforming collection that will transform\n     * existing contents of the specified collection.\n     * \u003cp\u003e\n     * If there are any elements already in the collection being decorated, they\n     * will be transformed by this method.\n     * Contrast this with {@link #transformingCollection(Collection, Transformer)}.\n     *\n     * @param \u003cE\u003e the type of the elements in the collection\n     * @param collection  the collection to decorate, must not be null\n     * @param transformer  the transformer to use for conversion, must not be null\n     * @return a new transformed Collection\n     * @throws NullPointerException if collection or transformer is null\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 105)",
        "(line 86,col 9)-(line 93,col 9)",
        "(line 94,col 9)-(line 94,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.collection.TransformedCollection.TransformedCollection(java.util.Collection\u003cE\u003e, org.apache.commons.collections4.Transformer\u003c? super E, ? extends E\u003e)",
      "begin_line": 108,
      "end_line": 114,
      "comment": "\n     * Constructor that wraps (not copies).\n     * \u003cp\u003e\n     * If there are any elements already in the collection being decorated, they\n     * are NOT transformed.\n     *\n     * @param coll  the collection to decorate, must not be null\n     * @param transformer  the transformer to use for conversion, must not be null\n     * @throws NullPointerException if collection or transformer is null\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 20)",
        "(line 110,col 9)-(line 112,col 9)",
        "(line 113,col 9)-(line 113,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.TransformedCollection.transform(E)",
      "begin_line": 124,
      "end_line": 126,
      "comment": "\n     * Transforms an object.\n     * \u003cp\u003e\n     * The transformer itself may throw an exception if necessary.\n     *\n     * @param object  the object to transform\n     * @return a transformed object\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.TransformedCollection.transform(java.util.Collection\u003c? extends E\u003e)",
      "begin_line": 136,
      "end_line": 142,
      "comment": "\n     * Transforms a collection.\n     * \u003cp\u003e\n     * The transformer itself may throw an exception if necessary.\n     *\n     * @param coll  the collection to transform\n     * @return a transformed object\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 59)",
        "(line 138,col 9)-(line 140,col 9)",
        "(line 141,col 9)-(line 141,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.TransformedCollection.add(E)",
      "begin_line": 145,
      "end_line": 148,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.TransformedCollection.addAll(java.util.Collection\u003c? extends E\u003e)",
      "begin_line": 150,
      "end_line": 153,
      "comment": "",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 51)"
      ]
    }
  ]
}