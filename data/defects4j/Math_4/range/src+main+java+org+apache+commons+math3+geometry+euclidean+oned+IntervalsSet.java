{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/geometry/euclidean/oned/IntervalsSet.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "IntervalsSet",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.geometry.partitioning.AbstractRegion\u003corg.apache.commons.math3.geometry.euclidean.oned.Euclidean1D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D\u003e"
      ],
      "begin_line": 32,
      "end_line": 252,
      "comment": " This class represents a 1D region: a set of intervals.\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet.IntervalsSet()",
      "begin_line": 36,
      "end_line": 38,
      "comment": " Build an intervals set representing the whole real line.\n     ",
      "child_ranges": [
        "(line 37,col 9)-(line 37,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet.IntervalsSet(double, double)",
      "begin_line": 46,
      "end_line": 48,
      "comment": " Build an intervals set corresponding to a single interval.\n     * @param lower lower bound of the interval, must be lesser or equal\n     * to {@code upper} (may be {@code Double.NEGATIVE_INFINITY})\n     * @param upper upper bound of the interval, must be greater or equal\n     * to {@code lower} (may be {@code Double.POSITIVE_INFINITY})\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 39)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet.IntervalsSet(org.apache.commons.math3.geometry.partitioning.BSPTree\u003corg.apache.commons.math3.geometry.euclidean.oned.Euclidean1D\u003e)",
      "begin_line": 59,
      "end_line": 61,
      "comment": " Build an intervals set from an inside/outside BSP tree.\n     * \u003cp\u003eThe leaf nodes of the BSP tree \u003cem\u003emust\u003c/em\u003e have a\n     * {@code Boolean} attribute representing the inside status of\n     * the corresponding cell (true for inside cells, false for outside\n     * cells). In order to avoid building too many small objects, it is\n     * recommended to use the predefined constants\n     * {@code Boolean.TRUE} and {@code Boolean.FALSE}\u003c/p\u003e\n     * @param tree inside/outside BSP tree representing the intervals set\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 20)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet.IntervalsSet(java.util.Collection\u003corg.apache.commons.math3.geometry.partitioning.SubHyperplane\u003corg.apache.commons.math3.geometry.euclidean.oned.Euclidean1D\u003e\u003e)",
      "begin_line": 82,
      "end_line": 84,
      "comment": " Build an intervals set from a Boundary REPresentation (B-rep).\n     * \u003cp\u003eThe boundary is provided as a collection of {@link\n     * SubHyperplane sub-hyperplanes}. Each sub-hyperplane has the\n     * interior part of the region on its minus side and the exterior on\n     * its plus side.\u003c/p\u003e\n     * \u003cp\u003eThe boundary elements can be in any order, and can form\n     * several non-connected sets (like for example polygons with holes\n     * or a set of disjoints polyhedrons considered as a whole). In\n     * fact, the elements do not even need to be connected together\n     * (their topological connections are not used here). However, if the\n     * boundary does not really separate an inside open from an outside\n     * open (open having here its topological meaning), then subsequent\n     * calls to the {@link\n     * org.apache.commons.math3.geometry.partitioning.Region#checkPoint(org.apache.commons.math3.geometry.Vector)\n     * checkPoint} method will not be meaningful anymore.\u003c/p\u003e\n     * \u003cp\u003eIf the boundary is empty, the region will represent the whole\n     * space.\u003c/p\u003e\n     * @param boundary collection of boundary elements\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet.buildTree(double, double)",
      "begin_line": 93,
      "end_line": 128,
      "comment": " Build an inside/outside tree representing a single interval.\n     * @param lower lower bound of the interval, must be lesser or equal\n     * to {@code upper} (may be {@code Double.NEGATIVE_INFINITY})\n     * @param upper upper bound of the interval, must be greater or equal\n     * to {@code lower} (may be {@code Double.POSITIVE_INFINITY})\n     * @return the built tree\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 106,col 9)",
        "(line 107,col 9)-(line 108,col 76)",
        "(line 109,col 9)-(line 115,col 9)",
        "(line 118,col 9)-(line 119,col 75)",
        "(line 120,col 9)-(line 126,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet.buildNew(org.apache.commons.math3.geometry.partitioning.BSPTree\u003corg.apache.commons.math3.geometry.euclidean.oned.Euclidean1D\u003e)",
      "begin_line": 131,
      "end_line": 134,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet.computeGeometricalProperties()",
      "begin_line": 137,
      "end_line": 158,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 139,col 9)-(line 157,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet.getInf()",
      "begin_line": 166,
      "end_line": 175,
      "comment": " Get the lowest value belonging to the instance.\n     * @return lowest value belonging to the instance\n     * ({@code Double.NEGATIVE_INFINITY} if the instance doesn\u0027t\n     * have any low bound, {@code Double.POSITIVE_INFINITY} if the\n     * instance is empty)\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 51)",
        "(line 168,col 9)-(line 168,col 48)",
        "(line 169,col 9)-(line 173,col 9)",
        "(line 174,col 9)-(line 174,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet.getSup()",
      "begin_line": 183,
      "end_line": 192,
      "comment": " Get the highest value belonging to the instance.\n     * @return highest value belonging to the instance\n     * ({@code Double.POSITIVE_INFINITY} if the instance doesn\u0027t\n     * have any high bound, {@code Double.NEGATIVE_INFINITY} if the\n     * instance is empty)\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 51)",
        "(line 185,col 9)-(line 185,col 48)",
        "(line 186,col 9)-(line 190,col 9)",
        "(line 191,col 9)-(line 191,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet.asList()",
      "begin_line": 207,
      "end_line": 212,
      "comment": " Build an ordered list of intervals representing the instance.\n     * \u003cp\u003eThis method builds this intervals set as an ordered list of\n     * {@link Interval Interval} elements. If the intervals set has no\n     * lower limit, the first interval will have its low bound equal to\n     * {@code Double.NEGATIVE_INFINITY}. If the intervals set has\n     * no upper limit, the last interval will have its upper bound equal\n     * to {@code Double.POSITIVE_INFINITY}. An empty tree will\n     * build an empty list while a tree representing the whole real line\n     * will build a one element list with both bounds beeing\n     * infinite.\u003c/p\u003e\n     * @return a new ordered list containing {@link Interval Interval}\n     * elements\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 62)",
        "(line 209,col 9)-(line 210,col 72)",
        "(line 211,col 9)-(line 211,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet.recurseList(org.apache.commons.math3.geometry.partitioning.BSPTree\u003corg.apache.commons.math3.geometry.euclidean.oned.Euclidean1D\u003e, java.util.List\u003corg.apache.commons.math3.geometry.euclidean.oned.Interval\u003e, double, double)",
      "begin_line": 220,
      "end_line": 250,
      "comment": " Update an intervals list.\n     * @param node current node\n     * @param list list to update\n     * @param lower lower bound of the current convex cell\n     * @param upper upper bound of the current convex cell\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 248,col 9)"
      ]
    }
  ]
}