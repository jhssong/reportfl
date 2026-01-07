{
  "filepath": "/tmp/Collections-27b/src/main/java/org/apache/commons/collections4/MultiMapUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultiMapUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 43,
      "end_line": 281,
      "comment": "\n * Provides utility methods and decorators for {@link MultiValuedMap} instances.\n * \u003cp\u003e\n * It contains various type safe and null safe methods. Additionally, it provides\n * the following decorators:\n * \u003cul\u003e\n *   \u003cli\u003e{@link #unmodifiableMultiValuedMap(MultiValuedMap)}\u003c/li\u003e\n *   \u003cli\u003e{@link #transformedMultiValuedMap(MultiValuedMap, Transformer, Transformer)}\u003c/li\u003e\n * \u003c/ul\u003e\n *\n * @since 4.1\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.MultiMapUtils.MultiMapUtils()",
      "begin_line": 48,
      "end_line": 48,
      "comment": "\n     * \u003ccode\u003eMultiMapUtils\u003c/code\u003e should not normally be instantiated.\n     ",
      "child_ranges": []
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_MULTI_VALUED_MAP"
      ],
      "begin_line": 53,
      "end_line": 55,
      "comment": "\n     * An empty {@link UnmodifiableMultiValuedMap}.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MultiMapUtils.emptyMultiValuedMap()",
      "begin_line": 64,
      "end_line": 67,
      "comment": "\n     * Returns immutable EMPTY_MULTI_VALUED_MAP with generic type safety.\n     *\n     * @param \u003cK\u003e the type of key in the map\n     * @param \u003cV\u003e the type of value in the map\n     * @return immutable and empty \u003ccode\u003eMultiValuedMap\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MultiMapUtils.emptyIfNull(org.apache.commons.collections4.MultiValuedMap\u003cK, V\u003e)",
      "begin_line": 80,
      "end_line": 83,
      "comment": "\n     * Returns an immutable empty \u003ccode\u003eMultiValuedMap\u003c/code\u003e if the argument is\n     * \u003ccode\u003enull\u003c/code\u003e, or the argument itself otherwise.\n     *\n     * @param \u003cK\u003e the type of key in the map\n     * @param \u003cV\u003e the type of value in the map\n     * @param map  the map, may be null\n     * @return an empty {@link MultiValuedMap} if the argument is null\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MultiMapUtils.isEmpty(org.apache.commons.collections4.MultiValuedMap\u003c?, ?\u003e)",
      "begin_line": 93,
      "end_line": 95,
      "comment": "\n     * Null-safe check if the specified \u003ccode\u003eMultiValuedMap\u003c/code\u003e is empty.\n     * \u003cp\u003e\n     * If the provided map is null, returns true.\n     *\n     * @param map  the map to check, may be null\n     * @return true if the map is empty or null\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MultiMapUtils.getCollection(org.apache.commons.collections4.MultiValuedMap\u003cK, V\u003e, K)",
      "begin_line": 109,
      "end_line": 114,
      "comment": "\n     * Gets a Collection from \u003ccode\u003eMultiValuedMap\u003c/code\u003e in a null-safe manner.\n     *\n     * @param \u003cK\u003e the key type\n     * @param \u003cV\u003e the value type\n     * @param map  the {@link MultiValuedMap} to use\n     * @param key  the key to look up\n     * @return the Collection in the {@link MultiValuedMap}, or null if input map is null\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 112,col 9)",
        "(line 113,col 9)-(line 113,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MultiMapUtils.getValuesAsList(org.apache.commons.collections4.MultiValuedMap\u003cK, V\u003e, K)",
      "begin_line": 128,
      "end_line": 137,
      "comment": "\n     * Gets a List from \u003ccode\u003eMultiValuedMap\u003c/code\u003e in a null-safe manner.\n     *\n     * @param \u003cK\u003e the key type\n     * @param \u003cV\u003e the value type\n     * @param map  the {@link MultiValuedMap} to use\n     * @param key  the key to look up\n     * @return the Collection in the {@link MultiValuedMap} as List, or null if input map is null\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 135,col 9)",
        "(line 136,col 9)-(line 136,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MultiMapUtils.getValuesAsSet(org.apache.commons.collections4.MultiValuedMap\u003cK, V\u003e, K)",
      "begin_line": 148,
      "end_line": 157,
      "comment": "\n     * Gets a Set from \u003ccode\u003eMultiValuedMap\u003c/code\u003e in a null-safe manner.\n     *\n     * @param \u003cK\u003e the key type\n     * @param \u003cV\u003e the value type\n     * @param map  the {@link MultiValuedMap} to use\n     * @param key  the key to look up\n     * @return the Collection in the {@link MultiValuedMap} as Set, or null if input map is null\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 155,col 9)",
        "(line 156,col 9)-(line 156,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MultiMapUtils.getValuesAsBag(org.apache.commons.collections4.MultiValuedMap\u003cK, V\u003e, K)",
      "begin_line": 168,
      "end_line": 177,
      "comment": "\n     * Gets a Bag from \u003ccode\u003eMultiValuedMap\u003c/code\u003e in a null-safe manner.\n     *\n     * @param \u003cK\u003e the key type\n     * @param \u003cV\u003e the value type\n     * @param map  the {@link MultiValuedMap} to use\n     * @param key  the key to look up\n     * @return the Collection in the {@link MultiValuedMap} as Bag, or null if input map is null\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 175,col 9)",
        "(line 176,col 9)-(line 176,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MultiMapUtils.newListValuedHashMap()",
      "begin_line": 190,
      "end_line": 192,
      "comment": "\n     * Creates a {@link ListValuedMap} with an {@link java.util.ArrayList ArrayList} as\n     * collection class to store the values mapped to a key.\n     *\n     * @param \u003cK\u003e the key type\n     * @param \u003cV\u003e the value type\n     * @return a new \u003ccode\u003eListValuedMap\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MultiMapUtils.newListValuedHashMap(java.lang.Class\u003cC\u003e)",
      "begin_line": 204,
      "end_line": 206,
      "comment": "\n     * Creates a {@link ListValuedMap} with a {@link java.util.HashMap HashMap} as its internal\n     * storage which maps the keys to list of type \u003ccode\u003elistClass\u003c/code\u003e.\n     *\n     * @param \u003cK\u003e the key type\n     * @param \u003cV\u003e the value type\n     * @param \u003cC\u003e the List class type\n     * @param listClass the class of the list\n     * @return a new {@link ListValuedMap}\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MultiMapUtils.newSetValuedHashMap()",
      "begin_line": 216,
      "end_line": 218,
      "comment": "\n     * Creates a {@link SetValuedMap} with an {@link java.util.HashSet HashSet} as\n     * collection class to store the values mapped to a key.\n     *\n     * @param \u003cK\u003e the key type\n     * @param \u003cV\u003e the value type\n     * @return a new {@link SetValuedMap}\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MultiMapUtils.newSetValuedHashMap(java.lang.Class\u003cC\u003e)",
      "begin_line": 230,
      "end_line": 232,
      "comment": "\n     * Creates a {@link SetValuedMap} with a {@link java.util.HashMap HashMap} as its internal\n     * storage which maps the keys to a set of type \u003ccode\u003esetClass\u003c/code\u003e\n     *\n     * @param \u003cK\u003e the key type\n     * @param \u003cV\u003e the value type\n     * @param \u003cC\u003e the Set class type\n     * @param setClass  the class of the set\n     * @return a new {@link SetValuedMap}\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MultiMapUtils.unmodifiableMultiValuedMap(org.apache.commons.collections4.MultiValuedMap\u003c? extends K, ? extends V\u003e)",
      "begin_line": 247,
      "end_line": 250,
      "comment": "\n     * Returns an \u003ccode\u003eUnmodifiableMultiValuedMap\u003c/code\u003e backed by the given\n     * map.\n     *\n     * @param \u003cK\u003e the key type\n     * @param \u003cV\u003e the value type\n     * @param map  the {@link MultiValuedMap} to decorate, must not be null\n     * @return an unmodifiable {@link MultiValuedMap} backed by the provided map\n     * @throws NullPointerException if map is null\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MultiMapUtils.transformedMultiValuedMap(org.apache.commons.collections4.MultiValuedMap\u003cK, V\u003e, org.apache.commons.collections4.Transformer\u003c? super K, ? extends K\u003e, org.apache.commons.collections4.Transformer\u003c? super V, ? extends V\u003e)",
      "begin_line": 275,
      "end_line": 279,
      "comment": "\n     * Returns a \u003ccode\u003eTransformedMultiValuedMap\u003c/code\u003e backed by the given map.\n     * \u003cp\u003e\n     * This method returns a new \u003ccode\u003eMultiValuedMap\u003c/code\u003e (decorating the\n     * specified map) that will transform any new entries added to it. Existing\n     * entries in the specified map will not be transformed. If you want that\n     * behaviour, see {@link TransformedMultiValuedMap#transformedMap}.\n     * \u003cp\u003e\n     * Each object is passed through the transformers as it is added to the Map.\n     * It is important not to use the original map after invoking this method,\n     * as it is a back door for adding untransformed objects.\n     * \u003cp\u003e\n     * If there are any elements already in the map being decorated, they are\n     * NOT transformed.\n     *\n     * @param \u003cK\u003e the key type\n     * @param \u003cV\u003e the value type\n     * @param map  the {@link MultiValuedMap} to transform, must not be null, typically empty\n     * @param keyTransformer  the transformer for the map keys, null means no transformation\n     * @param valueTransformer  the transformer for the map values, null means no transformation\n     * @return a transformed \u003ccode\u003eMultiValuedMap\u003c/code\u003e backed by the given map\n     * @throws NullPointerException if map is null\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 96)"
      ]
    }
  ]
}