// Targeted by JavaCPP version 1.4.4: DO NOT EDIT THIS FILE

package org.bytedeco.javacpp;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.opencv_core.*;
import static org.bytedeco.javacpp.opencv_imgproc.*;
import static org.bytedeco.javacpp.opencv_imgcodecs.*;
import static org.bytedeco.javacpp.opencv_videoio.*;
import static org.bytedeco.javacpp.opencv_highgui.*;
import static org.bytedeco.javacpp.opencv_flann.*;
import static org.bytedeco.javacpp.opencv_features2d.*;
import static org.bytedeco.javacpp.opencv_calib3d.*;
import static org.bytedeco.javacpp.opencv_objdetect.*;
import static org.bytedeco.javacpp.opencv_ximgproc.*;
import static org.bytedeco.javacpp.opencv_video.*;
import static org.bytedeco.javacpp.opencv_optflow.*;
import static org.bytedeco.javacpp.opencv_cudaarithm.*;
import static org.bytedeco.javacpp.opencv_cudafilters.*;
import static org.bytedeco.javacpp.opencv_cudaimgproc.*;
import static org.bytedeco.javacpp.opencv_cudawarping.*;

public class opencv_cudaoptflow extends org.bytedeco.javacpp.presets.opencv_cudaoptflow {
    static { Loader.load(); }

// Parsed from <opencv2/cudaoptflow.hpp>

/*M///////////////////////////////////////////////////////////////////////////////////////
//
//  IMPORTANT: READ BEFORE DOWNLOADING, COPYING, INSTALLING OR USING.
//
//  By downloading, copying, installing or using the software you agree to this license.
//  If you do not agree to this license, do not download, install,
//  copy or use the software.
//
//
//                           License Agreement
//                For Open Source Computer Vision Library
//
// Copyright (C) 2000-2008, Intel Corporation, all rights reserved.
// Copyright (C) 2009, Willow Garage Inc., all rights reserved.
// Third party copyrights are property of their respective owners.
//
// Redistribution and use in source and binary forms, with or without modification,
// are permitted provided that the following conditions are met:
//
//   * Redistribution's of source code must retain the above copyright notice,
//     this list of conditions and the following disclaimer.
//
//   * Redistribution's in binary form must reproduce the above copyright notice,
//     this list of conditions and the following disclaimer in the documentation
//     and/or other materials provided with the distribution.
//
//   * The name of the copyright holders may not be used to endorse or promote products
//     derived from this software without specific prior written permission.
//
// This software is provided by the copyright holders and contributors "as is" and
// any express or implied warranties, including, but not limited to, the implied
// warranties of merchantability and fitness for a particular purpose are disclaimed.
// In no event shall the Intel Corporation or contributors be liable for any direct,
// indirect, incidental, special, exemplary, or consequential damages
// (including, but not limited to, procurement of substitute goods or services;
// loss of use, data, or profits; or business interruption) however caused
// and on any theory of liability, whether in contract, strict liability,
// or tort (including negligence or otherwise) arising in any way out of
// the use of this software, even if advised of the possibility of such damage.
//
//M*/

// #ifndef OPENCV_CUDAOPTFLOW_HPP
// #define OPENCV_CUDAOPTFLOW_HPP

// #ifndef __cplusplus
// #endif

// #include "opencv2/core/cuda.hpp"

/**
  \addtogroup cuda
  \{
    \defgroup cudaoptflow Optical Flow
  \}
 */

/** \addtogroup cudaoptflow
 *  \{ */

//
// Interface
//

/** \brief Base interface for dense optical flow algorithms.
 */
@Namespace("cv::cuda") public static class DenseOpticalFlow extends Algorithm {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DenseOpticalFlow(Pointer p) { super(p); }

    /** \brief Calculates a dense optical flow.
    <p>
    @param I0 first input image.
    @param I1 second input image of the same size and the same type as I0.
    @param flow computed flow image that has the same size as I0 and type CV_32FC2.
    @param stream Stream for the asynchronous version.
     */
    public native void calc(@ByVal Mat I0, @ByVal Mat I1, @ByVal Mat flow, @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
    public native void calc(@ByVal Mat I0, @ByVal Mat I1, @ByVal Mat flow);
    public native void calc(@ByVal UMat I0, @ByVal UMat I1, @ByVal UMat flow, @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
    public native void calc(@ByVal UMat I0, @ByVal UMat I1, @ByVal UMat flow);
    public native void calc(@ByVal GpuMat I0, @ByVal GpuMat I1, @ByVal GpuMat flow, @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
    public native void calc(@ByVal GpuMat I0, @ByVal GpuMat I1, @ByVal GpuMat flow);
}

/** \brief Base interface for sparse optical flow algorithms.
 */
@Namespace("cv::cuda") public static class SparseOpticalFlow extends Algorithm {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SparseOpticalFlow(Pointer p) { super(p); }

    /** \brief Calculates a sparse optical flow.
    <p>
    @param prevImg First input image.
    @param nextImg Second input image of the same size and the same type as prevImg.
    @param prevPts Vector of 2D points for which the flow needs to be found.
    @param nextPts Output vector of 2D points containing the calculated new positions of input features in the second image.
    @param status Output status vector. Each element of the vector is set to 1 if the
                  flow for the corresponding features has been found. Otherwise, it is set to 0.
    @param err Optional output vector that contains error response for each point (inverse confidence).
    @param stream Stream for the asynchronous version.
     */
    public native void calc(@ByVal Mat prevImg, @ByVal Mat nextImg,
                          @ByVal Mat prevPts, @ByVal Mat nextPts,
                          @ByVal Mat status,
                          @ByVal(nullValue = "cv::OutputArray(cv::noArray())") Mat err,
                          @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
    public native void calc(@ByVal Mat prevImg, @ByVal Mat nextImg,
                          @ByVal Mat prevPts, @ByVal Mat nextPts,
                          @ByVal Mat status);
    public native void calc(@ByVal UMat prevImg, @ByVal UMat nextImg,
                          @ByVal UMat prevPts, @ByVal UMat nextPts,
                          @ByVal UMat status,
                          @ByVal(nullValue = "cv::OutputArray(cv::noArray())") UMat err,
                          @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
    public native void calc(@ByVal UMat prevImg, @ByVal UMat nextImg,
                          @ByVal UMat prevPts, @ByVal UMat nextPts,
                          @ByVal UMat status);
    public native void calc(@ByVal GpuMat prevImg, @ByVal GpuMat nextImg,
                          @ByVal GpuMat prevPts, @ByVal GpuMat nextPts,
                          @ByVal GpuMat status,
                          @ByVal(nullValue = "cv::OutputArray(cv::noArray())") GpuMat err,
                          @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
    public native void calc(@ByVal GpuMat prevImg, @ByVal GpuMat nextImg,
                          @ByVal GpuMat prevPts, @ByVal GpuMat nextPts,
                          @ByVal GpuMat status);
}

//
// BroxOpticalFlow
//

/** \brief Class computing the optical flow for two images using Brox et al Optical Flow algorithm (\cite Brox2004).
 */
@Namespace("cv::cuda") public static class BroxOpticalFlow extends DenseOpticalFlow {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BroxOpticalFlow(Pointer p) { super(p); }

    public native double getFlowSmoothness();
    public native void setFlowSmoothness(double alpha);

    public native double getGradientConstancyImportance();
    public native void setGradientConstancyImportance(double gamma);

    public native double getPyramidScaleFactor();
    public native void setPyramidScaleFactor(double scale_factor);

    /** number of lagged non-linearity iterations (inner loop) */
    public native int getInnerIterations();
    public native void setInnerIterations(int inner_iterations);

    /** number of warping iterations (number of pyramid levels) */
    public native int getOuterIterations();
    public native void setOuterIterations(int outer_iterations);

    /** number of linear system solver iterations */
    public native int getSolverIterations();
    public native void setSolverIterations(int solver_iterations);

    public static native @Ptr BroxOpticalFlow create(
                double alpha/*=0.197*/,
                double gamma/*=50.0*/,
                double scale_factor/*=0.8*/,
                int inner_iterations/*=5*/,
                int outer_iterations/*=150*/,
                int solver_iterations/*=10*/);
    public static native @Ptr BroxOpticalFlow create();
}

//
// PyrLKOpticalFlow
//

/** \brief Class used for calculating a sparse optical flow.
<p>
The class can calculate an optical flow for a sparse feature set using the
iterative Lucas-Kanade method with pyramids.
<p>
\sa calcOpticalFlowPyrLK
<p>
\note
   -   An example of the Lucas Kanade optical flow algorithm can be found at
        opencv_source_code/samples/gpu/pyrlk_optical_flow.cpp
 */
@Namespace("cv::cuda") public static class SparsePyrLKOpticalFlow extends SparseOpticalFlow {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SparsePyrLKOpticalFlow(Pointer p) { super(p); }

    public native @ByVal Size getWinSize();
    public native void setWinSize(@ByVal Size winSize);

    public native int getMaxLevel();
    public native void setMaxLevel(int maxLevel);

    public native int getNumIters();
    public native void setNumIters(int iters);

    public native @Cast("bool") boolean getUseInitialFlow();
    public native void setUseInitialFlow(@Cast("bool") boolean useInitialFlow);

    public static native @Ptr SparsePyrLKOpticalFlow create(
                @ByVal(nullValue = "cv::Size(21, 21)") Size winSize,
                int maxLevel/*=3*/,
                int iters/*=30*/,
                @Cast("bool") boolean useInitialFlow/*=false*/);
    public static native @Ptr SparsePyrLKOpticalFlow create();
}

/** \brief Class used for calculating a dense optical flow.
<p>
The class can calculate an optical flow for a dense optical flow using the
iterative Lucas-Kanade method with pyramids.
 */
@Namespace("cv::cuda") public static class DensePyrLKOpticalFlow extends DenseOpticalFlow {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DensePyrLKOpticalFlow(Pointer p) { super(p); }

    public native @ByVal Size getWinSize();
    public native void setWinSize(@ByVal Size winSize);

    public native int getMaxLevel();
    public native void setMaxLevel(int maxLevel);

    public native int getNumIters();
    public native void setNumIters(int iters);

    public native @Cast("bool") boolean getUseInitialFlow();
    public native void setUseInitialFlow(@Cast("bool") boolean useInitialFlow);

    public static native @Ptr DensePyrLKOpticalFlow create(
                @ByVal(nullValue = "cv::Size(13, 13)") Size winSize,
                int maxLevel/*=3*/,
                int iters/*=30*/,
                @Cast("bool") boolean useInitialFlow/*=false*/);
    public static native @Ptr DensePyrLKOpticalFlow create();
}

//
// FarnebackOpticalFlow
//

/** \brief Class computing a dense optical flow using the Gunnar Farneback's algorithm.
 */
@Namespace("cv::cuda") public static class FarnebackOpticalFlow extends DenseOpticalFlow {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FarnebackOpticalFlow(Pointer p) { super(p); }

    public native int getNumLevels();
    public native void setNumLevels(int numLevels);

    public native double getPyrScale();
    public native void setPyrScale(double pyrScale);

    public native @Cast("bool") boolean getFastPyramids();
    public native void setFastPyramids(@Cast("bool") boolean fastPyramids);

    public native int getWinSize();
    public native void setWinSize(int winSize);

    public native int getNumIters();
    public native void setNumIters(int numIters);

    public native int getPolyN();
    public native void setPolyN(int polyN);

    public native double getPolySigma();
    public native void setPolySigma(double polySigma);

    public native int getFlags();
    public native void setFlags(int flags);

    public static native @Ptr FarnebackOpticalFlow create(
                int numLevels/*=5*/,
                double pyrScale/*=0.5*/,
                @Cast("bool") boolean fastPyramids/*=false*/,
                int winSize/*=13*/,
                int numIters/*=10*/,
                int polyN/*=5*/,
                double polySigma/*=1.1*/,
                int flags/*=0*/);
    public static native @Ptr FarnebackOpticalFlow create();
}

//
// OpticalFlowDual_TVL1
//

/** \brief Implementation of the Zach, Pock and Bischof Dual TV-L1 Optical Flow method.
 *
 * \sa C. Zach, T. Pock and H. Bischof, "A Duality Based Approach for Realtime TV-L1 Optical Flow".
 * \sa Javier Sanchez, Enric Meinhardt-Llopis and Gabriele Facciolo. "TV-L1 Optical Flow Estimation".
 */
@Namespace("cv::cuda") public static class OpticalFlowDual_TVL1 extends DenseOpticalFlow {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public OpticalFlowDual_TVL1(Pointer p) { super(p); }

    /**
     * Time step of the numerical scheme.
     */
    public native double getTau();
    public native void setTau(double tau);

    /**
     * Weight parameter for the data term, attachment parameter.
     * This is the most relevant parameter, which determines the smoothness of the output.
     * The smaller this parameter is, the smoother the solutions we obtain.
     * It depends on the range of motions of the images, so its value should be adapted to each image sequence.
     */
    public native double getLambda();
    public native void setLambda(double lambda);

    /**
     * Weight parameter for (u - v)^2, tightness parameter.
     * It serves as a link between the attachment and the regularization terms.
     * In theory, it should have a small value in order to maintain both parts in correspondence.
     * The method is stable for a large range of values of this parameter.
     */
    public native double getGamma();
    public native void setGamma(double gamma);

    /**
     * parameter used for motion estimation. It adds a variable allowing for illumination variations
     * Set this parameter to 1. if you have varying illumination.
     * See: Chambolle et al, A First-Order Primal-Dual Algorithm for Convex Problems with Applications to Imaging
     * Journal of Mathematical imaging and vision, may 2011 Vol 40 issue 1, pp 120-145
     */
    public native double getTheta();
    public native void setTheta(double theta);

    /**
     * Number of scales used to create the pyramid of images.
     */
    public native int getNumScales();
    public native void setNumScales(int nscales);

    /**
     * Number of warpings per scale.
     * Represents the number of times that I1(x+u0) and grad( I1(x+u0) ) are computed per scale.
     * This is a parameter that assures the stability of the method.
     * It also affects the running time, so it is a compromise between speed and accuracy.
     */
    public native int getNumWarps();
    public native void setNumWarps(int warps);

    /**
     * Stopping criterion threshold used in the numerical scheme, which is a trade-off between precision and running time.
     * A small value will yield more accurate solutions at the expense of a slower convergence.
     */
    public native double getEpsilon();
    public native void setEpsilon(double epsilon);

    /**
     * Stopping criterion iterations number used in the numerical scheme.
     */
    public native int getNumIterations();
    public native void setNumIterations(int iterations);

    public native double getScaleStep();
    public native void setScaleStep(double scaleStep);

    public native @Cast("bool") boolean getUseInitialFlow();
    public native void setUseInitialFlow(@Cast("bool") boolean useInitialFlow);

    public static native @Ptr OpticalFlowDual_TVL1 create(
                double tau/*=0.25*/,
                double lambda/*=0.15*/,
                double theta/*=0.3*/,
                int nscales/*=5*/,
                int warps/*=5*/,
                double epsilon/*=0.01*/,
                int iterations/*=300*/,
                double scaleStep/*=0.8*/,
                double gamma/*=0.0*/,
                @Cast("bool") boolean useInitialFlow/*=false*/);
    public static native @Ptr OpticalFlowDual_TVL1 create();
}

/** \} */

 // namespace cv { namespace cuda {

// #endif /* OPENCV_CUDAOPTFLOW_HPP */


}
