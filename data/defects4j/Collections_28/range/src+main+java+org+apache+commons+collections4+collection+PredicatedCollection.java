{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/collection/PredicatedCollection.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PredicatedCollection",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.collection.AbstractCollectionDecorator\u003cE\u003e"
      ],
      "begin_line": 59,
      "end_line": 444,
      "comment": "\n * Decorates another {@link Collection} to validate that additions\n * match a specified predicate.\n * \u003cp\u003e\n * This collection exists to provide validation for the decorated collection.\n * It is normally created to decorate an empty collection.\n * If an object cannot be added to the collection, an IllegalArgumentException is thrown.\n * \u003cp\u003e\n * One usage would be to ensure that no null entries are added to the collection:\n * \u003cpre\u003e\n * Collection coll \u003d PredicatedCollection.predicatedCollection(new ArrayList(), NotNullPredicate.INSTANCE);\n * \u003c/pre\u003e\n * \u003cp\u003e\n * This class is Serializable from Commons Collections 3.1.\n *\n * @param \u003cE\u003e the type of the elements in the collection\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " Serialization version "
    },
    {
      "type": "field",
      "varNames": [
        "predicate"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " The predicate to use "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.PredicatedCollection.builder(org.apache.commons.collections4.Predicate\u003c? super E\u003e)",
      "begin_line": 75,
      "end_line": 77,
      "comment": "\n     * Returns a Builder with the given predicate.\n     *\n     * @param \u003cE\u003e  the element type\n     * @param predicate  the predicate to use\n     * @return a new Builder for predicated collections\n     * @since 4.1\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.PredicatedCollection.notNullBuilder()",
      "begin_line": 86,
      "end_line": 88,
      "comment": "\n     * Returns a Builder with a NotNullPredicate.\n     *\n     * @param \u003cE\u003e  the element type\n     * @return a new Builder for predicated collections that ignores null values.\n     * @since 4.1\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(java.util.Collection\u003cT\u003e, org.apache.commons.collections4.Predicate\u003c? super T\u003e)",
      "begin_line": 104,
      "end_line": 107,
      "comment": "\n     * Factory method to create a predicated (validating) collection.\n     * \u003cp\u003e\n     * If there are any elements already in the collection being decorated, they\n     * are validated.\n     *\n     * @param \u003cT\u003e the type of the elements in the collection\n     * @param coll  the collection to decorate, must not be null\n     * @param predicate  the predicate to use for validation, must not be null\n     * @return a new predicated collection\n     * @throws NullPointerException if collection or predicate is null\n     * @throws IllegalArgumentException if the collection contains invalid elements\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 60)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.collection.PredicatedCollection.PredicatedCollection(java.util.Collection\u003cE\u003e, org.apache.commons.collections4.Predicate\u003c? super E\u003e)",
      "begin_line": 121,
      "end_line": 130,
      "comment": "\n     * Constructor that wraps (not copies).\n     * \u003cp\u003e\n     * If there are any elements already in the collection being decorated, they\n     * are validated.\n     *\n     * @param coll  the collection to decorate, must not be null\n     * @param predicate  the predicate to use for validation, must not be null\n     * @throws NullPointerException if collection or predicate is null\n     * @throws IllegalArgumentException if the collection contains invalid elements\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 20)",
        "(line 123,col 9)-(line 125,col 9)",
        "(line 126,col 9)-(line 126,col 35)",
        "(line 127,col 9)-(line 129,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.PredicatedCollection.validate(E)",
      "begin_line": 141,
      "end_line": 146,
      "comment": "\n     * Validates the object being added to ensure it matches the predicate.\n     * \u003cp\u003e\n     * The predicate itself should not throw an exception, but return false to\n     * indicate that the object cannot be added.\n     *\n     * @param object  the object being added\n     * @throws IllegalArgumentException if the add is invalid\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 145,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.PredicatedCollection.add(E)",
      "begin_line": 157,
      "end_line": 161,
      "comment": "\n     * Override to validate the object being added to ensure it matches\n     * the predicate.\n     *\n     * @param object  the object being added\n     * @return the result of adding to the underlying collection\n     * @throws IllegalArgumentException if the add is invalid\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 25)",
        "(line 160,col 9)-(line 160,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.PredicatedCollection.addAll(java.util.Collection\u003c? extends E\u003e)",
      "begin_line": 172,
      "end_line": 178,
      "comment": "\n     * Override to validate the objects being added to ensure they match\n     * the predicate. If any one fails, no update is made to the underlying\n     * collection.\n     *\n     * @param coll  the collection being added\n     * @return the result of adding to the underlying collection\n     * @throws IllegalArgumentException if the add is invalid\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 176,col 9)",
        "(line 177,col 9)-(line 177,col 40)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Builder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 206,
      "end_line": 442,
      "comment": "\n     * Builder for creating predicated collections.\n     * \u003cp\u003e\n     * Create a Builder with a predicate to validate elements against, then add any elements\n     * to the builder. Elements that fail the predicate will be added to a rejected list.\n     * Finally create or decorate a collection using the createPredicated[List,Set,Bag,Queue] methods.\n     * \u003cp\u003e\n     * An example:\n     * \u003cpre\u003e\n     *   Predicate\u0026lt;String\u0026gt; predicate \u003d NotNullPredicate.notNullPredicate();\n     *   PredicatedCollectionBuilder\u0026lt;String\u0026gt; builder \u003d PredicatedCollection.builder(predicate);\n     *   builder.add(\"item1\");\n     *   builder.add(null);\n     *   builder.add(\"item2\");\n     *   List\u0026lt;String\u0026gt; predicatedList \u003d builder.createPredicatedList();\n     * \u003c/pre\u003e\n     * \u003cp\u003e\n     * At the end of the code fragment above predicatedList is protected by the predicate supplied\n     * to the builder and it contains item1 and item2.\n     * \u003cp\u003e\n     * More elements can be added to the builder once a predicated collection has been created,\n     * but these elements will not be reflected in already created collections.\n     *\n     * @param \u003cE\u003e  the element type\n     * @since 4.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "predicate"
      ],
      "begin_line": 209,
      "end_line": 209,
      "comment": " The predicate to use. "
    },
    {
      "type": "field",
      "varNames": [
        "accepted"
      ],
      "begin_line": 212,
      "end_line": 212,
      "comment": " The buffer containing valid elements. "
    },
    {
      "type": "field",
      "varNames": [
        "rejected"
      ],
      "begin_line": 215,
      "end_line": 215,
      "comment": " The buffer containing rejected elements. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.collection.PredicatedCollection.Builder.Builder(org.apache.commons.collections4.Predicate\u003c? super E\u003e)",
      "begin_line": 224,
      "end_line": 229,
      "comment": "\n         * Constructs a PredicatedCollectionBuilder with the specified Predicate.\n         *\n         * @param predicate  the predicate to use\n         * @throws NullPointerException if predicate is null\n         ",
      "child_ranges": [
        "(line 225,col 13)-(line 227,col 13)",
        "(line 228,col 13)-(line 228,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.PredicatedCollection.Builder.add(E)",
      "begin_line": 240,
      "end_line": 247,
      "comment": "\n         * Adds the item to the builder.\n         * \u003cp\u003e\n         * If the predicate is true, it is added to the list of accepted elements,\n         * otherwise it is added to the rejected list.\n         *\n         * @param item  the element to add\n         * @return the PredicatedCollectionBuilder.\n         ",
      "child_ranges": [
        "(line 241,col 13)-(line 245,col 13)",
        "(line 246,col 13)-(line 246,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.PredicatedCollection.Builder.addAll(java.util.Collection\u003c? extends E\u003e)",
      "begin_line": 258,
      "end_line": 265,
      "comment": "\n         * Adds all elements from the given collection to the builder.\n         * \u003cp\u003e\n         * All elements for which the predicate evaluates to true will be added to the\n         * list of accepted elements, otherwise they are added to the rejected list.\n         *\n         * @param items  the elements to add to the builder\n         * @return the PredicatedCollectionBuilder.\n         ",
      "child_ranges": [
        "(line 259,col 13)-(line 263,col 13)",
        "(line 264,col 13)-(line 264,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.PredicatedCollection.Builder.createPredicatedList()",
      "begin_line": 275,
      "end_line": 277,
      "comment": "\n         * Create a new predicated list filled with the accepted elements.\n         * \u003cp\u003e\n         * The builder is not modified by this method, so it is possible to create more collections\n         * or add more elements afterwards. Further changes will not propagate to the returned list.\n         *\n         * @return a new predicated list.\n         ",
      "child_ranges": [
        "(line 276,col 13)-(line 276,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.PredicatedCollection.Builder.createPredicatedList(java.util.List\u003cE\u003e)",
      "begin_line": 291,
      "end_line": 298,
      "comment": "\n         * Decorates the given list with validating behavior using the predicate. All accepted elements\n         * are appended to the list. If the list already contains elements, they are validated.\n         * \u003cp\u003e\n         * The builder is not modified by this method, so it is possible to create more collections\n         * or add more elements afterwards. Further changes will not propagate to the returned list.\n         *\n         * @param list  the List to decorate, must not be null\n         * @return the decorated list.\n         * @throws NullPointerException if list is null\n         * @throws IllegalArgumentException if list contains invalid elements\n         ",
      "child_ranges": [
        "(line 292,col 13)-(line 294,col 13)",
        "(line 295,col 13)-(line 295,col 90)",
        "(line 296,col 13)-(line 296,col 44)",
        "(line 297,col 13)-(line 297,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.PredicatedCollection.Builder.createPredicatedSet()",
      "begin_line": 308,
      "end_line": 310,
      "comment": "\n         * Create a new predicated set filled with the accepted elements.\n         * \u003cp\u003e\n         * The builder is not modified by this method, so it is possible to create more collections\n         * or add more elements afterwards. Further changes will not propagate to the returned set.\n         *\n         * @return a new predicated set.\n         ",
      "child_ranges": [
        "(line 309,col 13)-(line 309,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.PredicatedCollection.Builder.createPredicatedSet(java.util.Set\u003cE\u003e)",
      "begin_line": 324,
      "end_line": 331,
      "comment": "\n         * Decorates the given list with validating behavior using the predicate. All accepted elements\n         * are appended to the set. If the set already contains elements, they are validated.\n         * \u003cp\u003e\n         * The builder is not modified by this method, so it is possible to create more collections\n         * or add more elements afterwards. Further changes will not propagate to the returned set.\n         *\n         * @param set  the set to decorate, must not be null\n         * @return the decorated set.\n         * @throws NullPointerException if set is null\n         * @throws IllegalArgumentException if set contains invalid elements\n         ",
      "child_ranges": [
        "(line 325,col 13)-(line 327,col 13)",
        "(line 328,col 13)-(line 328,col 95)",
        "(line 329,col 13)-(line 329,col 43)",
        "(line 330,col 13)-(line 330,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.PredicatedCollection.Builder.createPredicatedMultiSet()",
      "begin_line": 341,
      "end_line": 343,
      "comment": "\n         * Create a new predicated multiset filled with the accepted elements.\n         * \u003cp\u003e\n         * The builder is not modified by this method, so it is possible to create more collections\n         * or add more elements afterwards. Further changes will not propagate to the returned multiset.\n         *\n         * @return a new predicated multiset.\n         ",
      "child_ranges": [
        "(line 342,col 13)-(line 342,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.PredicatedCollection.Builder.createPredicatedMultiSet(org.apache.commons.collections4.MultiSet\u003cE\u003e)",
      "begin_line": 357,
      "end_line": 365,
      "comment": "\n         * Decorates the given multiset with validating behavior using the predicate. All accepted elements\n         * are appended to the multiset. If the multiset already contains elements, they are validated.\n         * \u003cp\u003e\n         * The builder is not modified by this method, so it is possible to create more collections\n         * or add more elements afterwards. Further changes will not propagate to the returned multiset.\n         *\n         * @param multiset  the multiset to decorate, must not be null\n         * @return the decorated multiset.\n         * @throws NullPointerException if multiset is null\n         * @throws IllegalArgumentException if multiset contains invalid elements\n         ",
      "child_ranges": [
        "(line 358,col 13)-(line 360,col 13)",
        "(line 361,col 13)-(line 362,col 79)",
        "(line 363,col 13)-(line 363,col 48)",
        "(line 364,col 13)-(line 364,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.PredicatedCollection.Builder.createPredicatedBag()",
      "begin_line": 375,
      "end_line": 377,
      "comment": "\n         * Create a new predicated bag filled with the accepted elements.\n         * \u003cp\u003e\n         * The builder is not modified by this method, so it is possible to create more collections\n         * or add more elements afterwards. Further changes will not propagate to the returned bag.\n         *\n         * @return a new predicated bag.\n         ",
      "child_ranges": [
        "(line 376,col 13)-(line 376,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.PredicatedCollection.Builder.createPredicatedBag(org.apache.commons.collections4.Bag\u003cE\u003e)",
      "begin_line": 391,
      "end_line": 398,
      "comment": "\n         * Decorates the given bag with validating behavior using the predicate. All accepted elements\n         * are appended to the bag. If the bag already contains elements, they are validated.\n         * \u003cp\u003e\n         * The builder is not modified by this method, so it is possible to create more collections\n         * or add more elements afterwards. Further changes will not propagate to the returned bag.\n         *\n         * @param bag  the bag to decorate, must not be null\n         * @return the decorated bag.\n         * @throws NullPointerException if bag is null\n         * @throws IllegalArgumentException if bag contains invalid elements\n         ",
      "child_ranges": [
        "(line 392,col 13)-(line 394,col 13)",
        "(line 395,col 13)-(line 395,col 95)",
        "(line 396,col 13)-(line 396,col 43)",
        "(line 397,col 13)-(line 397,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.PredicatedCollection.Builder.createPredicatedQueue()",
      "begin_line": 408,
      "end_line": 410,
      "comment": "\n         * Create a new predicated queue filled with the accepted elements.\n         * \u003cp\u003e\n         * The builder is not modified by this method, so it is possible to create more collections\n         * or add more elements afterwards. Further changes will not propagate to the returned queue.\n         *\n         * @return a new predicated queue.\n         ",
      "child_ranges": [
        "(line 409,col 13)-(line 409,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.PredicatedCollection.Builder.createPredicatedQueue(java.util.Queue\u003cE\u003e)",
      "begin_line": 424,
      "end_line": 431,
      "comment": "\n         * Decorates the given queue with validating behavior using the predicate. All accepted elements\n         * are appended to the queue. If the queue already contains elements, they are validated.\n         * \u003cp\u003e\n         * The builder is not modified by this method, so it is possible to create more collections\n         * or add more elements afterwards. Further changes will not propagate to the returned queue.\n         *\n         * @param queue  the queue to decorate, must not be null\n         * @return the decorated queue.\n         * @throws NullPointerException if queue is null\n         * @throws IllegalArgumentException if queue contains invalid elements\n         ",
      "child_ranges": [
        "(line 425,col 13)-(line 427,col 13)",
        "(line 428,col 13)-(line 428,col 105)",
        "(line 429,col 13)-(line 429,col 45)",
        "(line 430,col 13)-(line 430,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.PredicatedCollection.Builder.rejectedElements()",
      "begin_line": 438,
      "end_line": 440,
      "comment": "\n         * Returns an unmodifiable collection containing all rejected elements.\n         *\n         * @return an unmodifiable collection\n         ",
      "child_ranges": [
        "(line 439,col 13)-(line 439,col 64)"
      ]
    }
  ]
}