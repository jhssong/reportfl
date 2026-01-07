{
  "filepath": "/tmp/Collections-26b/src/main/java/org/apache/commons/collections4/collection/PredicatedCollection.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PredicatedCollection",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.collection.AbstractCollectionDecorator\u003cE\u003e"
      ],
      "begin_line": 56,
      "end_line": 407,
      "comment": "\n * Decorates another {@link Collection} to validate that additions\n * match a specified predicate.\n * \u003cp\u003e\n * This collection exists to provide validation for the decorated collection.\n * It is normally created to decorate an empty collection.\n * If an object cannot be added to the collection, an IllegalArgumentException is thrown.\n * \u003cp\u003e\n * One usage would be to ensure that no null entries are added to the collection:\n * \u003cpre\u003e\n * Collection coll \u003d PredicatedCollection.predicatedCollection(new ArrayList(), NotNullPredicate.INSTANCE);\n * \u003c/pre\u003e\n * \u003cp\u003e\n * This class is Serializable from Commons Collections 3.1.\n *\n * @param \u003cE\u003e the type of the elements in the collection\n * @since 3.0\n * @version $Id$\n "
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
        "predicate"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " The predicate to use "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.PredicatedCollection.builder(org.apache.commons.collections4.Predicate\u003c? super E\u003e)",
      "begin_line": 72,
      "end_line": 74,
      "comment": "\n     * Returns a Builder with the given predicate.\n     *\n     * @param \u003cE\u003e  the element type\n     * @param predicate  the predicate to use\n     * @return a new Builder for predicated collections\n     * @since 4.1\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.PredicatedCollection.notNullBuilder()",
      "begin_line": 83,
      "end_line": 85,
      "comment": "\n     * Returns a Builder with a NotNullPredicate.\n     *\n     * @param \u003cE\u003e  the element type\n     * @return a new Builder for predicated collections that ignores null values.\n     * @since 4.1\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(java.util.Collection\u003cT\u003e, org.apache.commons.collections4.Predicate\u003c? super T\u003e)",
      "begin_line": 101,
      "end_line": 104,
      "comment": "\n     * Factory method to create a predicated (validating) collection.\n     * \u003cp\u003e\n     * If there are any elements already in the collection being decorated, they\n     * are validated.\n     *\n     * @param \u003cT\u003e the type of the elements in the collection\n     * @param coll  the collection to decorate, must not be null\n     * @param predicate  the predicate to use for validation, must not be null\n     * @return a new predicated collection\n     * @throws NullPointerException if collection or predicate is null\n     * @throws IllegalArgumentException if the collection contains invalid elements\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 60)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.collection.PredicatedCollection.PredicatedCollection(java.util.Collection\u003cE\u003e, org.apache.commons.collections4.Predicate\u003c? super E\u003e)",
      "begin_line": 118,
      "end_line": 127,
      "comment": "\n     * Constructor that wraps (not copies).\n     * \u003cp\u003e\n     * If there are any elements already in the collection being decorated, they\n     * are validated.\n     *\n     * @param coll  the collection to decorate, must not be null\n     * @param predicate  the predicate to use for validation, must not be null\n     * @throws NullPointerException if collection or predicate is null\n     * @throws IllegalArgumentException if the collection contains invalid elements\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 20)",
        "(line 120,col 9)-(line 122,col 9)",
        "(line 123,col 9)-(line 123,col 35)",
        "(line 124,col 9)-(line 126,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.PredicatedCollection.validate(E)",
      "begin_line": 138,
      "end_line": 143,
      "comment": "\n     * Validates the object being added to ensure it matches the predicate.\n     * \u003cp\u003e\n     * The predicate itself should not throw an exception, but return false to\n     * indicate that the object cannot be added.\n     *\n     * @param object  the object being added\n     * @throws IllegalArgumentException if the add is invalid\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 142,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.PredicatedCollection.add(E)",
      "begin_line": 154,
      "end_line": 158,
      "comment": "\n     * Override to validate the object being added to ensure it matches\n     * the predicate.\n     *\n     * @param object  the object being added\n     * @return the result of adding to the underlying collection\n     * @throws IllegalArgumentException if the add is invalid\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 25)",
        "(line 157,col 9)-(line 157,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.PredicatedCollection.addAll(java.util.Collection\u003c? extends E\u003e)",
      "begin_line": 169,
      "end_line": 175,
      "comment": "\n     * Override to validate the objects being added to ensure they match\n     * the predicate. If any one fails, no update is made to the underlying\n     * collection.\n     *\n     * @param coll  the collection being added\n     * @return the result of adding to the underlying collection\n     * @throws IllegalArgumentException if the add is invalid\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 173,col 9)",
        "(line 174,col 9)-(line 174,col 40)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Builder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 203,
      "end_line": 405,
      "comment": "\n     * Builder for creating predicated collections.\n     * \u003cp\u003e\n     * Create a Builder with a predicate to validate elements against, then add any elements\n     * to the builder. Elements that fail the predicate will be added to a rejected list.\n     * Finally create or decorate a collection using the createPredicated[List,Set,Bag,Queue] methods.\n     * \u003cp\u003e\n     * An example:\n     * \u003cpre\u003e\n     *   Predicate\u0026lt;String\u0026gt; predicate \u003d NotNullPredicate.notNullPredicate();\n     *   PredicatedCollectionBuilder\u0026lt;String\u0026gt; builder \u003d PredicatedCollection.builder(predicate);\n     *   builder.add(\"item1\");\n     *   builder.add(null);\n     *   builder.add(\"item2\");\n     *   List\u0026lt;String\u0026gt; predicatedList \u003d builder.createPredicatedList();\n     * \u003c/pre\u003e\n     * \u003cp\u003e\n     * At the end of the code fragment above predicatedList is protected by the predicate supplied\n     * to the builder and it contains item1 and item2.\n     * \u003cp\u003e\n     * More elements can be added to the builder once a predicated collection has been created,\n     * but these elements will not be reflected in already created collections.\n     *\n     * @param \u003cE\u003e  the element type\n     * @since 4.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "predicate"
      ],
      "begin_line": 206,
      "end_line": 206,
      "comment": " The predicate to use. "
    },
    {
      "type": "field",
      "varNames": [
        "accepted"
      ],
      "begin_line": 209,
      "end_line": 209,
      "comment": " The buffer containing valid elements. "
    },
    {
      "type": "field",
      "varNames": [
        "rejected"
      ],
      "begin_line": 212,
      "end_line": 212,
      "comment": " The buffer containing rejected elements. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.collection.PredicatedCollection.Builder.Builder(org.apache.commons.collections4.Predicate\u003c? super E\u003e)",
      "begin_line": 221,
      "end_line": 226,
      "comment": "\n         * Constructs a PredicatedCollectionBuilder with the specified Predicate.\n         *\n         * @param predicate  the predicate to use\n         * @throws NullPointerException if predicate is null\n         ",
      "child_ranges": [
        "(line 222,col 13)-(line 224,col 13)",
        "(line 225,col 13)-(line 225,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.PredicatedCollection.Builder.add(E)",
      "begin_line": 237,
      "end_line": 244,
      "comment": "\n         * Adds the item to the builder.\n         * \u003cp\u003e\n         * If the predicate is true, it is added to the list of accepted elements,\n         * otherwise it is added to the rejected list.\n         *\n         * @param item  the element to add\n         * @return the PredicatedCollectionBuilder.\n         ",
      "child_ranges": [
        "(line 238,col 13)-(line 242,col 13)",
        "(line 243,col 13)-(line 243,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.PredicatedCollection.Builder.addAll(java.util.Collection\u003c? extends E\u003e)",
      "begin_line": 255,
      "end_line": 262,
      "comment": "\n         * Adds all elements from the given collection to the builder.\n         * \u003cp\u003e\n         * All elements for which the predicate evaluates to true will be added to the\n         * list of accepted elements, otherwise they are added to the rejected list.\n         *\n         * @param items  the elements to add to the builder\n         * @return the PredicatedCollectionBuilder.\n         ",
      "child_ranges": [
        "(line 256,col 13)-(line 260,col 13)",
        "(line 261,col 13)-(line 261,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.PredicatedCollection.Builder.createPredicatedList()",
      "begin_line": 272,
      "end_line": 274,
      "comment": "\n         * Create a new predicated list filled with the accepted elements.\n         * \u003cp\u003e\n         * The builder is not modified by this method, so it is possible to create more collections\n         * or add more elements afterwards. Further changes will not propagate to the returned list.\n         *\n         * @return a new predicated list.\n         ",
      "child_ranges": [
        "(line 273,col 13)-(line 273,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.PredicatedCollection.Builder.createPredicatedList(java.util.List\u003cE\u003e)",
      "begin_line": 288,
      "end_line": 295,
      "comment": "\n         * Decorates the given list with validating behavior using the predicate. All accepted elements\n         * are appended to the list. If the list already contains elements, they are validated.\n         * \u003cp\u003e\n         * The builder is not modified by this method, so it is possible to create more collections\n         * or add more elements afterwards. Further changes will not propagate to the returned list.\n         *\n         * @param list  the List to decorate, must not be null\n         * @return the decorated list.\n         * @throws NullPointerException if list is null\n         * @throws IllegalArgumentException if list contains invalid elements\n         ",
      "child_ranges": [
        "(line 289,col 13)-(line 291,col 13)",
        "(line 292,col 13)-(line 292,col 90)",
        "(line 293,col 13)-(line 293,col 44)",
        "(line 294,col 13)-(line 294,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.PredicatedCollection.Builder.createPredicatedSet()",
      "begin_line": 305,
      "end_line": 307,
      "comment": "\n         * Create a new predicated set filled with the accepted elements.\n         * \u003cp\u003e\n         * The builder is not modified by this method, so it is possible to create more collections\n         * or add more elements afterwards. Further changes will not propagate to the returned set.\n         *\n         * @return a new predicated set.\n         ",
      "child_ranges": [
        "(line 306,col 13)-(line 306,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.PredicatedCollection.Builder.createPredicatedSet(java.util.Set\u003cE\u003e)",
      "begin_line": 321,
      "end_line": 328,
      "comment": "\n         * Decorates the given list with validating behavior using the predicate. All accepted elements\n         * are appended to the set. If the set already contains elements, they are validated.\n         * \u003cp\u003e\n         * The builder is not modified by this method, so it is possible to create more collections\n         * or add more elements afterwards. Further changes will not propagate to the returned set.\n         *\n         * @param set  the set to decorate, must not be null\n         * @return the decorated set.\n         * @throws NullPointerException if set is null\n         * @throws IllegalArgumentException if set contains invalid elements\n         ",
      "child_ranges": [
        "(line 322,col 13)-(line 324,col 13)",
        "(line 325,col 13)-(line 325,col 95)",
        "(line 326,col 13)-(line 326,col 43)",
        "(line 327,col 13)-(line 327,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.PredicatedCollection.Builder.createPredicatedBag()",
      "begin_line": 338,
      "end_line": 340,
      "comment": "\n         * Create a new predicated bag filled with the accepted elements.\n         * \u003cp\u003e\n         * The builder is not modified by this method, so it is possible to create more collections\n         * or add more elements afterwards. Further changes will not propagate to the returned bag.\n         *\n         * @return a new predicated bag.\n         ",
      "child_ranges": [
        "(line 339,col 13)-(line 339,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.PredicatedCollection.Builder.createPredicatedBag(org.apache.commons.collections4.Bag\u003cE\u003e)",
      "begin_line": 354,
      "end_line": 361,
      "comment": "\n         * Decorates the given bag with validating behavior using the predicate. All accepted elements\n         * are appended to the bag. If the bag already contains elements, they are validated.\n         * \u003cp\u003e\n         * The builder is not modified by this method, so it is possible to create more collections\n         * or add more elements afterwards. Further changes will not propagate to the returned bag.\n         *\n         * @param bag  the bag to decorate, must not be null\n         * @return the decorated bag.\n         * @throws NullPointerException if bag is null\n         * @throws IllegalArgumentException if bag contains invalid elements\n         ",
      "child_ranges": [
        "(line 355,col 13)-(line 357,col 13)",
        "(line 358,col 13)-(line 358,col 95)",
        "(line 359,col 13)-(line 359,col 43)",
        "(line 360,col 13)-(line 360,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.PredicatedCollection.Builder.createPredicatedQueue()",
      "begin_line": 371,
      "end_line": 373,
      "comment": "\n         * Create a new predicated queue filled with the accepted elements.\n         * \u003cp\u003e\n         * The builder is not modified by this method, so it is possible to create more collections\n         * or add more elements afterwards. Further changes will not propagate to the returned queue.\n         *\n         * @return a new predicated queue.\n         ",
      "child_ranges": [
        "(line 372,col 13)-(line 372,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.PredicatedCollection.Builder.createPredicatedQueue(java.util.Queue\u003cE\u003e)",
      "begin_line": 387,
      "end_line": 394,
      "comment": "\n         * Decorates the given queue with validating behavior using the predicate. All accepted elements\n         * are appended to the queue. If the queue already contains elements, they are validated.\n         * \u003cp\u003e\n         * The builder is not modified by this method, so it is possible to create more collections\n         * or add more elements afterwards. Further changes will not propagate to the returned queue.\n         *\n         * @param queue  the queue to decorate, must not be null\n         * @return the decorated queue.\n         * @throws NullPointerException if queue is null\n         * @throws IllegalArgumentException if queue contains invalid elements\n         ",
      "child_ranges": [
        "(line 388,col 13)-(line 390,col 13)",
        "(line 391,col 13)-(line 391,col 105)",
        "(line 392,col 13)-(line 392,col 45)",
        "(line 393,col 13)-(line 393,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.PredicatedCollection.Builder.rejectedElements()",
      "begin_line": 401,
      "end_line": 403,
      "comment": "\n         * Returns an unmodifiable collection containing all rejected elements.\n         *\n         * @return an unmodifiable collection\n         ",
      "child_ranges": [
        "(line 402,col 13)-(line 402,col 64)"
      ]
    }
  ]
}