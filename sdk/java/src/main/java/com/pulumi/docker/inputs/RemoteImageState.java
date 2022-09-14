// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.docker.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.docker.inputs.RemoteImageBuildArgs;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RemoteImageState extends com.pulumi.resources.ResourceArgs {

    public static final RemoteImageState Empty = new RemoteImageState();

    /**
     * Configuration to build an image. Please see [docker build command reference](https://docs.docker.com/engine/reference/commandline/build/#options) too.
     * 
     */
    @Import(name="build")
    private @Nullable Output<RemoteImageBuildArgs> build;

    /**
     * @return Configuration to build an image. Please see [docker build command reference](https://docs.docker.com/engine/reference/commandline/build/#options) too.
     * 
     */
    public Optional<Output<RemoteImageBuildArgs>> build() {
        return Optional.ofNullable(this.build);
    }

    /**
     * If true, then the image is removed forcibly when the resource is destroyed.
     * 
     */
    @Import(name="forceRemove")
    private @Nullable Output<Boolean> forceRemove;

    /**
     * @return If true, then the image is removed forcibly when the resource is destroyed.
     * 
     */
    public Optional<Output<Boolean>> forceRemove() {
        return Optional.ofNullable(this.forceRemove);
    }

    /**
     * The ID of the image (as seen when executing `docker inspect` on the image). Can be used to reference the image via its ID in other resources.
     * 
     */
    @Import(name="imageId")
    private @Nullable Output<String> imageId;

    /**
     * @return The ID of the image (as seen when executing `docker inspect` on the image). Can be used to reference the image via its ID in other resources.
     * 
     */
    public Optional<Output<String>> imageId() {
        return Optional.ofNullable(this.imageId);
    }

    /**
     * If true, then the Docker image won&#39;t be deleted on destroy operation. If this is false, it will delete the image from the docker local storage on destroy operation.
     * 
     */
    @Import(name="keepLocally")
    private @Nullable Output<Boolean> keepLocally;

    /**
     * @return If true, then the Docker image won&#39;t be deleted on destroy operation. If this is false, it will delete the image from the docker local storage on destroy operation.
     * 
     */
    public Optional<Output<Boolean>> keepLocally() {
        return Optional.ofNullable(this.keepLocally);
    }

    /**
     * The ID of the image in the form of `sha256:&lt;hash&gt;` image digest. Do not confuse it with the default `latest` tag.
     * 
     * @deprecated
     * Use repo_digest instead
     * 
     */
    @Deprecated /* Use repo_digest instead */
    @Import(name="latest")
    private @Nullable Output<String> latest;

    /**
     * @return The ID of the image in the form of `sha256:&lt;hash&gt;` image digest. Do not confuse it with the default `latest` tag.
     * 
     * @deprecated
     * Use repo_digest instead
     * 
     */
    @Deprecated /* Use repo_digest instead */
    public Optional<Output<String>> latest() {
        return Optional.ofNullable(this.latest);
    }

    /**
     * The name of the Docker image, including any tags or SHA256 repo digests.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the Docker image, including any tags or SHA256 repo digests.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * @deprecated
     * Is unused and will be removed.
     * 
     */
    @Deprecated /* Is unused and will be removed. */
    @Import(name="output")
    private @Nullable Output<String> output;

    /**
     * @deprecated
     * Is unused and will be removed.
     * 
     */
    @Deprecated /* Is unused and will be removed. */
    public Optional<Output<String>> output() {
        return Optional.ofNullable(this.output);
    }

    /**
     * A value which cause an image pull when changed
     * 
     * @deprecated
     * Use field pull_triggers instead
     * 
     */
    @Deprecated /* Use field pull_triggers instead */
    @Import(name="pullTrigger")
    private @Nullable Output<String> pullTrigger;

    /**
     * @return A value which cause an image pull when changed
     * 
     * @deprecated
     * Use field pull_triggers instead
     * 
     */
    @Deprecated /* Use field pull_triggers instead */
    public Optional<Output<String>> pullTrigger() {
        return Optional.ofNullable(this.pullTrigger);
    }

    /**
     * List of values which cause an image pull when changed. This is used to store the image digest from the registry when using the docker*registry*image.
     * 
     */
    @Import(name="pullTriggers")
    private @Nullable Output<List<String>> pullTriggers;

    /**
     * @return List of values which cause an image pull when changed. This is used to store the image digest from the registry when using the docker*registry*image.
     * 
     */
    public Optional<Output<List<String>>> pullTriggers() {
        return Optional.ofNullable(this.pullTriggers);
    }

    /**
     * The image sha256 digest in the form of `repo[:tag]@sha256:&lt;hash&gt;`.
     * 
     */
    @Import(name="repoDigest")
    private @Nullable Output<String> repoDigest;

    /**
     * @return The image sha256 digest in the form of `repo[:tag]@sha256:&lt;hash&gt;`.
     * 
     */
    public Optional<Output<String>> repoDigest() {
        return Optional.ofNullable(this.repoDigest);
    }

    /**
     * A map of arbitrary strings that, when changed, will force the `docker.RemoteImage` resource to be replaced. This can be used to rebuild an image when contents of source code folders change
     * 
     */
    @Import(name="triggers")
    private @Nullable Output<Map<String,Object>> triggers;

    /**
     * @return A map of arbitrary strings that, when changed, will force the `docker.RemoteImage` resource to be replaced. This can be used to rebuild an image when contents of source code folders change
     * 
     */
    public Optional<Output<Map<String,Object>>> triggers() {
        return Optional.ofNullable(this.triggers);
    }

    private RemoteImageState() {}

    private RemoteImageState(RemoteImageState $) {
        this.build = $.build;
        this.forceRemove = $.forceRemove;
        this.imageId = $.imageId;
        this.keepLocally = $.keepLocally;
        this.latest = $.latest;
        this.name = $.name;
        this.output = $.output;
        this.pullTrigger = $.pullTrigger;
        this.pullTriggers = $.pullTriggers;
        this.repoDigest = $.repoDigest;
        this.triggers = $.triggers;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RemoteImageState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RemoteImageState $;

        public Builder() {
            $ = new RemoteImageState();
        }

        public Builder(RemoteImageState defaults) {
            $ = new RemoteImageState(Objects.requireNonNull(defaults));
        }

        /**
         * @param build Configuration to build an image. Please see [docker build command reference](https://docs.docker.com/engine/reference/commandline/build/#options) too.
         * 
         * @return builder
         * 
         */
        public Builder build(@Nullable Output<RemoteImageBuildArgs> build) {
            $.build = build;
            return this;
        }

        /**
         * @param build Configuration to build an image. Please see [docker build command reference](https://docs.docker.com/engine/reference/commandline/build/#options) too.
         * 
         * @return builder
         * 
         */
        public Builder build(RemoteImageBuildArgs build) {
            return build(Output.of(build));
        }

        /**
         * @param forceRemove If true, then the image is removed forcibly when the resource is destroyed.
         * 
         * @return builder
         * 
         */
        public Builder forceRemove(@Nullable Output<Boolean> forceRemove) {
            $.forceRemove = forceRemove;
            return this;
        }

        /**
         * @param forceRemove If true, then the image is removed forcibly when the resource is destroyed.
         * 
         * @return builder
         * 
         */
        public Builder forceRemove(Boolean forceRemove) {
            return forceRemove(Output.of(forceRemove));
        }

        /**
         * @param imageId The ID of the image (as seen when executing `docker inspect` on the image). Can be used to reference the image via its ID in other resources.
         * 
         * @return builder
         * 
         */
        public Builder imageId(@Nullable Output<String> imageId) {
            $.imageId = imageId;
            return this;
        }

        /**
         * @param imageId The ID of the image (as seen when executing `docker inspect` on the image). Can be used to reference the image via its ID in other resources.
         * 
         * @return builder
         * 
         */
        public Builder imageId(String imageId) {
            return imageId(Output.of(imageId));
        }

        /**
         * @param keepLocally If true, then the Docker image won&#39;t be deleted on destroy operation. If this is false, it will delete the image from the docker local storage on destroy operation.
         * 
         * @return builder
         * 
         */
        public Builder keepLocally(@Nullable Output<Boolean> keepLocally) {
            $.keepLocally = keepLocally;
            return this;
        }

        /**
         * @param keepLocally If true, then the Docker image won&#39;t be deleted on destroy operation. If this is false, it will delete the image from the docker local storage on destroy operation.
         * 
         * @return builder
         * 
         */
        public Builder keepLocally(Boolean keepLocally) {
            return keepLocally(Output.of(keepLocally));
        }

        /**
         * @param latest The ID of the image in the form of `sha256:&lt;hash&gt;` image digest. Do not confuse it with the default `latest` tag.
         * 
         * @return builder
         * 
         * @deprecated
         * Use repo_digest instead
         * 
         */
        @Deprecated /* Use repo_digest instead */
        public Builder latest(@Nullable Output<String> latest) {
            $.latest = latest;
            return this;
        }

        /**
         * @param latest The ID of the image in the form of `sha256:&lt;hash&gt;` image digest. Do not confuse it with the default `latest` tag.
         * 
         * @return builder
         * 
         * @deprecated
         * Use repo_digest instead
         * 
         */
        @Deprecated /* Use repo_digest instead */
        public Builder latest(String latest) {
            return latest(Output.of(latest));
        }

        /**
         * @param name The name of the Docker image, including any tags or SHA256 repo digests.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Docker image, including any tags or SHA256 repo digests.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @return builder
         * 
         * @deprecated
         * Is unused and will be removed.
         * 
         */
        @Deprecated /* Is unused and will be removed. */
        public Builder output(@Nullable Output<String> output) {
            $.output = output;
            return this;
        }

        /**
         * @return builder
         * 
         * @deprecated
         * Is unused and will be removed.
         * 
         */
        @Deprecated /* Is unused and will be removed. */
        public Builder output(String output) {
            return output(Output.of(output));
        }

        /**
         * @param pullTrigger A value which cause an image pull when changed
         * 
         * @return builder
         * 
         * @deprecated
         * Use field pull_triggers instead
         * 
         */
        @Deprecated /* Use field pull_triggers instead */
        public Builder pullTrigger(@Nullable Output<String> pullTrigger) {
            $.pullTrigger = pullTrigger;
            return this;
        }

        /**
         * @param pullTrigger A value which cause an image pull when changed
         * 
         * @return builder
         * 
         * @deprecated
         * Use field pull_triggers instead
         * 
         */
        @Deprecated /* Use field pull_triggers instead */
        public Builder pullTrigger(String pullTrigger) {
            return pullTrigger(Output.of(pullTrigger));
        }

        /**
         * @param pullTriggers List of values which cause an image pull when changed. This is used to store the image digest from the registry when using the docker*registry*image.
         * 
         * @return builder
         * 
         */
        public Builder pullTriggers(@Nullable Output<List<String>> pullTriggers) {
            $.pullTriggers = pullTriggers;
            return this;
        }

        /**
         * @param pullTriggers List of values which cause an image pull when changed. This is used to store the image digest from the registry when using the docker*registry*image.
         * 
         * @return builder
         * 
         */
        public Builder pullTriggers(List<String> pullTriggers) {
            return pullTriggers(Output.of(pullTriggers));
        }

        /**
         * @param pullTriggers List of values which cause an image pull when changed. This is used to store the image digest from the registry when using the docker*registry*image.
         * 
         * @return builder
         * 
         */
        public Builder pullTriggers(String... pullTriggers) {
            return pullTriggers(List.of(pullTriggers));
        }

        /**
         * @param repoDigest The image sha256 digest in the form of `repo[:tag]@sha256:&lt;hash&gt;`.
         * 
         * @return builder
         * 
         */
        public Builder repoDigest(@Nullable Output<String> repoDigest) {
            $.repoDigest = repoDigest;
            return this;
        }

        /**
         * @param repoDigest The image sha256 digest in the form of `repo[:tag]@sha256:&lt;hash&gt;`.
         * 
         * @return builder
         * 
         */
        public Builder repoDigest(String repoDigest) {
            return repoDigest(Output.of(repoDigest));
        }

        /**
         * @param triggers A map of arbitrary strings that, when changed, will force the `docker.RemoteImage` resource to be replaced. This can be used to rebuild an image when contents of source code folders change
         * 
         * @return builder
         * 
         */
        public Builder triggers(@Nullable Output<Map<String,Object>> triggers) {
            $.triggers = triggers;
            return this;
        }

        /**
         * @param triggers A map of arbitrary strings that, when changed, will force the `docker.RemoteImage` resource to be replaced. This can be used to rebuild an image when contents of source code folders change
         * 
         * @return builder
         * 
         */
        public Builder triggers(Map<String,Object> triggers) {
            return triggers(Output.of(triggers));
        }

        public RemoteImageState build() {
            return $;
        }
    }

}
