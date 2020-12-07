// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Docker
{
    /// <summary>
    /// Provides an image/tag in a Docker registry.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Docker = Pulumi.Docker;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var helloworld = new Docker.RegistryImage("helloworld", new Docker.RegistryImageArgs
    ///         {
    ///             Build = new Docker.Inputs.RegistryImageBuildArgs
    ///             {
    ///                 Context = "pathToContextFolder",
    ///             },
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// </summary>
    public partial class RegistryImage : Pulumi.CustomResource
    {
        /// <summary>
        /// See Build below for details.
        /// </summary>
        [Output("build")]
        public Output<Outputs.RegistryImageBuild?> Build { get; private set; } = null!;

        /// <summary>
        /// If true, then the Docker image won't be
        /// deleted on destroy operation. If this is false, it will delete the image from
        /// the docker registry on destroy operation.
        /// </summary>
        [Output("keepRemotely")]
        public Output<bool?> KeepRemotely { get; private set; } = null!;

        /// <summary>
        /// type of ulimit, e.g. nofile
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        [Output("sha256Digest")]
        public Output<string> Sha256Digest { get; private set; } = null!;


        /// <summary>
        /// Create a RegistryImage resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public RegistryImage(string name, RegistryImageArgs? args = null, CustomResourceOptions? options = null)
            : base("docker:index/registryImage:RegistryImage", name, args ?? new RegistryImageArgs(), MakeResourceOptions(options, ""))
        {
        }

        private RegistryImage(string name, Input<string> id, RegistryImageState? state = null, CustomResourceOptions? options = null)
            : base("docker:index/registryImage:RegistryImage", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing RegistryImage resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static RegistryImage Get(string name, Input<string> id, RegistryImageState? state = null, CustomResourceOptions? options = null)
        {
            return new RegistryImage(name, id, state, options);
        }
    }

    public sealed class RegistryImageArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// See Build below for details.
        /// </summary>
        [Input("build")]
        public Input<Inputs.RegistryImageBuildArgs>? Build { get; set; }

        /// <summary>
        /// If true, then the Docker image won't be
        /// deleted on destroy operation. If this is false, it will delete the image from
        /// the docker registry on destroy operation.
        /// </summary>
        [Input("keepRemotely")]
        public Input<bool>? KeepRemotely { get; set; }

        /// <summary>
        /// type of ulimit, e.g. nofile
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public RegistryImageArgs()
        {
        }
    }

    public sealed class RegistryImageState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// See Build below for details.
        /// </summary>
        [Input("build")]
        public Input<Inputs.RegistryImageBuildGetArgs>? Build { get; set; }

        /// <summary>
        /// If true, then the Docker image won't be
        /// deleted on destroy operation. If this is false, it will delete the image from
        /// the docker registry on destroy operation.
        /// </summary>
        [Input("keepRemotely")]
        public Input<bool>? KeepRemotely { get; set; }

        /// <summary>
        /// type of ulimit, e.g. nofile
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("sha256Digest")]
        public Input<string>? Sha256Digest { get; set; }

        public RegistryImageState()
        {
        }
    }
}
