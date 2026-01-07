{
  "filepath": "/tmp/Math-47b/src/main/java/org/apache/commons/math/geometry/euclidean/oned/IntervalsSet.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "IntervalsSet",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.geometry.partitioning.AbstractRegion\u003corg.apache.commons.math.geometry.euclidean.oned.Euclidean1D, org.apache.commons.math.geometry.euclidean.oned.Euclidean1D\u003e"
      ],
      "begin_line": 31,
      "end_line": 243,
      "comment": " This class represents a 1D region: a set of intervals.\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.euclidean.oned.IntervalsSet.IntervalsSet()",
      "begin_line": 35,
      "end_line": 37,
      "comment": " Build an intervals set representing the whole real line.\n     ",
      "child_ranges": [
        "(line 36,col 9)-(line 36,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.euclidean.oned.IntervalsSet.IntervalsSet(double, double)",
      "begin_line": 45,
      "end_line": 47,
      "comment": " Build an intervals set corresponding to a single interval.\n     * @param lower lower bound of the interval, must be lesser or equal\n     * to {@code upper} (may be {@code Double.NEGATIVE_INFINITY})\n     * @param upper upper bound of the interval, must be greater or equal\n     * to {@code lower} (may be {@code Double.POSITIVE_INFINITY})\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 39)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.euclidean.oned.IntervalsSet.IntervalsSet(org.apache.commons.math.geometry.partitioning.BSPTree\u003corg.apache.commons.math.geometry.euclidean.oned.Euclidean1D\u003e)",
      "begin_line": 58,
      "end_line": 60,
      "comment": " Build an intervals set from an inside/outside BSP tree.\n     * \u003cp\u003eThe leaf nodes of the BSP tree \u003cem\u003emust\u003c/em\u003e have a\n     * {@code Boolean} attribute representing the inside status of\n     * the corresponding cell (true for inside cells, false for outside\n     * cells). In order to avoid building too many small objects, it is\n     * recommended to use the predefined constants\n     * {@code Boolean.TRUE} and {@code Boolean.FALSE}\u003c/p\u003e\n     * @param tree inside/outside BSP tree representing the intervals set\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 20)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.euclidean.oned.IntervalsSet.IntervalsSet(java.util.Collection\u003corg.apache.commons.math.geometry.partitioning.SubHyperplane\u003corg.apache.commons.math.geometry.euclidean.oned.Euclidean1D\u003e\u003e)",
      "begin_line": 81,
      "end_line": 83,
      "comment": " Build an intervals set from a Boundary REPresentation (B-rep).\n     * \u003cp\u003eThe boundary is provided as a collection of {@link\n     * SubHyperplane sub-hyperplanes}. Each sub-hyperplane has the\n     * interior part of the region on its minus side and the exterior on\n     * its plus side.\u003c/p\u003e\n     * \u003cp\u003eThe boundary elements can be in any order, and can form\n     * several non-connected sets (like for example polygons with holes\n     * or a set of disjoints polyhedrons considered as a whole). In\n     * fact, the elements do not even need to be connected together\n     * (their topological connections are not used here). However, if the\n     * boundary does not really separate an inside open from an outside\n     * open (open having here its topological meaning), then subsequent\n     * calls to the {@link\n     * org.apache.commons.math.geometry.partitioning.Region#checkPoint(org.apache.commons.math.geometry.Vector)\n     * checkPoint} method will not be meaningful anymore.\u003c/p\u003e\n     * \u003cp\u003eIf the boundary is empty, the region will represent the whole\n     * space.\u003c/p\u003e\n     * @param boundary collection of boundary elements\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.oned.IntervalsSet.buildTree(double, double)",
      "begin_line": 92,
      "end_line": 127,
      "comment": " Build an inside/outside tree representing a single interval.\n     * @param lower lower bound of the interval, must be lesser or equal\n     * to {@code upper} (may be {@code Double.NEGATIVE_INFINITY})\n     * @param upper upper bound of the interval, must be greater or equal\n     * to {@code lower} (may be {@code Double.POSITIVE_INFINITY})\n     * @return the built tree\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 105,col 9)",
        "(line 106,col 9)-(line 107,col 76)",
        "(line 108,col 9)-(line 114,col 9)",
        "(line 117,col 9)-(line 118,col 75)",
        "(line 119,col 9)-(line 125,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.oned.IntervalsSet.buildNew(org.apache.commons.math.geometry.partitioning.BSPTree\u003corg.apache.commons.math.geometry.euclidean.oned.Euclidean1D\u003e)",
      "begin_line": 130,
      "end_line": 132,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.oned.IntervalsSet.computeGeometricalProperties()",
      "begin_line": 135,
      "end_line": 149,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 136,col 9)-(line 148,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.oned.IntervalsSet.getInf()",
      "begin_line": 157,
      "end_line": 166,
      "comment": " Get the lowest value belonging to the instance.\n     * @return lowest value belonging to the instance\n     * ({@code Double.NEGATIVE_INFINITY} if the instance doesn\u0027t\n     * have any low bound, {@code Double.POSITIVE_INFINITY} if the\n     * instance is empty)\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 51)",
        "(line 159,col 9)-(line 159,col 48)",
        "(line 160,col 9)-(line 164,col 9)",
        "(line 165,col 9)-(line 165,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.oned.IntervalsSet.getSup()",
      "begin_line": 174,
      "end_line": 183,
      "comment": " Get the highest value belonging to the instance.\n     * @return highest value belonging to the instance\n     * ({@code Double.POSITIVE_INFINITY} if the instance doesn\u0027t\n     * have any high bound, {@code Double.NEGATIVE_INFINITY} if the\n     * instance is empty)\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 51)",
        "(line 176,col 9)-(line 176,col 48)",
        "(line 177,col 9)-(line 181,col 9)",
        "(line 182,col 9)-(line 182,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.oned.IntervalsSet.asList()",
      "begin_line": 198,
      "end_line": 203,
      "comment": " Build an ordered list of intervals representing the instance.\n     * \u003cp\u003eThis method builds this intervals set as an ordered list of\n     * {@link Interval Interval} elements. If the intervals set has no\n     * lower limit, the first interval will have its low bound equal to\n     * {@code Double.NEGATIVE_INFINITY}. If the intervals set has\n     * no upper limit, the last interval will have its upper bound equal\n     * to {@code Double.POSITIVE_INFINITY}. An empty tree will\n     * build an empty list while a tree representing the whole real line\n     * will build a one element list with both bounds beeing\n     * infinite.\u003c/p\u003e\n     * @return a new ordered list containing {@link Interval Interval}\n     * elements\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 62)",
        "(line 200,col 9)-(line 201,col 72)",
        "(line 202,col 9)-(line 202,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.oned.IntervalsSet.recurseList(org.apache.commons.math.geometry.partitioning.BSPTree\u003corg.apache.commons.math.geometry.euclidean.oned.Euclidean1D\u003e, java.util.List\u003corg.apache.commons.math.geometry.euclidean.oned.Interval\u003e, double, double)",
      "begin_line": 211,
      "end_line": 241,
      "comment": " Update an intervals list.\n     * @param node current node\n     * @param list list to update\n     * @param lower lower bound of the current convex cell\n     * @param upper upper bound of the current convex cell\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 239,col 9)"
      ]
    }
  ]
}