{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/MultiMapUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultiMapUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 44,
      "end_line": 254,
      "comment": "\n * Provides utility methods and decorators for {@link MultiValuedMap} instances.\n * \u003cp\u003e\n * It contains various type safe and null safe methods. Additionally, it provides\n * the following decorators:\n * \u003cul\u003e\n *   \u003cli\u003e{@link #unmodifiableMultiValuedMap(MultiValuedMap)}\u003c/li\u003e\n *   \u003cli\u003e{@link #transformedMultiValuedMap(MultiValuedMap, Transformer, Transformer)}\u003c/li\u003e\n * \u003c/ul\u003e\n *\n * @since 4.1\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.MultiMapUtils.MultiMapUtils()",
      "begin_line": 49,
      "end_line": 49,
      "comment": "\n     * \u003ccode\u003eMultiMapUtils\u003c/code\u003e should not normally be instantiated.\n     ",
      "child_ranges": []
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_MULTI_VALUED_MAP"
      ],
      "begin_line": 54,
      "end_line": 56,
      "comment": "\n     * An empty {@link UnmodifiableMultiValuedMap}.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MultiMapUtils.emptyMultiValuedMap()",
      "begin_line": 65,
      "end_line": 68,
      "comment": "\n     * Returns immutable EMPTY_MULTI_VALUED_MAP with generic type safety.\n     *\n     * @param \u003cK\u003e the type of key in the map\n     * @param \u003cV\u003e the type of value in the map\n     * @return immutable and empty \u003ccode\u003eMultiValuedMap\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MultiMapUtils.emptyIfNull(org.apache.commons.collections4.MultiValuedMap\u003cK, V\u003e)",
      "begin_line": 81,
      "end_line": 84,
      "comment": "\n     * Returns an immutable empty \u003ccode\u003eMultiValuedMap\u003c/code\u003e if the argument is\n     * \u003ccode\u003enull\u003c/code\u003e, or the argument itself otherwise.\n     *\n     * @param \u003cK\u003e the type of key in the map\n     * @param \u003cV\u003e the type of value in the map\n     * @param map  the map, may be null\n     * @return an empty {@link MultiValuedMap} if the argument is null\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MultiMapUtils.isEmpty(org.apache.commons.collections4.MultiValuedMap\u003c?, ?\u003e)",
      "begin_line": 94,
      "end_line": 96,
      "comment": "\n     * Null-safe check if the specified \u003ccode\u003eMultiValuedMap\u003c/code\u003e is empty.\n     * \u003cp\u003e\n     * If the provided map is null, returns true.\n     *\n     * @param map  the map to check, may be null\n     * @return true if the map is empty or null\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MultiMapUtils.getCollection(org.apache.commons.collections4.MultiValuedMap\u003cK, V\u003e, K)",
      "begin_line": 110,
      "end_line": 115,
      "comment": "\n     * Gets a Collection from \u003ccode\u003eMultiValuedMap\u003c/code\u003e in a null-safe manner.\n     *\n     * @param \u003cK\u003e the key type\n     * @param \u003cV\u003e the value type\n     * @param map  the {@link MultiValuedMap} to use\n     * @param key  the key to look up\n     * @return the Collection in the {@link MultiValuedMap}, or null if input map is null\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 113,col 9)",
        "(line 114,col 9)-(line 114,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MultiMapUtils.getValuesAsList(org.apache.commons.collections4.MultiValuedMap\u003cK, V\u003e, K)",
      "begin_line": 129,
      "end_line": 138,
      "comment": "\n     * Gets a List from \u003ccode\u003eMultiValuedMap\u003c/code\u003e in a null-safe manner.\n     *\n     * @param \u003cK\u003e the key type\n     * @param \u003cV\u003e the value type\n     * @param map  the {@link MultiValuedMap} to use\n     * @param key  the key to look up\n     * @return the Collection in the {@link MultiValuedMap} as List, or null if input map is null\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 136,col 9)",
        "(line 137,col 9)-(line 137,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MultiMapUtils.getValuesAsSet(org.apache.commons.collections4.MultiValuedMap\u003cK, V\u003e, K)",
      "begin_line": 149,
      "end_line": 158,
      "comment": "\n     * Gets a Set from \u003ccode\u003eMultiValuedMap\u003c/code\u003e in a null-safe manner.\n     *\n     * @param \u003cK\u003e the key type\n     * @param \u003cV\u003e the value type\n     * @param map  the {@link MultiValuedMap} to use\n     * @param key  the key to look up\n     * @return the Collection in the {@link MultiValuedMap} as Set, or null if input map is null\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 156,col 9)",
        "(line 157,col 9)-(line 157,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MultiMapUtils.getValuesAsBag(org.apache.commons.collections4.MultiValuedMap\u003cK, V\u003e, K)",
      "begin_line": 169,
      "end_line": 178,
      "comment": "\n     * Gets a Bag from \u003ccode\u003eMultiValuedMap\u003c/code\u003e in a null-safe manner.\n     *\n     * @param \u003cK\u003e the key type\n     * @param \u003cV\u003e the value type\n     * @param map  the {@link MultiValuedMap} to use\n     * @param key  the key to look up\n     * @return the Collection in the {@link MultiValuedMap} as Bag, or null if input map is null\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 176,col 9)",
        "(line 177,col 9)-(line 177,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MultiMapUtils.newListValuedHashMap()",
      "begin_line": 191,
      "end_line": 193,
      "comment": "\n     * Creates a {@link ListValuedMap} with an {@link java.util.ArrayList ArrayList} as\n     * collection class to store the values mapped to a key.\n     *\n     * @param \u003cK\u003e the key type\n     * @param \u003cV\u003e the value type\n     * @return a new \u003ccode\u003eListValuedMap\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MultiMapUtils.newSetValuedHashMap()",
      "begin_line": 203,
      "end_line": 205,
      "comment": "\n     * Creates a {@link SetValuedMap} with an {@link java.util.HashSet HashSet} as\n     * collection class to store the values mapped to a key.\n     *\n     * @param \u003cK\u003e the key type\n     * @param \u003cV\u003e the value type\n     * @return a new {@link SetValuedMap}\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MultiMapUtils.unmodifiableMultiValuedMap(org.apache.commons.collections4.MultiValuedMap\u003c? extends K, ? extends V\u003e)",
      "begin_line": 220,
      "end_line": 223,
      "comment": "\n     * Returns an \u003ccode\u003eUnmodifiableMultiValuedMap\u003c/code\u003e backed by the given\n     * map.\n     *\n     * @param \u003cK\u003e the key type\n     * @param \u003cV\u003e the value type\n     * @param map  the {@link MultiValuedMap} to decorate, must not be null\n     * @return an unmodifiable {@link MultiValuedMap} backed by the provided map\n     * @throws NullPointerException if map is null\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MultiMapUtils.transformedMultiValuedMap(org.apache.commons.collections4.MultiValuedMap\u003cK, V\u003e, org.apache.commons.collections4.Transformer\u003c? super K, ? extends K\u003e, org.apache.commons.collections4.Transformer\u003c? super V, ? extends V\u003e)",
      "begin_line": 248,
      "end_line": 252,
      "comment": "\n     * Returns a \u003ccode\u003eTransformedMultiValuedMap\u003c/code\u003e backed by the given map.\n     * \u003cp\u003e\n     * This method returns a new \u003ccode\u003eMultiValuedMap\u003c/code\u003e (decorating the\n     * specified map) that will transform any new entries added to it. Existing\n     * entries in the specified map will not be transformed. If you want that\n     * behaviour, see {@link TransformedMultiValuedMap#transformedMap}.\n     * \u003cp\u003e\n     * Each object is passed through the transformers as it is added to the Map.\n     * It is important not to use the original map after invoking this method,\n     * as it is a back door for adding untransformed objects.\n     * \u003cp\u003e\n     * If there are any elements already in the map being decorated, they are\n     * NOT transformed.\n     *\n     * @param \u003cK\u003e the key type\n     * @param \u003cV\u003e the value type\n     * @param map  the {@link MultiValuedMap} to transform, must not be null, typically empty\n     * @param keyTransformer  the transformer for the map keys, null means no transformation\n     * @param valueTransformer  the transformer for the map values, null means no transformation\n     * @return a transformed \u003ccode\u003eMultiValuedMap\u003c/code\u003e backed by the given map\n     * @throws NullPointerException if map is null\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 96)"
      ]
    }
  ]
}