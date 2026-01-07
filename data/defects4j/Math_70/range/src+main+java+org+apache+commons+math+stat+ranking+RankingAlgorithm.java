{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/stat/ranking/RankingAlgorithm.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RankingAlgorithm",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 26,
      "end_line": 41,
      "comment": "\n * Interface representing a rank transformation.\n *\n * @since 2.0\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.ranking.RankingAlgorithm.rank(double[])",
      "begin_line": 40,
      "end_line": 40,
      "comment": "\n     * \u003cp\u003ePerforms a rank transformation on the input data, returning an array\n     * of ranks.\u003c/p\u003e\n     *\n     * \u003cp\u003eRanks should be 1-based - that is, the smallest value\n     * returned in an array of ranks should be greater than or equal to one,\n     * rather than 0. Ranks should in general take integer values, though\n     * implementations may return averages or other floating point values\n     * to resolve ties in the input data.\u003c/p\u003e\n     *\n     * @param data array of data to be ranked\n     * @return an array of ranks corresponding to the elements of the input array\n     ",
      "child_ranges": []
    }
  ]
}